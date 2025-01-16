<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>결과페이지</h1>
   <h1><%= request.getAttribute("userId") %></h1>
   <h1><%= request.getAttribute("userPw") %></h1>
   <h1><%= request.getAttribute("userName") %></h1>
   <h1><%= request.getAttribute("userAge") %></h1>
   <h1><%= request.getAttribute("userGender") %></h1>
</body>
</html>