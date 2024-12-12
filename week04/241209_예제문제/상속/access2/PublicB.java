package section10.access2;

public class PublicB {									// 클래스 선언
	public static void main(String[] args) {			// 메인 메소드
//		PublicA a = new PublicA(10);					// 객체 생성 및 초기화
//		a.printA();										// a 메소드 호출
		
//		DefaultC = new DefaultC();						// <- 에러 : The type PublicA is not visible
														// c.variableC = 10; <- 필드가 public이더라도 객체를 생성하지 못하기 때문에 사용할 수 없음
	}

}
