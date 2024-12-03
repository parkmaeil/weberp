package kr.smhrd.controller;

import kr.smhrd.entity.Board;

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
        List<Board> blist=new ArrayList<Board>();
        // 게시물 3개를 생성해서 List 담기(add)
        Board b1=new Board(1, "자바 스프링","자바 스프링","관리자",10);
        blist.add(b1);
        blist.add(new Board(2, "오라클","오라클","홍길동",15));
        // 클라이언트에게 응답 하기(View) --> JSP
        // 1. UI를 만들어서 응답(HTML)
        // 2. JSON, XNL 형태로 만들어서 응답
        // boardList.jsp 페이지와 연동(forward, dispatcher)
        req.setAttribute("blist", blist); // 객체바인딩
        // 1. 요청을 의뢰할 view(jsp)를 선택한다.
        RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/boardList.jsp");
        // 2. 실제로 요청을 의뢰를 하자(forward)                 ↑
        rd.forward(req,resp); //-----------------------------|
    }
}
