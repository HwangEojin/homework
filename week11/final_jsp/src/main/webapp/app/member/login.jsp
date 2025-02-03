<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인 페이지</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/login.css" />
</head>
<body>
	<div class="login-wrapper">
		<div class="login-image">
			<img src="${pageContext.request.contextPath}/assets/img/login.webp"
				alt="로그인 페이지 이미지" />
		</div>
		<div class="login-form-container">
			<div class="login-form">
				<h1>로그인</h1>
				<!-- login처리 경로잡기 -->
				<form action="/member/loginOk.me" method="post">
					<div class="input-group">
						<label for="id">아이디</label> <input type="text" id="id"
							name="memberId" required />
					</div>
					<div class="input-group">
						<label for="password">비밀번호</label> <input type="password"
							id="password" name="memberPassword" required />
					</div>
					<div class="input-group checkbox-wrap">
						<input type="checkbox" id="remember" name="remember" value="check" />
						<label for="remember">아이디 기억하기</label>
					</div>
					<button type="submit">로그인</button>
				</form>
			</div>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/login.js"></script>
</html>
