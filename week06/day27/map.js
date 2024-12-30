/// let newArray = 배열명.map(callback(element[,index[,array]][,thisArgs]))

let arr1 = [1,2,3,4,5,6,7,8,9,10];
console.log(arr1);

//배열의 각 요소에 2를 곱한 값을 새로운 배열로 반환
const newArr1 = arr1.map(element=> element * 2
);
console.log(newArr1);

//배열의 각 요소(문자열)를 문자열의 길이만 담은 새로운 배열로 반환
const arr2 = ['java','dbms','javascript','web'];
console.log(arr2[0].length);
const newArr2 = arr2.map(element => element.length);
console.log(newArr2);

//배열의 각 객체의 특정 프로퍼티 값을 새로운 배열로 반환

const users= [
  {name: '짱구',age :6  },
  {name: '철수',age :8  },
  {name: '훈이',age :7  },
  {name: '유리',age :5  },
]
console.log(users);

const name = users.map(element => element.name);
console.log(name);

//배열의 각 요소에 인덱스를 추가하여 새로운 배열로 반환
const number = [1, 2, 3, 4, 5];
const numberIdx = number.map(function (element, index){
  // return element;
  // return index;
  // return [element, index];
  return {element : element, index:index};
});

console.log(number);
console.log(numberIdx);

const numberIdx2 = number.map(function(element,index,array){
  return element;
})
console.log(numberIdx2);

//thisArgs는 콜백함수 내에서 this 키워드를 사용할 때 참조할 객체를 지정할 수 있다.
const mul = {multi : 2};

const numberIdx3 = number.map(function(element,index,array){
  return {
    element :element * this.multi,
    index : index,
    array : array
  }
},mul);
console.log(numberIdx3);