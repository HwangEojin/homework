/*const fileInput = document.querySelector('#file');
const fileList = document.querySelector('.file-list');
const submitBtn = document.querySelector('.submit-btn');

// 파일 선택 시 파일 목록 추가
fileInput.addEventListener('change', (e) => {
  const files = e.target.files;

  for (let i = 0; i < files.length; i++) {
    const li = document.createElement('li');
    li.textContent = files[i].name;
    fileList.appendChild(li);
  }
});

// 폼 제출 시 파일 유효성 검사
submitBtn.addEventListener('click', (e) => {
  e.preventDefault();

  const files = fileInput.files;

  for (let i = 0; i < files.length; i++) {
    if (!validateFile(files[i].name)) {
      alert('올바른 파일 형식이 아닙니다.');
      return;
    }
  }

  // TODO: 서버로 폼 데이터 전송
});

// 파일 유효성 검사 함수
function validateFile(fileName) {
  const allowedExtensions = /(\.jpg|\.jpeg|\.png|\.gif)$/i;
  return allowedExtensions.exec(fileName);
}
*/

let $fileInput = $('#file');
let $fileList = $('.file-list');
let $cnt = $('.cnt');
let cnt = 0;

console.log($fileInput);

// 첨부파일 미리보기 처리
$fileInput.on('change', function(){
	let files = this.files;
	//console.log(files);
	
	//파일을 변경하면 원래 선택된 파일의 미리보기를 사라지게 처리
	$fileList.html('');

	//5개를 넘기면 초기화 처리 //dt는 아래에서 설명
	if(files.length > 5){
		let dt = new DataTransfer();
		this.files= dt.files;
		console.log(files);
		alert("파일은 최대 5개까지만 첨부 가능합니다.")
		$cnt.text(files.length);
		return;
	}
	
	for(let i=0; i <files.length; i++){
		let src = URL.createObjectURL(files[i]);
		//console.log(files[i].name);
		//console.log('-------');
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
	
	//첨부파일 삭제 버튼 처리
	//클릭 이벤트가 페이지 로딩시 걸리는것이 아니라 이미지가 생성되면 걸려야하므로
	//미리보기 이미지를 생성하는 함수에서 작성한다.
	let $cancelBtns = $('.img-cancel-btn');
	console.log($cancelBtns);
	$cancelBtns.on('click', function() {
		//버튼의 부모의 부모를 삭제
		//console.log($(this).parent().parent())
		$(this).parent().parent().remove();
		
		//위 처리는 단순히 화면에서 미리보기를 지운것이고 input에 files 프로퍼티에는 
		//여전히 파일이 남아있다. 이렇게되면 서버로 해당파일이 전송된다.
		//console.log($fileInput);
		//console.log($fileInput[0].files);
		
		//그러므로 실제 데이터를 지우는 처리를 해준다.
		//jquery의 data()는 data- 속성 값을 가져온다.
		let fileName = $(this).data('name');
		
		let files = $fileInput[0].files;
		
		// files 프로퍼티에 저장할 files객체를 만들기 위해 DataTransfer를 사용한다.
		// files 프로퍼티의 타입은 FileList타입인데 이 파일리스트를 만들기 위한 
		//유일한 방법이 DataTransfer를 이용하는 것이다.
		let dt = new DataTransfer();
		
		for(let i=0; i<files.length; i++){
			if(files[i].name !== fileName){
				dt.items.add(files[i]);
			}
		}
		
		//우리가 만든 files를 실제 첨부파일로 저장한다.
		$fileInput[0].files = dt.files;
		console.log($fileInput[0].files);

		$cnt.text($fileInput[0].files.length);
	});	
});


// 취소 버튼 처리
$cancel = $('.cancel-btn');

$cancel.on('click', () => {
	window.location.href = '/board/boardListOk.bo';
});