<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/header.jsp" />
	<form id="write-form"
		action="${pageContext.request.contextPath}/board/boardUpdateOk.bo"
		method="post" enctype="multipart/form-data">

		<!-- 폼안에 히든으로 번호 넣기 -->
		<input type="hidden" name="boardNumber"
			value="${board.getBoardNumber()}"> <label for="title">제목</label>
		<input type="text" id="title" name="boardTitle"
			value="${board.getBoardTitle()}" required /> <label for="author">작성자</label>
		<!-- 작성자 서버 연결시 로그인한 회원 아이디로 수정하기 -->
		<div class="writer">
			<c:out value="${board.getMemberId()}" />
		</div>


		<!-- 줄바꾸면 안됨!! -->
		<label for="content">내용</label>
		<textarea id="content" name="boardContent" required><c:out
				value="${board.getBoardContent()}" /></textarea>
</body>
</html>