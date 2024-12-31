let testImg = document.getElementsByClassName("test-img");
let bigImgWrap = document.getElementsByClassName("big-img-wrap");
console.log(testImg);
//모든 이미지 요소에 클릭 이벤트를 주기위해 반복문 사용
for(let i = 0; i < testImg.length; i++){
  // console.log(testImg[i]);
  testImg[i].addEventListener('click', function(){
    let src = this.getAttribute("src");
    console.log(src);
    console.log(this);

    let bigImg = document.querySelector(".big-img");
    // console.log(bigImg);
    bigImg.setAttribute("src", src);
    bigImgWrap[0].style.display = "flex";
  });

  bigImgWrap[0].addEventListener("click", function(){
    this.style.display = "none";
  });
}