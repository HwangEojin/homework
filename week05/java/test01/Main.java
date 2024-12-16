package test01;

public class Main {
	public static void main(String[] args) {							// 출력을 담당하는 메인 메소드
	       // UserVO & UserService 테스트
        UserService userService = new UserService();					// UserService 객체 생성

        UserVO user1 = new UserVO(1, "user1", "pass1", "짱구", 25);		//UserVO타입 객체 생성
        UserVO user2 = new UserVO(2, "user2", "pass2", "철수", 30);		//UserVO타입 객체 생성
        UserVO user3 = new UserVO(3, "user3", "pass3", "훈이", 35);		//UserVO타입 객체 생성

        userService.register(user1);									//UserService 클래스의 회원가입 메소드. 인수로 user1 전달
        userService.register(user2);									//UserService 클래스의 회원가입 메소드. 인수로 user2 전달
        userService.register(user3);									//UserService 클래스의 회원가입 메소드. 인수로 user3 전달

        System.out.println(userService.checkId("user1"));				//UserService 클래스의 아이디 중복 검사 메소드. 인수로 user1 전달
        System.out.println("로그인 결과: " + userService.login("user1", "pass1"));				//UserService 클래스의 로그인 메소드. 인수로 user1과 패스워드 전달
        System.out.println("로그인 실패 결과: " + userService.login("user2", "wrongpass"));		//UserService 클래스의 로그인 메소드. 인수로 user1과 잘못된 패스워드 전달

	}
}
