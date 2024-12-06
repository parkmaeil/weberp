package kr.smhrd.controller;

import kr.smhrd.config.ViewResolver;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardRegisterGet")
public class BoardRegisterController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                               throws ServletException, IOException {
        // forward
        String viewPage= ViewResolver.makeURL("register");
        RequestDispatcher rd =req.getRequestDispatcher(viewPage);
        rd.forward(req,resp);
    }
}
