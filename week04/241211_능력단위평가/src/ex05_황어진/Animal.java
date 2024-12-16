package ex05_황어진;

public abstract class Animal {
	/**
	 *동물의 이름을 입력받는 생성자 생성
	 *이름을 출력하는 getName 메소드 생성
	 *추상 메소드 생성
	 */
	 
	
	protected String name ;

	public Animal(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}	
	
	abstract void performActions();
}
