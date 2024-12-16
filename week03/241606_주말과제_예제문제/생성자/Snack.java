package section09;
//예제 9-1 ~ 9-3 예제 공통 코드
public class Snack {			// class 생성
	int price ; 				//field값 가격 선언
	
	Snack(int p){				// 직접 선언한 생성자
		price = p;				// 매개변수로 받은 값을 필드 price에 대입
	}
	
	
	void info() {				// return 값이 없는 메소드 생성
		System.out.println("과자의 가격은" + price + "입니다.");	// 출력
	}
	
	
	
	
	
	
}
