let $box2 = $('.box2');
console.log($box2);

// let box1 = document.querySelector('.box1');
// console.log(box1);

// console.log($box2.parent()); //부모요소인 main요소가 선택
// console.log($box2.parents()); //조상요소인 main, body, html 요소가 선택
// console.log($box2.prev()); // 형 요소인 box1요소 선택
// console.log($box2.nextAll()); //동생 전체 box3, box4 요소 선택
// console.log($box2.nextAll()[1]); //인덱스 번호로 box4요소만 선택

//클래스 이름으로 가져온 모든 요소 중 인덱스 2번 요소 선택
console.log($('.div-box').eq(2));
console.log($('.div-box'));