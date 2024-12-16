package section07;

public class EX07_06 {
	public static void main(String[] args) {
		Car c = new Car();										// 객체 생성
		System.out.println("wheel 의 개수는 " + c.wheel + "개 입니다.");//필드 값 출력
	
		c.wheel =5; //c.객체의 데이터인 wheel의 데이터 값을 5로 변경
		System.out.println("wheel의 개수는 " + c.wheel + "개 입니다."); // 출력
		
	}
	
}
