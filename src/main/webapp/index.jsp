<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<!--  1~10까지 총합?(Java) -->
<%
 kr.smhrd.util.MyCalc my=new kr.smhrd.util.MyCalc(); // 객체생성
 int sum=my.hap();
%>
<table border="1">
 <tr>
   <td>총합</td>
   <td><%=sum%></td>
 </tr>
</table>
</body>
</html>