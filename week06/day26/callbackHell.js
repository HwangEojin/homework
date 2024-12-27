//콜백지옥
function getUser(userId, callback) {
  setTimeout(() => {
    console.log(`사용자 ${userId}의 데이터 가져오기 완료`);
    callback({ id: userId, name: "짱구" });
  }, 1000);
}

function getPosts(userId, callback) {
  setTimeout(() => {
    console.log(`사용자 ${userId}의 게시물가져오기 완료`);
    callback(["포스트1", "포스트2", "포스트3"]);
  }, 1000);
}

function getComments(post, callback) {
  setTimeout(() => {
    console.log(`${post}의 댓글 가져오기 완료`);
    callback(["댓글1", "댓글2", "댓글3", "댓글4"]);
  }, 1000);
}

getUser(1, (user) => {
  console.log(`사용자이름 : ${user.name}`);
  getPosts(user.id, (posts) => {
    console.log(`게시물 : ${posts}`);
    getComments(posts[0], (comments) => {
      console.log(`댓글 : ${comments}`);
      console.log("작업완료");
    });
  });
});
