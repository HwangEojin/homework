package homework;

public class EX08_07 {
	public static void main(String[] args) {
		EX08_07 myBook = new EX08_07();			// 객체
		myBook.count(3); 						//mybook 인스턴스 count 메서드 호출
		myBook.sum(5,3);						//mybook 인스턴스 sum 메소드 호출 5,3을 인수로 전달
		myBook.sum(10,7);						//mybook 인스턴스 sum 메소드 호출 10,7을 인수로 전달
		
	}
	
	void count(int bookNum) {					//int bookNum 의 매개변수를 가지고 return 값이 없는 메소드 생성
		System.out.println("책은" + bookNum + "권 입니다.");	// 출력
		
	}
	
	void sum(int num1 , int num2) {				//int num1 num2 의 매개변수를 가지고 return 값이 없는 메소드 생성
		System.out.println("두 수의 합은 " + (num1 + num2)  + " 입니다."); // 출력
	}
	
}


