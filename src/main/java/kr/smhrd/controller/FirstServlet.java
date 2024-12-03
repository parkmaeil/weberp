package kr.smhrd.controller;
import kr.smhrd.util.MyCalc;

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
        // 1. 클라이언트의 요청(GET, POST)을 받기
        int su1=Integer.parseInt(req.getParameter("su1")); // su1="5" -> 5
        int su2=Integer.parseInt(req.getParameter("su2")); // su2="500" -> 500
        // 2. 처리(직접처리보다는 Model과 연동) : 비즈니스로직
        // 1~100=?
        MyCalc my=new MyCalc();
        int sum=my.hap(su1, su2);
        // 3. 요청한 클라이언트로 응답하는 부분(View) : 프리젠테이션로직 --> JSP
                             // MIME type
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("총합:"+sum); // 총합:5050
        out.println("</body>");
        out.println("</html>");
    }
}
