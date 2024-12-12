package ex05_황어진;

public class Pet extends Animal{
	/*
	 * 추상메소드를 상속받는 pet 생성
	 * performActions를 오버라이드
	 * 고유 메소드 3개 생성
	 * performAction에 모든 메소드 호출
	 * */

	public Pet(String name) {
		super(name);
	}
	
	void play() {
		System.out.println(this.name + "이(가) 장난을 칩니다.");
	}
	void eat() {
		System.out.println(this.name +"이(가) 밥을 우걱우걱 먹습니다.");
	}
	void sleep() {
		System.out.println(this.name +"이(가) 쌕쌕 잡니다.");
	}
	@Override
	void performActions() {
		System.out.println(super.getName());
		play();
		eat();
		sleep();
	}
	
	
}
