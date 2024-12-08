package section07;

public class EX07_11 {	//클래스 선언
	public static void main(String[] args) {
		Family father = new Family();	//객체 생성
		Family son = new Family();		// 객체 생성
		
		father.address = "인천";			// 객체의 주소값 수정
		System.out.println(son.address);// 출력 : 서울
	}
}
