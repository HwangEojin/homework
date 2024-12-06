package homework;

public class EX09_06 {	//클래스 선언
	public static void main(String[] args) {
		
		Person p1 = new Person("김자바", 20);				//객체 생성 및 초기화
		Person p2 = new Person("이코딩", 50);				//객체 생성 및 초기화
		
		
		p1.introduce();									// p1객체의 introduce 메소드 호출
		p2.introduce();									// p2객체의 introduce 메소드 호출
		
	}

}
