<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*"%>
<%@ page import="kr.smhrd.entity.*"%>
<%
   // request객체에 연결된 blist를 가져오기?
   List<Board> blist=(List<Board>)request.getAttribute("blist");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Board List</h2>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
    <% for(Board vo :  blist){  %>
      <tr>
        <td><%=vo.getNum()%></td>
        <td><%=vo.getTitle()%></td>
        <td><%=vo.getWriter()%></td>
        <td><%=vo.getCount()%></td>
      </tr>
    <% } %>
    </tbody>
  </table>
</div>
</body>
</html>