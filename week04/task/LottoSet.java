package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LottoSet {
	public static void main(String[] args) {
		// ArrayList, HashSet을 사용하여 중복을 허용하지 않는 6개의 랜덤 숫자를 추가
		// Random 클래스를 이용하여 1~ 45 사이의 랜덤 숫자를 생성
		// 정렬해서 출력

		/**
		 * logic
		 * 
		 * Hashset 컬렉션을 선언하고 <Integer> 타입으로 제한
		 * (Random * 40) + 1
		 * Hashset을 Arrlist로 바꾼 다음
		 * collections.sort 후 출력
		 * 
		 */

		HashSet<Integer> lotto = new HashSet<>();

		for (int i = 0; i < 6; i++) {
			lotto.add((int) ((Math.random() * 40) + 1));
		}
		System.out.println(lotto);
		ArrayList<Integer> newList = new ArrayList<>(lotto);
		Collections.sort(newList);
		System.out.println(newList);

	}

}
