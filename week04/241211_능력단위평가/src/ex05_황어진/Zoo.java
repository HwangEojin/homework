package ex05_황어진;

import java.util.Arrays;

/*
* Zoo 클래스 생성
* 현재 동물의 수와 배열을 필드로 생성
* 배열의 크기를 받는 생성자 생성
* 배열에 동물을 추가하는 메소드 추가
* 배열의 모든 동물의 이름과 행동을 출력하는 메소드 추가
* 메인에서 zoo에 동물의 수 3을 저장하고 
* 모든 동물의 이름과 행동 출력하는 메소드  호출
* 
*/

public class Zoo {
	int animalCount;
	Animal[] animal;

	public Zoo(int animalCount) {
		this.animalCount = animalCount;
		this.animal = new Animal[animalCount];
	}

	void addAnimal(Animal ani) {
		int count = 0;
//		Animal newArray[] = new Animal[animal.length + 1];
//		newArray[newArray.length-1] = ani;
//		System.out.println(Arrays.toString(newArray));
		for (int i = 0; i < animal.length; i++) {

			if (animal[i] == null) {
				animal[i] = ani;
				break;
			} else if (animal[i] != null) {
				count++;
				System.out.println(count);
				continue;
			}
		}

		if (count == animalCount) {
			System.out.println("더이상 동물을 추가할 수 없습니다.");
		}
		;

	}

	void printAllAnimals() {
		for (int i = 0; i < animalCount; i++) {
			(this.animal[i]).getName();
			(this.animal[i]).performActions();
		}
	}

}
