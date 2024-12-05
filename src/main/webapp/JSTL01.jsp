<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="a" value="11"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<c:if test="${a%2==0}">
   짝수입니다.<br/>
</c:if>
<c:if test="${a%2!=0}">
   홀수입니다.<br/>
</c:if>

<c:forEach var="i" begin="1" end="5" step="1">
   <font size="${i}">야호~~</font><br/>
</c:forEach>
</body>
</html>
