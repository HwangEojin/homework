<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- css, img, js 등의 파일을 우리 이클립스 기준으로 경로를 잡는게 아니라
우리가 만든 파일들도 웹상에 같이 올라가기 때문에 url 경로로 잡아야한다
루트 경로를 우리가 설정한 /day05_mvcTest로 직접 명시하면 나중에 루트가 바뀌었을 때 전부 수정해야한다
jstl에서 제공하는 ${pageContext.request.contextPath}를 사용하여 루트 경로를 설정한다
 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/member/login.css" />
</head>
<body>
	<main>
		<form action="${pageContext.request.contextPath}/member/loginOk.me" method="post">
			<div class="id">
				id : <input type="text" name="memberId" />
			</div>
			<div class="password">
				pw : <input type="password" name="memberPassword" />
			</div>
			<div class="btn">
				<button>로그인</button>
			</div>
		</form>	
	</main>
</body>
</html>