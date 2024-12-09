package section10.access2;
import section10.access1.*; // access1의 모든 클래스를 사용하기 위한 import

public class PublicB { // 클래스 선언

	public static void main(String[] args) { // 메인 메소드
//		PublicA a = new PublicA(10);				// 객체 생성
//		a.printA();									// 메서드 호출

		DefaultC c = new DefaultC(); // <--- error : the type PublicA is not visible
		// c.variableC = 10 : <- 필드가 public이더라도 객체를 생성하지 못하기 때문에 사용할 수 없습니다.
	}
}
