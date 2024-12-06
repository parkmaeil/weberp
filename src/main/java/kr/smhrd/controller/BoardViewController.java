package kr.smhrd.controller;

import kr.smhrd.config.ViewResolver;
import kr.smhrd.entity.Board;
import kr.smhrd.repository.BoardDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardView")
public class BoardViewController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                                          throws ServletException, IOException {
        // ?num=3
        int num=Integer.parseInt(req.getParameter("num"));
        BoardDAO dao=new BoardDAO();
        Board board=dao.findById(num);
        // 상세보기 페이지로 forward
        req.setAttribute("board", board);
        String viewPage= ViewResolver.makeURL("view");
        RequestDispatcher rd =req.getRequestDispatcher(viewPage);
        rd.forward(req, resp); //--------------------------------------------|
    }
}