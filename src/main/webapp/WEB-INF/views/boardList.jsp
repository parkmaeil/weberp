<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  <script>
     function goRegister(){
       // alert("클릭됨");
       // 글쓰기 화면을 보여 달라고 컨트롤러에게 요청
       location.href="/s/boardRegisterGet"; // GET
     }
  </script>
</head>
<body>
<div class="container mt-5">
  <h2>Board List(JSTL+EL)</h2>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>조회수</th>
        <th>작성일</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="vo" items="${blist}">
      <tr>
        <td>${vo.num}</td>
        <td><a href="/s/boardView?num=${vo.num}">${vo.title}</a></td>
        <td>${vo.writer}</td>
        <td>${vo.count}</td>
        <td>${vo.indate}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <button class="btn btn-primary btn-sm" onclick="goRegister()">글쓰기</button>
</div>
</body>
</html>