package section10.access1; //section10 하위 패키지로 access1 생성

public class PublicA { // 클래스 선언

	public int a;	// 접근 제한자가 public 변수 a 선언

	public PublicA(int a) {	// 접근 제한자가 public인 메소드 선언, 매개변수 int 타입
		this.a = a;
	}
	public void printA() {// 접근 제한자가 public인 메소드 선언, 매개변수 int 타입
		System.out.println("PublicA 클래스의 printA() 메서드 입니다.");
	}

//	DefaultC dc = new DefaultC(); // 접근 제한자 defaul인 객체 생성
//
//	void methodA() { // 메소드 선언
//		dc.variableC = 20; // public으로 선언된 필드도 객체를 통해 접근 가능
//	}

}
