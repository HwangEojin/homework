// const newArray = 배열명.filter(callback(element[,index[,array]][,thisArgs]))

//1부터 10까지 요소중 짝수 요소만 필터링
const numbers = [1,2,3,4,5,6,7,8,9,10];

const even = numbers.filter(Element=>Element%2===0);
console.log(even);

//짝수 인덱스의 요소만 출력
const evenIdx = numbers.filter(index => index % 2 ===0);
console.log(evenIdx);

//배열의 짝수 요소를 두배로 만든 새로운 배열 생성
const evenVal = numbers.filter(Element => Element %2 ===0).map(Element=>Element * 2);
console.log(evenVal,"even");
