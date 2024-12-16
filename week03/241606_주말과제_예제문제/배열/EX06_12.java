package section06;

import java.util.Arrays;

public class EX06_12 {
	public static void main(String[] args) {
		int[] card = { 3,1,4,5,10};
		
		int[] newCard = Arrays.copyOf(card, card.length); // 배열의 깊은 복사
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		
		//card 배열의 값 변경
		card[1] = 10;
		
		//card 변경 후 배열 출력
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));

	}

}
