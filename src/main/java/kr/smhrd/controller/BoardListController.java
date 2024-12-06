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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// JavaEE(Servlet)
@WebServlet("/boardList") // servlet-mapping
public class BoardListController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                              throws ServletException, IOException {
        // 가상으로 게시판 리스트를 만들어보자.
        BoardDAO dao=new BoardDAO();
        List<Board> blist=dao.findAll();
        // 클라이언트에게 응답 하기(View) --> JSP
        // 1. UI를 만들어서 응답(HTML)
        // 2. JSON, XNL 형태로 만들어서 응답
        // boardList.jsp 페이지와 연동(forward, dispatcher)
        req.setAttribute("blist", blist); // 객체바인딩
        // 1. 요청을 의뢰할 view(jsp)를 선택한다.
        // + ViewResolver(뷰의 경로를 만들어 주는 클래스)
        // boardList : 뷰의 논리적인 이름-->/WEB-INF/views/boardList.jsp
        String viewPage=ViewResolver.makeURL("boardList");
        RequestDispatcher rd=req.getRequestDispatcher(viewPage);
        // 2. 실제로 요청을 의뢰를 하자(forward)                 ↑
        rd.forward(req,resp); //-----------------------------|
    }
}
