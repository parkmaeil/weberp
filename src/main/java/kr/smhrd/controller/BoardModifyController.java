package kr.smhrd.controller;

import kr.smhrd.entity.Board;
import kr.smhrd.repository.BoardDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardModifyGet")
public class BoardModifyController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                               throws ServletException, IOException {
       // ?num=3
        int num=Integer.parseInt(req.getParameter("num"));

        BoardDAO dao=new BoardDAO();
        Board board=dao.findById(num);
        req.setAttribute("board", board); // ${requestScope.board.num}
        // 수정화면으로 페이지를 전환(forward)
        RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/modify.jsp");
        rd.forward(req, resp);
    }
}
