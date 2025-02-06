$(document).ready(function() {
	// 게시글 번호 및 사용자 번호 가져오기
	const listBtn = $(".list-btn");
	const boardNumber = listBtn.data("boardnumber"); // HTML의 data-boardnumber 값
	const memberNumber = listBtn.data("memberNumber"); // JSP에서 전역 변수로 전달된 값

	// 디버깅: boardNumber와 memberNumber 확인
	console.log("확인 boardNumber:", boardNumber);
	console.log("memberNumber:", memberNumber);

	/*if (!boardNumber || !memberNumber) {
		console.error("boardNumber 또는 memberNumber가 올바르게 설정되지 않았습니다.");
		return;
	}*/

	// 목록 이동 버튼
	listBtn.on("click", () => {
		window.location.href = "/board/boardListOk.bo";
	});

	// 수정 버튼
	$(".modify-btn").on("click", () => {
		window.location.href = `/board/boardUpdate.bo?boardNumber=${boardNumber}`;
	});

	// 삭제 버튼
	$(".delete-btn").on("click", () => {
		if (confirm("정말 삭제하시겠습니까?")) {
			$.ajax({
				url: `/board/boardDeleteOk.bo?boardNumber=${boardNumber}`,
				type: "GET",
				success: () => {
					alert("게시글이 삭제되었습니다.");
					window.location.href = "/board/boardListOk.bo";
				},
				error: (xhr, status, error) => {
					console.error("게시글 삭제 실패:", error);
					alert("게시글 삭제에 실패했습니다.");
				}
			});
		}
	});




	// 댓글 작성 (fetch)
	document.querySelector(".submit-btn")?.addEventListener("click", async function() {
		const content = document.querySelector("#content").value.trim();
		if (!content) {
			alert("댓글 내용을 입력해주세요.");
			return;
		}

		try {
			const response = await fetch("/reply/replyWriteOk.re", {
				method: "POST",
				headers: { "Content-Type": "application/json; charset=utf-8" },
				body: JSON.stringify({ boardNumber, memberNumber, replyContent: content })
			});

			const result = await response.json();
			if (result.status === "success") {
				alert("댓글이 작성되었습니다.");
				document.querySelector("#content").value = "";
				loadReplies();
			} else {
				alert("댓글 작성에 실패했습니다.");
			}
		} catch (error) {
			console.error("댓글 작성 실패:", error);
			alert("댓글 작성 중 오류가 발생했습니다.");
		}
	});

	// 댓글 삭제 (fetch, 이벤트 위임)
	document.querySelector(".comment-list").addEventListener("click", async function(event) {
		if (event.target.matches(".comment-delete")) {
			const replyNumber = event.target.dataset.number;
			if (confirm("댓글을 삭제하시겠습니까?")) {
				try {
					const response = await fetch(`/reply/replyDeleteOk.re?replyNumber=${replyNumber}`, { method: "GET" });
					const result = await response.json();
					if (result.status === "success") {
						alert("댓글이 삭제되었습니다.");
						loadReplies();
					} else {
						alert("댓글 삭제에 실패했습니다.");
					}
				} catch (error) {
					console.error("댓글 삭제 실패:", error);
					alert("댓글 삭제 중 오류가 발생했습니다.");
				}
			}
		}
	});

	//댓글 수정 준비 (fetch)
	document.querySelector(".comment-list").addEventListener("click", function(event) {
		if (event.target.matches(".comment-modify-ready")) {
			const li = event.target.closest("li");
			const contentDiv = li.querySelector(".comment-content");
			const originalContent = contentDiv.textContent.trim();

			contentDiv.innerHTML = `<textarea class="modify-content">${originalContent}</textarea>`;
			event.target.closest(".comment-btn-group").innerHTML = `
	                <button type="button" class="comment-modify" data-number="${event.target.dataset.number}">수정 완료</button>
	            `;
		}
	});

	//댓글 수정 완료 (fetch)
	document.querySelector(".comment-list").addEventListener("click", async function(event) {
		if (event.target.matches(".comment-modify")) {
			const replyNumber = event.target.dataset.number;
			const newContent = event.target.closest("li").querySelector(".modify-content").value.trim();

			if (!newContent) {
				alert("댓글 내용을 입력해주세요.");
				return;
			}

			try {
				const response = await fetch("/reply/replyUpdateOk.re", {
					method: "POST",
					headers: { "Content-Type": "application/json; charset=utf-8" },
					body: JSON.stringify({ replyNumber, replyContent: newContent })
				});

				const result = await response.json();
				if (result.status === "success") {
					alert("댓글이 수정되었습니다.");
					loadReplies();
				} else {
					alert("댓글 수정에 실패했습니다.");
				}
			} catch (error) {
				console.error("댓글 수정 실패:", error);
				alert("댓글 수정 중 오류가 발생했습니다.");
			}
		}
	});

	//댓글 목록 로드 (fetch)
	async function loadReplies() {
		try {
			const response = await fetch(`/reply/replyListOk.re?boardNumber=${boardNumber}`);
			if (!response.ok) throw new Error("댓글 목록을 불러오는 데 실패했습니다.");
			const replies = await response.json();
			renderReplies(replies);
		} catch (error) {
			console.error("댓글 목록 불러오기 실패:", error);
			alert("댓글 목록을 불러오는데 실패했습니다.");
		}
	}

	//댓글 렌더링
	function renderReplies(replies) {
		const commentList = document.querySelector("#comment-list");
		commentList.innerHTML = "";

		if (replies.length === 0) {
			commentList.innerHTML = "<li>댓글이 없습니다.</li>";
			return;
		}

		replies.forEach(reply => {
			const isMyComment = reply.memberNumber == memberNumber;
			const li = document.createElement("li");
			li.innerHTML = `
	                <div class="comment-info">
	                    <span class="writer">${reply.memberId}</span>
	                    <span class="date">${reply.replyDate}</span>
	                </div>
	                <div class="comment-content-wrap">
	                    <div class="comment-content">${reply.replyContent}</div>
	                    ${isMyComment ? `
	                        <div class="comment-btn-group">
	                            <button type="button" class="comment-modify-ready" data-number="${reply.replyNumber}">수정</button>
	                            <button type="button" class="comment-delete" data-number="${reply.replyNumber}">삭제</button>
	                        </div>
	                    ` : ""}
	                </div>`;
			commentList.appendChild(li);
		});
	}

	// 초기 댓글 로드
	loadReplies();
});


