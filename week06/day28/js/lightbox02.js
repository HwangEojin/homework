let testButton = document.querySelectorAll(".img-box > button");
let bigImgWrap = document.getElementsByClassName("big-img-wrap");

for (let i = 0; i < testButton.length; i++) {
  testButton[i].addEventListener("click", function () {
    bigImgWrap[0].style.display = "flex";

    let src = this.getAttribute("data-src");
    let bigImg = document.querySelector(".big-img");
    bigImg.setAttribute("src", src);
  });
}

bigImgWrap[0].addEventListener("click", function () {
  this.style.display = "none";
});
