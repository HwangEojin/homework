var data = "10";
var data2 = 10;
console.log(data, typeof data);
console.log(data2, typeof data2);

var data = 20;
console.log(data);

// Hoisting : 선언의 위치에 상관없이 존재하면 메모리에 할당된다
// 초기화 작업은 호이스팅 되지 않고 , 선언만 호이스팅 된다.

var data3 ='값 절대 수정 금지';

console.log(data3, typeof data3);

var data3 = 2025;

console.log(data3, typeof data3);