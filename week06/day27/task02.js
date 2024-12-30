// 1. 나이가 19살 이상이면 입장가능, 19살 미만이면 입장 불가 출력
// 나이가 10살이면 당첨을 출력하고 아니면 다음기회에 출력
// 본인이름, 나이는 상수로 설정, 삼항연산자 사용할 것

//출력결과
// 본인이름님은 00살 입장가능여부는 결과
// 이벤트 당첨여부
//출력
const myName = "EojinHwang";
const myAge = 27;
function event(name, age) {
  if (age >= 19) {
    console.log(`${name}님은 ${age}살 입장가능 여부는 가능`);
  } else if(age === 10) {
    console.log(`${name}님은 ${age}살 입장가능 여부는 불가능`);
  } 
  age ===10 ? console.log("이벤트 당첨여부 : 당첨") : console.log("이벤트 당첨여부 : 다음기회에")
}
event(myName, myAge);

//2. 점수가 60점 이상이면 합격, 60점 미만이면 불합격출력
// 점수가 100점이면 장학생, 아니면 일반학생 출력
// 학생이름, 점수는 상수로 설정

const stuName = "EojinHwang";
const score = 100;

function grade(name, score) {
  if (score >= 60) {
    console.log(`${name}님은 합격`);
  } else {
    console.log(`${name}님은 불합격`);
  }
  score === 100 ? console.log("장학생") : console.log("일반학생");
}
grade(stuName, score);


//3. 학생의 이름과 성적을 입력받아서 성적에 따른 학점 출력
// 90점 이상 : A, 80점 이상 : B,  70점이상 : C, 그외 : F

const studentName = "EojinHwang";
const myScore = 100;
function gradePoint(name, score) {
  if (score >= 90) {
    console.log(`${name}님의 학점은 A`);
  } else if (score >= 80) {
    console.log(`${name}님의 학점은 B`);
  } else if (score >= 70) {
    console.log(`${name}님의 학점은 C`);
  } else {
    console.log(`${name}님의 학점은 F`);
  }
}

gradePoint(studentName, myScore);

//4. 1부터 100까지의 숫자중 3, 6, 9의 배수 합계 출력
function sum() {
  let sum = 0;  
  for (let i = 1; i <= 100; i++) {
    if (i % 3 === 0 || i % 6 === 0 || i % 9 === 0) {
      sum += i;
    }
  } 
  console.log("3, 6, 9의 배수의 합계는", sum);
}
sum();
