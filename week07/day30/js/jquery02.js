let $boxes = $('.div-box');
console.log($boxes);

console.log($boxes[2]);
//jquery 객체에서 인덱스를 사용하여 접근한 요소는 일반적인 DOM요소로 반환된다.
//따라서 jquery 객체가 아닌 순수 DOM 객체이다.

// let element = $boxes[1];
// console.log(element);

// element.style.background ='red';

console.log($boxes.eq[2]);
$boxes.eq(2).css('background-color','red');

//jquery 변수를 이용하여 css를 변경할 떄는 .css() 메소드를 상용한다.


//jquery 이용하여 사용할것
//1. li태그 전체 가져오기
let $list = $('li') ;
console.log($list);

//2. 클래스 이름이 product인 태그 전체 가져오기
let $product = $('.product') ;
console.log("클래스 이름이 product인 태그 : ",$product);

//3. 자식 태그 중 첫번째 자식 가져오기
let $ul = $('ul') ;
console.log("자식 태그 중 첫번째 자식 : ",$ul.children().first());

//4. ul 태그의 부모태그 가져오기
console.log("ul의 부모 : ",$ul.parent());

//5. li태그의 부모태그 가져오기
console.log("li의 부모 : ",$list.parent());

//6. ul 태그 자식 중에서 0번째 인덱스 가져오기
console.log("ul 태그 자식 중에서 0번째 인덱스 : ",$ul.children().eq(0));

//7. ul 태그 자식 중에서 2번째 인덱스 가져오기
console.log("ul 태그 자식 중에서 2번째 인덱스 : ",$ul.children().eq(2));
