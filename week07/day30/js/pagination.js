//한 페이지당 표시될 게시물 수 5개
const pageSize = 5;
//총 게시물 수 20개
const totalItems = 20;
//전체 페이지 수 Math.ceil 올림함수 21/5 = 5
const totalPages = Math.ceil(totalItems / pageSize);

//게시물을 표시할 컨테이너와 페이지 네비게이션을 표시할 컨테이너를 DOM에서 가져온다
const contentContainer = document.getElementById("content");
const paginationContainer = document.getElementById("pagination-container");
const pagination = document.getElementById("pagination");
//페이지 요소를 생성할 ul태그 생성

//게시물 생성함수
function createPost(content){
  const post = document.createElement("div");
  post.classList.add("post");
  post.textContent = content;
  return post;
}

//페이지 번호 클릭 시 이벤트 핸들러
function onPageClick(event){
  const currentPage = parseInt(event.target.textContent);
  //해당 페이지에 표시할 게시물 보여지는 함수 호출
  showPage(currentPage);
  //페이지 네비게이션 업데이트 함수 호출
  updatePagination(currentPage);
}

//페이지에 해당하는 게시물 표시 함수
function showPage(page){
  contentContainer.innerHTML = ""; //현재 표시된 게시물 초기화
  const startIdx = (page - 1) * pageSize; //현재 페이지의 시작 인덱스 계산
  const endIdx = Math.min(startIdx + pageSize, totalItems); //현재 페이지의 마지막 인덱스 계산
  //시작 인덱스부터 마지막 인덱스까지 반복하면서 게시물 생성 및 추가
  for(let i = startIdx; i< endIdx; i++){
    const post = createPost(`게시물 ${i+1}`); //게시물 생성
    contentContainer.appendChild(post); //게시물 컨테이너 추가
  }
}

//페이지 네비게이션 업데이트 함수
function updatePagination(currentPage){
  //모든 페이지 번호에서 active 클래스 제거
  paginationContainer.querySelectorAll("li").forEach(item => {
    item.classList.remove('active');
  });

  //현재 페이지 번호에 'active' 클래스 추가
  paginationContainer.querySelector(`li:nth-child(${currentPage})`).classList.add('active');
}

//페이지 번호 생성 및 이벤트 핸들러 추가
for(let i = 1; i <= totalPages; i++){
  const li = document.createElement("li") //<li>요소 생성
  li.textContent = i; //페이지 번호 생성

  if(i === 1){
    li.classList.add('active'); //첫페이지에 active 클래스 추가
  }

  li.addEventListener("click", onPageClick); //페이지 번호 클릭 이벤트 핸들러 추가
  pagination.appendChild(li); //페이지 번호를 <ul>자식 요소로 <li>요소 추가
}

paginationContainer.appendChild(pagination);
showPage(1);