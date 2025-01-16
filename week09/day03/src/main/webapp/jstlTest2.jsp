<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--
	<h1>JSTL 태그</h1>
	<c:set var="name" value="홍길동"></c:set>
	<c:set var="age" value="20" />

	<c:out value="${name}"></c:out>
	<c:out value="${age}"></c:out>

	<c:if test="${age >= 20}">
		<p>성인입니다.</p>
	</c:if>

	<c:choose>
		<c:when test="${age < 10 }">
			<p>어린이 입니다.</p>
		</c:when>
		<c:when test="${age < 18 }">
			<p>청소년 입니다.</p>
		</c:when>
		<c:otherwise>
			<p>성인 입니다.</p>
		</c:otherwise>
	</c:choose>

	  <c:set var="fruits" value="${['사과','바나나','체리'] }"></c:set>
      <ul>
         <c:forEach var="fruit" items="${fruits}">
            <li>${fruit}</li>
         </c:forEach>
      </ul> --%>

	<input type="hidden" name="id" value="admin">
	<c:set var="id" value="${id}"></c:set>;

	<c:choose>
		<c:when test="${id=='admin'}">
			<h1>
				<c:out value="${id}"></c:out>
			</h1>

		</c:when>

		<c:when test="${id =='member'}">
			<h1>
				<c:out value="${id}"></c:out>
			</h1>

		</c:when>
		<c:otherwise>
			<h1>
				<c:out value="로그인 안됨"></c:out>
			</h1>
		</c:otherwise>
	</c:choose>




</body>
</html>