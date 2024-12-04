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

@WebServlet("/boardRemove")
public class BoardRemoveController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                                          throws ServletException, IOException {
        // ?num=5
        int num=Integer.parseInt(req.getParameter("num"));
        BoardDAO dao=new BoardDAO();
        dao.deleteById(num); // 삭제성공
        // 삭제성공 후 다시 리스트 페이지로 이동?
        resp.sendRedirect("/s/boardList");
    }
}

