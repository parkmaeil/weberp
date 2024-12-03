package kr.smhrd.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardRegisterPost")
public class BoardRegisterPostController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                               throws ServletException, IOException {
       // title, content, content
       String title=req.getParameter("title");
       String content=req.getParameter("content");
       String writer=req.getParameter("writer");
       
    }
}
