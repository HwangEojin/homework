// function getAge (age, num){
//   console.log(age, typeof age);
//   console.log(num, typeof num);
//   return age + num;
// }
function getAge (name, age, num=1){
  console.log(name, typeof name);
  console.log(age, typeof age);
  console.log(num, typeof num);
  return age + num;
}



function introduce(id, pw, nm ='admin'){
  console.log(id,'아이디');
  console.log(pw,'패스워드');
  console.log(nm, '사용자 이름');
}


//가변 매개 변수  : 함수 호출시 매개변수의 개수를 알 수 없을 떄

function printAdd(... numbers){
  console.log(numbers ,typeof numbers);

  // for (let i = 0; i < numbers.length; i++) {
  //   console.log(numbers[i]);
  // }

  for(let i in numbers){
    console.log(numbers[i]);
  }

};

printAdd(1,2,3,'a');


function showNumber(num){
  console.log(`showNUmber 함수실행`);
  console.log(`num : ${num}`);
  return num;
}

console.log(showNumber(10));

function decrease(number){
  console.log('decrease 함수 호출');
  return number -1;
}

console.log(decrease(10));



// 13번 : 내용 공유 참고!!
//1) 일반함수
//매개변수 x 리턴값 x
function showHello(){
  console.log(`hello`);
}

showHello();

//매개변수 o 리턴값 x
function showGreet(greeting){
  console.log(`인사말 : ${greeting}`);
}

showGreet("안녕하세요");
showGreet("안녕히계세요");

//매개변수 x 리턴값 o
function multiply(){
  return 10 * 20;
}

console.log(multiply());
let result = multiply();
console.log(result);

//매개변수 o 리턴값 o
function multi(num1, num2){
  return num1 * num2;
}

console.log(multi(5, 2));
let result2 = multi(10, 5);
console.log(result2);

// 디폴트매개변수가 있다면 인수를 디폴트 매개변수만큼 적게 넣어도 된다
// 가변 매개변수를 사용한다면 배열형태로 출력된다