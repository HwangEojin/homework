let printAll = function (num) {
  console.log(num);
};

printAll(100);

//매개변수로 전달한 값이 짝수라면 + 10한 값을 출력
// 아니라면 전달된 값만 출력
// result 변수 , 익명 함수 이용

let result = function (foo) {
  if (typeof foo === Number && foo % 2 === 0) {
    return foo + 10;
  } else {
    return foo;
  }
}


result(10);

setTimeout(function(){
  console.log("2초뒤 출력")
},2000);