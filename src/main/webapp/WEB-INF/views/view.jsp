<%@ page contentType="text/html; charset=utf-8" %>
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
     function goFn(mode, num){
        console.log(mode);
        if(mode=="L"){
           location.href="/s/boardList"; // 리스트보기
        }else if(mode=="U"){
           location.href="/s/boardModifyGet?num="+num; // GET
        }else if(mode=="D"){
           location.href="/s/boardRemove?num="+num; // GET
        }
     }
  </script>
</head>
<body>

<div class="container mt-5">
  <h2>Board View</h2>
    <table class="table table-bordered">
      <tr>
        <td>번호</td>
        <td>${board.num}</td>
      </tr>
      <tr>
        <td>제목</td>
        <td>${board.title}</td>
      </tr>
      <tr>
        <td>내용</td>
        <td>${board.content}</td>
      </tr>
      <tr>
        <td>작성자</td>
        <td>${board.writer}</td>
      </tr>
    </table>
    <button type="button" class="btn btn-primary btn-sm" onclick="goFn('L')">목록</button>
    <button type="button" class="btn btn-warning btn-sm" onclick="goFn('U',${board.num})">수정</button>
    <button type="button" class="btn btn-danger btn-sm" onclick="goFn('D',${board.num})">삭제</button>
</div>

</body>
</html>