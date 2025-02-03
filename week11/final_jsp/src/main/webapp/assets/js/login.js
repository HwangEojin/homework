
// js로 req객체에 직접 접근하는 것은 불가능하다.
// 그러나 브라우저 주소창에 있는 쿼리스트링을 가져와 쓸 수 있다.
// window -> 브라우저
// location -> 주소창
// window.location.search 에 쿼리스트링이 저장되어 있다.
console.log(window.location.search);
console.log(location.search);
let queryString = location.search;

//URLSearchParams 객체는 쿼리스트링을 해석해준다.
const urlParams = new URLSearchParams(queryString);

const login = urlParams.get('login');

if(login == 'fail'){
	alert('잘못된 정보입니다.');
}