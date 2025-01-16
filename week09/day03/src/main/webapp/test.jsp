<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 태그</title>
</head>
<body>
	<!-- 선언문 : JSP 내에서 전역변수와 메소드 선언 -->

	<%!int num1 = 15;
	int num2 = 20;

	int multiply() {
		return num1 * num2;
	}%>


	<!-- 표현식 : 변수와 메소드 결과 출력 -->
	<h2>
		num1 :
		<%=num1%></h2>
	<h2>
		num2 :
		<%=num2%></h2>

</body>
</html>