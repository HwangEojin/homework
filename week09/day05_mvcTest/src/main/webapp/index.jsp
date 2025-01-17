<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/layout.css"> --%>
</head>
<body>
	<c:choose>
		<c:when test= "${not empty sessionScope.memberDTO}">
			<h1>${sessionScope.memberDTO.memberName}님 환영합니다!</h1>
			<form action="" method="">
				<button>logout</button>
			</form>
		</c:when>
		<c:otherwise>
			<form action="${pageContext.request.contextPath}/member/join.me" method="get">
				<button>회원가입</button>
			</form>
			<a href="http://localhost:8888/day05_mvcTest/member/login.me">로그인 하러가기</a>
		</c:otherwise>
	</c:choose>
</body>
</html>