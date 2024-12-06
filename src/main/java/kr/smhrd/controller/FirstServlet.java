package kr.smhrd.controller;
import kr.smhrd.util.MyCalc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 일반자바클래스-->웹에서 실행가능한 클래스(Servlet) 변경
// JavaEE API(servlet-api.jar)
// Servlet(Controller) - 클라이언트의 요청을 받아서 처리하는 역할
@WebServlet("/fs") // servlet-mapping
public class FirstServlet extends HttpServlet {
    // 서블릿의 메인 메서드
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
                                  throws ServletException, IOException {

        RequestDispatcher rd =req.getRequestDispatcher("/WEB-INF/views/template.jsp");
        rd.forward(req, resp);
    }
}
