//배열 리터럴 대괄호를 사용한 배열 생성

//Array()생성자 함수로 배열생성
let arr1 = [];

console.log(arr1,typeof arr1);

//배열 내부에 값 삽입(배열 내부 데이터 타입이 달라도 배열 생성 가능)
arr1[0] = 10;
arr1[1] = '가나다';
arr1[10] = true;
console.log(arr1,typeof arr1);

//초기값 할당
let arr2 = [1,2,3];
console.log(arr2 ,typeof arr2);
console.log(arr2.length);

//배열 크기 지정한 배열 생성(콤마 개수만큼 배열이 생성)
let arr3 = [,,,];
console.log(arr3,arr3.length);

//Array() 생성자 함수로 배열 생성
let arr4  = new Array();
console.log(arr4,arr4.length);

arr4[0] = '사과';
arr4[1] = '체리';
arr4[2] = '복숭아';
arr4[3] = '귤';
console.log(arr4, typeof arr4);

//Array() 생성자 함수로 초기값 할당
let arr5 = new Array("0번째 인덱스", 1, true);
console.log(arr5);

//Array() 생성자 함수로 칸 수 지정
let arr6 = new Array(10);
console.log(arr6, arr6.length);

//배열 순회시 사용할 수 있는 반복문
//for ...in , for ...of

let arr7 = ['a','b','c','d'];

for(let i in arr7){
  console.log(i);
  console.log(arr7[i]);
}

for(let i of arr7){
  console.log(i);
}