<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
	<div class="header">
		<div class="header-left">
			<h1>자유게시판</h1>
		</div>
		<div class="header-right">
			<div class="btn-group">
				<c:choose>
					<c:when test="${empty sessionScope.memberNumber}">
						<!-- 로그인 페이지 이동 처리 -->
						<a href="${pageContext.request.contextPath}/member/login.me"
							class="login-btn">로그인</a>
						<!-- 회원가입 페이지 이동 처리 -->
						<a href="${pageContext.request.contextPath}/member/join.me"
							class="join-btn">회원가입</a>
					</c:when>
					<c:otherwise>
						<a href="${pageContext.request.contextPath}/member/logoutOk.me"
							class="logout-btn">로그아웃</a>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
</header>
