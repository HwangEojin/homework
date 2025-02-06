$(document).ready(function () {
    let $fileInput = $('#file');
    let $fileList = $('.file-list');
    let $cnt = $('.cnt');
    let cnt = 0;

    console.log($fileInput);

    // 기존 이미지 삭제 기능
    $(".delete-file-btn").on("click", function () {
        let fileName = $(this).data("filename");
        let confirmDelete = confirm("정말로 이 이미지를 삭제하시겠습니까?");
        
        if (confirmDelete) {
            $(this).closest(".img-box").remove(); // UI에서 삭제
            $("<input>")
                .attr("type", "hidden")
                .attr("name", "deletedFiles")
                .val(fileName)
                .appendTo("#update-form"); // 삭제된 파일 정보 추가
        }
    });

    // 새 파일 추가 및 미리보기
    $fileInput.on('change', function () {
        let files = this.files;

        // 기존 미리보기 초기화
        $fileList.html('');

        // 파일 개수 제한 (1개)
        if (files.length > 1) {
            alert("파일은 최대 1개까지만 첨부 가능합니다.");
            let dt = new DataTransfer();
            this.files = dt.files;
            $cnt.text(0);
            return;
        }

        for (let i = 0; i < files.length; i++) {
            let src = URL.createObjectURL(files[i]);
            $fileList.append(`<li>
                <div class="show-img-box">
                    <img src=${src}>
                </div>
                <div class="btn-box">
                    <button type='button' class='img-cancel-btn' data-name='${files[i].name}'>삭제</button>
                </div>
            </li>`);
        }

        $cnt.text(files.length);

        // 삭제 버튼 처리
        $(".img-cancel-btn").on("click", function () {
            let fileName = $(this).data("name");
            let files = $fileInput[0].files;
            let dt = new DataTransfer();

            for (let i = 0; i < files.length; i++) {
                if (files[i].name !== fileName) {
                    dt.items.add(files[i]);
                }
            }

            $fileInput[0].files = dt.files;
            $(this).closest("li").remove();
            $cnt.text($fileInput[0].files.length);
        });
    });

    // 취소 버튼 처리
    $(".cancel-btn").on("click", function () {
        let boardNumber = $("#boardNumber").val();
        window.location.href = `/board/read?boardNumber=${boardNumber}`;
    });

    // 폼 제출 시 확인창
    $("#update-form").on("submit", function (e) {
        let confirmSubmit = confirm("게시글을 수정하시겠습니까?");
        if (!confirmSubmit) {
            e.preventDefault();
        }
    });
});
