<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>자유게시판</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/boardList.css" />
</head>
<body>
	<jsp:include page="/header.jsp" />
	<%-- 	<header>
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
	</header> --%>
	<div class="container">
		<div class="write-btn-wrap">
			<!-- 글쓰기 페이지 이동 처리 -->
			<a href="${ pageContext.request.contextPath }/board/boardWrite.bo"
				class="write-btn">글쓰기</a>
		</div>
		<div class="board-list">
			<div class="board-header">
				<div class="board-header-item">번호</div>
				<div class="board-header-item">제목</div>
				<div class="board-header-item">작성자</div>
				<div class="board-header-item">날짜</div>
				<div class="board-header-item">조회수</div>
			</div>
			<div class="board-body">
				<!-- ========== 게시글 목록 예시 =========== -->
				<c:choose>
					<c:when test="${not empty boardList}">
						<c:forEach var="board" items="${boardList}">
							<div class="board-row">
								<div class="board-item no">
									<c:out value="${board.getBoardNumber()}" />
								</div>
								<div class="board-item title">
									<!-- 제목 클릭 시 상세 페이지로 이동 -->
									<a
										href="${pageContext.request.contextPath}/board/boardRead.bo?boardNumber=${board.boardNumber}">
										<c:out value="${board.boardTitle}" />
									</a>
								</div>
								<div class="board-item author">
									<c:out value="${board.getMemberId()}" />
								</div>
								<div class="board-item date">
									<c:out value="${board.getBoardDate()}" />
								</div>
								<div class="board-item hit">
									<c:out value="${board.getBoardReadCount()}" />
								</div>
							</div>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<div>
							<div colspan="5" align="center">등록된 게시물이 없습니다.</div>
						</div>
					</c:otherwise>
				</c:choose>
				<%-- 디버깅 코드 +++ 제대로 못불러올 때 반드시 호가인할 것
				<p>boardList: ${boardList}</p>
				<c:if test="${not empty boardList}">
					<p>게시글 목록 크기: ${fn:length(boardList)}</p>
					<!-- fn 사용하기 위해 맨 최상단에 functions 불러오고 사용 -->
					<c:forEach var="board" items="${boardList}">
						<p>번호: ${board.boardNumber}, 제목: ${board.boardTitle}, 작성자:
							${board.memberId}</p>
					</c:forEach>
				</c:if>
				<c:if test="${empty boardList}">
					<p>boardList가 비어 있습니다.</p>
				</c:if> 
				--%>
				<!-- ========== /게시글 목록 예시 =========== -->
			</div>
		</div>
		<div class="pagination">
			<ul>
				<!-- ========== 페이징 처리 예시 ============ -->
				<!-- 				<li><a href="#" class="prev">&lt;</a></li>
				<li><a href="#" class="active">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" class="next">&gt;</a></li> -->
				<c:if test="${prev}">
					<li><a
						href="${pageContext.request.contextPath}/board/boardListOk.bo?page=${startPage - 1}"
						class="prev">&lt;</a></li>
				</c:if>
				<c:forEach var="i" begin="${startPage}" end="${endPage}">
					<c:choose>
						<c:when test="${!(i == page)}">
							<li><a
								href="${pageContext.request.contextPath}/board/boardListOk.bo?page=${i}">
									<c:out value="${i}" />
							</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="#" class="active"> <c:out value="${i}" />
							</a></li>
						</c:otherwise>
					</c:choose>

				</c:forEach>
				<c:if test="${next}">
					<li><a
						href="${pageContext.request.contextPath}/board/boardListOk.bo?page=${endPage + 1}"
						class="next">&gt;</a></li>
				</c:if>
				<!-- ========== /페이징 처리 예시 ============ -->
			</ul>


		</div>

		<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


		<!-- ++++++ -->
		<script>
			let memberNumber = "${sessionScope.memberNumber}";
		</script>
		<!-- ++++++ -->

		<script
			src="${pagetContext.request.contextPath}/assets/js/boardRead.js"></script>
</body>
</html>