//new 뒤에 나오는 생성자를 자바스크립트에서는 프로토타입이라고 부르고
//프로토타입은 함수로 선언하여 사용한다.
//단, 반드시 대문자로 시작해야한다.

function User(id, pw, name, age, subject = "javascript") {
  //새 객체의 properties
  this.id = id;
  this.pw = pw;
  this.name = name;
  this.age = age;
  this.subject = subject;
  //this는 생성된 객체를 참조한다.
  //각 속성은 생성된 객체의 속성이 된다.
}

//생성자 함수로 생성된 모든 객체는 공유된 프로토타입 객체를 가진다.
//프로토타입 객체를 사용하면 공통 메소드나 속성을 공유한다.
user1 = new User("abc", "1234", "짱구", 5);
user2 = new User("def", "1234", "철수", 5, "java");

console.log(user1);
console.log(user2);

//클래스 문법
class User1 {
  constructor(id, pw, name, age, subject) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
    this.subject = subject;
  }
}

const user3 = new User1('aaaa','123','유리',5,'dbms');

console.log(user3);
