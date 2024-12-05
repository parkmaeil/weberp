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
</head>
<body>

<div class="container mt-5">
  <h2>Board Modify</h2>
  <form action="/s/boardModifyPost" method="post">
    <input type="hidden" name="num" value="${board.num}"/>
    <div class="form-group">
      <label for="title">제목:</label>
      <input type="text" class="form-control" id="title" value="${board.title}" name="title">
    </div>
    <div class="form-group">
      <label for="content">내용:</label>
      <textarea rows="7" class="form-control" id="content" name="content">${board.content}</textarea>
    </div>
    <button type="submit" class="btn btn-primary btn-sm">수정</button>
    <button type="reset" class="btn btn-warning btn-sm">취소</button>
  </form>
</div>

</body>
</html>