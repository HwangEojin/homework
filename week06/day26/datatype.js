console.log(3.14, typeof(3.14));
console.log(Infinity, typeof(Infinity));
console.log(Infinity, typeof(-Infinity));
console.log(NaN, typeof(NaN));


//number 타입으로 형변환
let str1 = '123';
let str2 = 'abc';
let num1 = Number(str1);
let num2 = Number(str2);
console.log(str1, typeof str1, typeof num1);
console.log(str2, typeof str2, typeof num2);


//string

console.log("Hello" , typeof("Hello"));
console.log('Hello' , typeof('Hello'));
console.log(`Hello` , typeof(`Hello`));

let numStr = String(num1);
console.log(numStr, typeof numStr);

//boolean
console.log(true, typeof true);
console.log(false, typeof false);
console.log(Boolean(" ", typeof Boolean(" ")));
console.log(Boolean("", typeof Boolean("")));


// 논리적으로 참 / 거짓으로 취급되는 값
//Falsy
// false, 0 ,-0, "" ,null, undefined, NaN ...
//Truthy

//true 와 false : Boolean 타입의 명확한 값으로 참과 거짓을 나타낸다
//Falsy 와 Truthy : 특정 값들이 논리적 평가에서 어떻게 처리되는지 설명하는 개념


//Symbol
console.log(Symbol(), typeof Symbol());
console.log(Symbol("description"), typeof Symbol("description"));
let sym1 = Symbol("id");
let sym2 = Symbol("id");

console.log(sym1 == sym2);
console.log(sym1 === sym2);


console.log(1 == '1');

//object 객체 : 키 - 값 쌍의 집합

let person = {name : 'H' , age : 20, isStudent: false};
console.log(person.name);

let arr = [1,2,3];
console.log(arr, typeof arr);

//function

function printNum(){
  console.log(1 , typeof 1);
}

console.log(printNum, typeof printNum);