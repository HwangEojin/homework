package homework;

public class EX08_11 {
	public static void main(String[] args) {
		EX08_11 hong = new EX08_11();	//객체 생성
		hong.introduce("홍길동", 20);		// 이름과 나이를 전달하는하여 결과물을 출력하는 메소드 호출
		hong.hello();					// 인수를 전달하지 않는 메소드 호출
	}
	
	void introduce(String name, int age) {	//이름과 나이를 매개변수로 받는 메소드 생성
		System.out.println("제 이름은 " + name + "이고, 나이는" + age + "세 입니다."); //출력
	}
	
	void hello() { //매개변수가 없는 메소드 생성
		System.out.println("안녕하세요."); // 출력
	}
	
}
