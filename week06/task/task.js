// 1. 매개변수로 두 숫자를 전달받아 합을 반환하는 함수를 작성하기
// (디폴트 매개변수 1개 사용 기본값 10)

// 일반함수 사용, addNumbers
function addNumbers(num1, num2=10){
  return num1+ num2;
}
// 2. 숫자의 제곱을 계산하는 함수 작성하기
//  익명함수 사용, square
function square(num){
  return num * num;
}
// 3. 가변매개변수를 사용하여 전달받은 모든 숫자의 합 계산하기

//  sumAll1 일반함수
// sumAll2 익명함수

const sumAll1 = function (num){
  console.log(`print  익명함수 : ${result}`);
}

// 4. 콜백함수를 매개변수로 받아 두 숫자를 전달하고 연산결과(사칙연산 모두) 출력하는 oper 만들기








// 5. 사용자 데이터를 배열로 받아 20살 이상인 사용자만 필터링 하는 newUser 함수 만들기
let user = [ 
  { name: '짱구', age: 25 },
  { name: '철수', age: 18 },
  { name: '훈이', age: 30 }
]

function newUser(param){
  for (let i of param) {
    
    console.log(i.age);
  }

}

newUser(user)


// ### newUser함수는 두개의 매개변수를 받는다
// users : 사용자 이름 배열(ex : [ { name: '짱구', age: 25 }, { name: '철수', age: 18 }, { name: '훈이', age: 30 } ])
// callback : 데이터를 처리할 함수

//6. 비동기 작업 체인

// ### 세 가지 작업을 수행하는 step1, step2, step3가 있습니다. 각 함수는 1초 후에 실행하고 runStep 함수에서 각 단계가 완료되면 다음단계로 넘어가고 마지막에는 모든 함수 호출 완료를 출력한다