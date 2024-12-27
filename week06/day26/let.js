let data1 = "let변수";
console.log(data1, typeof data1);

data1 = "data1 변수값 수정";
console.log(data1, typeof data1);

data1 = 100;
console.log(data1, typeof data1);

// let data1 = '값 수정 중';   < 재선언 불가

// console.log(data2, typeof data2);
let data2 = "let 두번째 변수 두번째";

//  Hoisting : Javascript에서 변수와 함수 선언을 코드의 최상단으로 끌어올리는 것을 의미
//  코드를 실행하기 전 , 변수 함수 등에 선언이 메모리에 저장되기 때문에 가능
//  var로 선언된 변수는 선언과 동시에 undefined로 초기화 되고 이후에 값으로 할당된다.
// 따라서 var로 선언된 변수는 선언전에도 접근 가능하며 undefined의 값을 가진다.
// let과 const는 Hoisting이 되지만 초기화는 되지 않는다.
// 선언 전에 접근 하려고 하면 참조 에러(Reference Error)기 빌셍힌다.
