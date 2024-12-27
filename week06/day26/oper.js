//1) 관계연산자
// ==, != : 값만 비교, 문자열일 경우 자동으로 파싱
// ===, !== : 값과 타입 비교

let data1 = "1";
let data2 = 1;
console.log(data1, typeof data1, data2, typeof data2);

console.log(data1 == data2); //true
console.log(data1 === data2); //false

//false로 취급되는 값 : "", '', ``, 0, 0.0, null, undefined
console.log("", Boolean(""), '', Boolean(''), ``, Boolean(``));
console.log(Boolean(0), Boolean(0.0), '', Boolean(null), ``, Boolean(undefined));

let data;
console.log(data, typeof data); //undefined undefined
if(data){
  console.log("true의 값");
}else{
  console.log("false값");
}
