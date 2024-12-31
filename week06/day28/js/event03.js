const input = document.querySelector("input[type=button]");
const p = document.querySelector("p");

console.log(input, p);

input.addEventListener("click",()=>{
  with(p.style){
    //javascript에서 객체의 프로퍼티를 더 간단하게 접근 할 수 있게 해주는 구문으로
    // 특정 객체를 지정하여 그 객체의 프로퍼티를 코드 블럭안에서 직접 참조할 수 있다.

    fontSize = '30px';
    border = '2px dashed blue';
    width = '100px';
    backgroundColor= 'skyblue';
  }
  p.style.fontSize = "30px";

})