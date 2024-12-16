package ex04_황어진;

public class Person {
	/*
	 * logic
	 * 
	 * private 타입으로 필드 선언
	 * 이름을 받는 생성자 생성
	 * 이름을 구하는 메소드 생성
	 * 
	 */
	
	private String name;

	public Person(String name) {
		this.name = name;
	}

	void getName(String nm) {
		this.name = nm;
	}
	
	
	

}
