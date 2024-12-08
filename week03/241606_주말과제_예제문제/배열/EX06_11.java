package section06;

import java.util.Arrays;

public class EX06_11 {
	public static void main(String[] args) {
		int [] card = {1,6,4,5,3,2};
		int [] newCard = new int[card.length];
		
		//새로운 배열에 기존 내용 삽입
		for(int i = 0; i<card.length; i++) {
			newCard[i] = card[i];
		}
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
	}

}
