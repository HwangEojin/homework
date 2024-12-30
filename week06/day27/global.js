//전역 객체에 num 변수를 선언
globalThis.num;
console.log(globalThis.num);
let num1 = 10;
let num2 = 20;

function changeNumber(num1 , num2){
  globalThis.num = num1; //globalthis를 통해 전역변수 num을 num1값으로 설정
  console.log(globalThis.num);

  num1 = num2;
  num2 = globalThis.num;
  console.log(num1,num2);
  
}

changeNumber(num1,num2);
console.log(globalThis.num);

//globalThis 객체를 사용해서 전역변수를 설정하고 함수 내부에서 변수 값을 변경
//globalThis는 자바스크립트 환경에 따라 전역 객체에 접근하는 방법이 달라
//코드 이식성이 떨어지는 것을 극복하기 위해 도입된 표준화된 방법 (ES11에서 도입된 표준 객체)

//globalThis를 이용한 전역 문자열
globalThis.str = "Hello"; // 전역 객체에 str 변수를 선언
console.log(globalThis.str);  // hello

function data(){
  globalThis.str = "값 변경";
  let number = "숫자";  //블록 스코프의 변수

};
console.log(data());
// console.log(number); // ReferenceError : number is not defined;
console.log(globalThis.str);  // 전역 객체에 변수를 설정할 수 있고, 함수밖에서도 접근 가능하다.
