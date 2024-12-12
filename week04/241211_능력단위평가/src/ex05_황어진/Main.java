package ex05_황어진;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		/*
		 * logic
		 * 
		 * 추상클래스 animal을 생성 동물의 이름을 입력받는 생성자 생성 이름을 출력하는 getName 메소드 생성 추상 메소드 생성 추상메소드를
		 * 상속받는 pet 생성 performActions를 오버라이드 고유 메소드 3개 생성 performAction에 모든 메소드 호출
		 * 
		 * Zoo 클래스 생성 현재 동물의 수와 배열을 필드로 생성
		 * 배열의 크기를 받는 생성자 생성 배열에 동물을 추가하는 메소드 추가
		 * 배열의 모든 동물의 이름과 행동을 출력하는 메소드 추가 
		 * 메인에서 zoo에 동물의 수 3을 저장하고 모든 동물의 이름과 행동 출력하는 메소드 호출
		 * 
		 * 
		 */

		Animal cat = new Pet("야옹이");
		Animal doggo = new Pet("바둑이");
		Animal birdie = new Pet("째액째액");

		Zoo zoo = new Zoo(3);
		Animal animal[] = zoo.animal;
		int animalCount = zoo.animalCount;

		zoo.addAnimal(cat);
		zoo.addAnimal(doggo);
		zoo.addAnimal(birdie);
		zoo.addAnimal(cat);
		
		System.out.println(zoo.animal[0].name);
		System.out.println(zoo.animal[1].name);
		System.out.println(zoo.animal[2].name);
	
		for(Animal i : animal) {
			i.performActions();
		}
		

	}
}
