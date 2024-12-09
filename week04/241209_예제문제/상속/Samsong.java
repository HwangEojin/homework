package section10;

public class Samsong extends Computer{		//상속관계 자식 클래스 선언

	@Override
	void powerOn() {						// 오버라이드 메서드
		super.powerOn(); 					// 부모 클래스의 powerOn 메서드 호출
		System.out.println("아이 러브 샘성");	// 출력
	}
	
}