// 댓글 작성
/* $(".submit-btn").on("click", function () {
	 const content = $("#content").val().trim();
	 if (!content) {
		 alert("댓글 내용을 입력해주세요.");
		 return;
	 }

	 // 디버깅: 댓글 작성 요청 데이터 확인
	 console.log("댓글 작성 요청 데이터:", {
		 boardNumber: boardNumber,
		 memberNumber: memberNumber,
		 replyContent: content
	 });

	 $.ajax({
		 url: "/reply/replyWriteOk.re",
		 type: "POST",
		 contentType: "application/json; charset=utf-8",
		 data: JSON.stringify({
			 boardNumber: boardNumber,
			 memberNumber: memberNumber,
			 replyContent: content
		 }),
		 success: () => {
			 alert("댓글이 작성되었습니다.");
			 $("#content").val(""); // 입력란 초기화
			 loadReplies(); // 댓글 목록 새로고침
		 },
		 error: (xhr, status, error) => {
			 console.error("댓글 작성 실패:", error);
			 alert("댓글 작성에 실패했습니다.");
		 }
	 });
 });

 // 댓글 삭제
 $(".comment-list").on("click", ".comment-delete", function () {
	 const replyNumber = $(this).data("number");
	 if (confirm("댓글을 삭제하시겠습니까?")) {
		 $.ajax({
			 url: `/reply/replyDeleteOk.re?replyNumber=${replyNumber}`,
			 type: "GET",
			 success: () => {
				 alert("댓글이 삭제되었습니다.");
				 loadReplies();
			 },
			 error: (xhr, status, error) => {
				 console.error("댓글 삭제 실패:", error);
				 alert("댓글 삭제에 실패했습니다.");
			 }
		 });
	 }
 });

 // 댓글 수정 준비
 $(".comment-list").on("click", ".comment-modify-ready", function () {
	 const li = $(this).closest("li");
	 const contentDiv = li.find(".comment-content");
	 const originalContent = contentDiv.text().trim();

	 contentDiv.replaceWith(`<textarea class="modify-content">${originalContent}</textarea>`);
	 $(this).closest(".comment-btn-group").html(`
		 <button type="button" class="comment-modify" data-number="${$(this).data("number")}">수정 완료</button>
	 `);
 });

 // 댓글 수정 완료
 $(".comment-list").on("click", ".comment-modify", function () {
	 const replyNumber = $(this).data("number");
	 const newContent = $(this).closest("li").find(".modify-content").val().trim();

	 if (!newContent) {
		 alert("댓글 내용을 입력해주세요.");
		 return;
	 }

	 $.ajax({
		 url: `/reply/replyUpdateOk.re`,
		 type: "POST",
		 contentType: "application/json; charset=utf-8",
		 data: JSON.stringify({
			 replyNumber: replyNumber,
			 replyContent: newContent
		 }),
		 success: () => {
			 alert("댓글이 수정되었습니다.");
			 loadReplies();
		 },
		 error: (xhr, status, error) => {
			 console.error("댓글 수정 실패:", error);
			 alert("댓글 수정에 실패했습니다.");
		 }
	 });
 });

 // 댓글 목록 로드
 function loadReplies() {
	 $.ajax({
		 url: `/reply/replyListOk.re?boardNumber=${boardNumber}`,
		 type: "GET",
		 dataType: "json",
		 success: (replies) => {
			 renderReplies(replies);
		 },
		 error: (xhr, status, error) => {
			 console.error("댓글 목록 불러오기 실패:", error);
			 alert("댓글 목록을 불러오는데 실패했습니다.");
		 }
	 });
 }

 // 댓글 렌더링
 function renderReplies(replies) {
	 const commentList = $("#comment-list");
	 commentList.empty();

	 if (replies.length === 0) {
		 commentList.append("<li>댓글이 없습니다.</li>");
		 return;
	 }

	 replies.forEach((reply) => {
		 const replyHTML = `
			 <li>
				 <div class="comment-info">
					 <span class="writer">${reply.memberId}</span>
					 <span class="date">${reply.replyDate}</span>
				 </div>
				 <div class="comment-content-wrap">
					 <div class="comment-content">${reply.replyContent}</div>
					 ${reply.memberNumber === memberNumber
			 ? `
					 <div class="comment-btn-group">
						 <button type="button" class="comment-modify-ready" data-number="${reply.replyNumber}">수정</button>
						 <button type="button" class="comment-delete" data-number="${reply.replyNumber}">삭제</button>
					 </div>
					 `
			 : ""}
				 </div>
			 </li>`;
		 commentList.append(replyHTML);
	 });
 }
 // 초기 댓글 로드
 loadReplies();
});
*/
