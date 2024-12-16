package test01;

public class Main {
	public static void main(String[] args) {
	       // UserVO & UserService 테스트
        UserService userService = new UserService();

        UserVO user1 = new UserVO(1, "user1", "pass1", "짱구", 25);
        UserVO user2 = new UserVO(2, "user2", "pass2", "철수", 30);
        UserVO user3 = new UserVO(3, "user3", "pass3", "훈이", 35);

        userService.register(user1);
        userService.register(user2);
        userService.register(user3);

        System.out.println(userService.checkId("user1"));
        System.out.println("로그인 결과: " + userService.login("user1", "pass1"));
        System.out.println("로그인 실패 결과: " + userService.login("user2", "wrongpass"));

	}
}
