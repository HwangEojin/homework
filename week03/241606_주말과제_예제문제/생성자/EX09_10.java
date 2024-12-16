package section09;

public class EX09_10 { // 클래스 선언
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 1, "흰색"); // 객체 생성
		Phone p2 = new Phone("아이폰", 2); // 객체 생성

		p1.phoneInfo(); // phoneInfo 메서드 호출
		p2.phoneInfo(); // phoneInfo 메서드 호출

	}

}
