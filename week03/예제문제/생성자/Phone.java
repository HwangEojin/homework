package homework;

public class Phone {		// class 생성
	
	String brand;			// field 선언
	int series;				// field 선언
	String color = "검정색";	// field 선언
	
	Phone(String b, int s, String c) { // 모든 field 값을 매개변수로 받는 생성자
		brand = b;						// brand에 매개변수 b 할당
		series =s;						// series에 매개변수 s 할당
		color = c;						// color에 매개변수 c 할당
	}
	
	void phoneInfo() {				// return 타입이 void인 메소드 선언
		System.out.println(color + " " +brand + " " + series);	// 출력
	}

}
