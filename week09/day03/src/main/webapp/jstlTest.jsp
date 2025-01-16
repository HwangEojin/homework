<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>결과출력</h1>
<%--    <h3><%= request.getAttribute("name") %></h3> --%>
   <h3>${name}</h3>
   <!-- 서블릿에서 담아준 name => 짱구 -->
   <% pageContext.setAttribute("name", "홍길동"); %>
   <h3>${name}</h3>
   <!-- jsp 파일에서 담아준 name => 홍길동 -->
   <h3>${param.name}</h3>
   <!-- 서블릿에서 쿼리스트링으로 전달한 ?name => 철수 -->
   <h3>${requestScope.name}</h3>
   <!-- 서블릿에서 담아준 name => 짱구 -->
</body>
</html>