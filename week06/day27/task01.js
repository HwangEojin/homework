//1. 학생의 정보를 저장하는 객체를 만들고 그 학생의 정보를 출력하기
//학생정보 : 이름, 나이, 성적(1과목)
//1) 객체에 최소 3명의 데이터를 추가하고 이름과 성적 출력하기
//2) 객체에서 이름 키에 해당하는 값들만 출력하기
//3) 객체에 새로운 속성(학년)을 추가하고 객체 전체 출력하기(for문 사용)
// function student(name,age,grade) {
//   this.name = name,
//   this.age= age,
//   this.grade= grade
// };
const student = {
  student1: {
    name: "죠셉",
    age: 20,
    grade: "A",
  },
  student2: {
    name: "쿠죠",
    age: 20,
    grade: "A",
  },
  student3: {
    name: "죠린",
    age: 20,
    grade: "A",
  },
};


student.student1.level = 2;
student.student2.level = 2;
student.student3.level = 2;

for (let key of Object.keys(student.student1)) {
  console.log("객체의 key는", key);
}
for (let [key, value] of Object.entries(student)) {
  console.log(key, value);
}

//2. 배열의 모든 요소를 2배로 증가시켜 새로운 배열을 만들어 출력하기
const numbers = [1, 2, 3, 4, 5];
//1) 2배 증가시켜 새로운 배열로 출력하기
//2) 배열의 길이를 구하고 출력하기
//3) 배열에서 특정요소를 삭제하기(3) 메소드 사용
//4) 배열에서 특정 값(cat)을 검색하고 그 값의 인덱스 출력하기
const animals = ["dog", "cat", "rabbit"];
//5) 배열의 첫번째와 마지막요소를 제거한 뒤 남은 배열 출력하기
const colors = ["red", "blue", "green", "yellow"];

const copyArr = [];
for (let index = 0; index < numbers.length; index++) {
  copyArr.push(numbers[index]*2);
  console.log(copyArr);
}
console.log(copyArr.length);
console.log(numbers.splice(2,1));
console.log(animals.indexOf("cat"));
console.log(colors.pop());
console.log(colors.shift());
console.log(colors);

//3. 혼합문제
//1) 배열의 요소를 객체로 변환하여 새로운 배열을 만들기
//  주어진 배열의 값을 객체의 value 속성으로 저장할것
const data = [10, 20, 30];

const object ={};
object.value = data;
console.log(object,"object");

//2) 배열을 활용하여 특정값을 기준으로 객체 업데이트하기
const users = [
  { id: 1, name: "짱구", age: 5, subject: "javascript" },
  { id: 2, name: "철수", age: 5, subject: "javascript" },
  { id: 3, name: "맹구", age: 5, subject: "javascript" },
];

//id가 2인 객체의 나이를 6으로 변경, subject를 'web표준'으로 변경







//3) 배열의 요소를 모두 더하여 총합 출력하기
const numbers2 = [2, 5, 20, 10];
let sum = 0;
for (const element of numbers2) {
  sum += element;
}
console.log(sum);
