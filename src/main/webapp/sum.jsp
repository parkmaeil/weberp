<%@ page contentType="text/html; charset=utf-8" %>
<%!
   public int hap(){
       int sum=0;
       for(int i=1;i<=10;i++){
          if(i%2==0){
             sum+=i;
          }//
       }//
       return sum;
   }
%>
<%
    int result=hap();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <%-- 여기에 결과를 출력하세요.  --%>
  결과 : <%=result%>
</body>
</html>