package homework;

public class Task01Main {
	/*

	 * 1) 직원 프로그램 Employee 클래스 
	 * 필드 name, salary 
	 * 메소드 calculateBonus() : 
	 * 기본적으로 salary * 0.1 반환
	 * 
	 * Manager와 Developer 클래스는 Employee 클래스 상속 
	 * Manager 클래스 calculateBonus()를 오버라이딩하여 salary * 0.2 반환 
	 * Developer 클래스 calculateBonus()를 오버라이딩하여 salary * 0.15 반환 
	 * 메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산
	 */
	
	
	/*logic
	 * 
	 * employee 클래스를 생성하고 필드에 name , salary를 선언
	 * 보너스를 계산하는 메소드를 만들고
	 * developer class와 manager class에 각각 오버라이딩 하여 결과값이 다르게 만듬
	 * 메인 메소드에서 객체를 생성하여 보너스 생성
	 * 
	 * */
	public static void main(String[] args) {
		
		Manager mng1 = new Manager("매니져1", 100000);			// 매니저 이름과 월급을 임의로 입력함
		Developer dev1 = new Developer("개발자1", 100000);		// 개발자 이름과 월급을 임의로 입력함
		
		System.out.println(mng1.calculateBonus()); 				// 계산 결과 값을 출력함
		System.out.println(dev1.calculateBonus());				// 계산 결과 값을 출력함
	}
	

	
	

}
