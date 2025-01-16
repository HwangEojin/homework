<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>로그인</h1>
   <form action="resultServelt2" method="post">
   <!-- 아이디 입력 -->
      <label for="userId">아이디 : </label>
      <input type="text" id="userId" name="userId" required><br>
      
   <!-- 비밀번호 입력 -->
      <label for="userPw">비밀번호 : </label>
      <input type="password" id="userPw" name="userPw" required><br>
      
   <!-- 로그인 버튼 -->
      <button type="submit">로그인</button>
   </form>
</body>
</html>