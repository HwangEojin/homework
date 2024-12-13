package task;

import java.util.ArrayList;
import java.util.Collections;

public class LottoList {

	public static void main(String[] args) {
		// ArrayList, HashSet을 사용하여 중복을 허용하지 않는 6개의 랜덤 숫자를 추가
		// Random 클래스를 이용하여 1~ 45 사이의 랜덤 숫자를 생성
		// 정렬해서 출력

		/**
		 * logic
		 * 
		 * ArrayList 컬렉션을 선언하고 <Integer> 타입으로 제한
		 * (Random * 40) + 1
		 * collections.sort
		 * 
		 */

		ArrayList<Integer> lotto = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			lotto.add((int) ((Math.random() * 40) + 1));
		}
		 Collections.sort(lotto);
		 System.out.println(lotto);
	}

}
