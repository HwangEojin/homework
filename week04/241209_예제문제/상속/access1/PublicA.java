package section10.access1;

//import section10.DefaultC;

public class PublicA {							// 클래스 생성
	public int a;								// 필드 생성

	public PublicA(int a) {						// 생성자 (매개변수로 숫자를 입력받음)
		this.a = a;
	}
	
	public void printA() {						// 메소드
		System.out.println("PublicA 클래스의 printA() 메서드 입니다.");
	}
	
	
//	DefaultC dc = new DefaultC();			// 같은 패키지이기 때문에 객체 생성 가능
//	void methodA() {
//		dc.variableC= 20;					// public으로 선언된 필드도 객채를 통해 접근 가능ㄴ
//	}
//	
	

}
