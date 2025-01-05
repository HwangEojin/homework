const todoMenu = document.querySelectorAll(".todoMenu");
const addBtn = document.querySelector("#add-button");
const checkbox = document.querySelectorAll("input[type=checkbox]");

//할 일 추가
addBtn.addEventListener("click", (e) => {
  console.log("clicked");
  const todoList = document.createElement("li");
  todoList.innerHTML = `<input type='checkbox' class='checkbox'> <input type = 'text' class='task' placeholder='뭘 해야하더라?'> <button class='delete'><i class="fa-solid fa-trash"></i></button>`;
  document.querySelector("#task-list").appendChild(todoList);
});

//체크 박스 클릭시 취소선
document.querySelector("#task-list").addEventListener("change", (e) => {
  if (e.target.classList.contains("checkbox")) {
    e.target.closest("li").classList.toggle("completed");
  }
});

//상단 메뉴 변경
todoMenu.forEach((menu) => {
  menu.addEventListener("click", (e) => {
    console.log("Menu changed");
    todoMenu.forEach((item) => item.classList.remove("selected"));
    menu.classList.add("selected");
  });
});

//할 일 삭제
document.querySelector("#task-list").addEventListener("click", (e) => {
  if (e.target.closest(".delete")) {
    confirm("정말 삭제합니까?")
      ? e.target.closest("li").remove()
      : alert("취소되었습니다.");
  }
});
