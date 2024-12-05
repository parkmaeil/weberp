package kr.smhrd.controller;

import kr.smhrd.entity.Board;
import kr.smhrd.repository.BoardDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardModifyPost")
public class BoardModifyPostController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                               throws ServletException, IOException {
       req.setCharacterEncoding("utf-8");
       // num, content, content
       int num=Integer.parseInt(req.getParameter("num"));
       String title=req.getParameter("title");
       String content=req.getParameter("content");

       // 클라이언트에서 받은 데이터를 하나(DTO)의 구조로 묶어준다.
       // -> 파라메터 수집(DTO)
       Board board=new Board();
       //board.setNum(num);
       board.setTitle(title);
       board.setContent(content);

        BoardDAO dao=new BoardDAO();
        //dao.update(board); // 등록 -> 성공
        dao.update(num,board);

        // 수정성공 후에 다시 어디로 가야될까? /boardVView
        // 등록이 끝났으나까 리스트를 보여주는 컨트롤러로 요청을 돌려줄께 거기서 응답을 해줄께야
        resp.sendRedirect("/s/boardView?num="+num);
    }
}
