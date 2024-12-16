package ex02_황어진;

public class Print {
	public static void main(String[] args) {

		// 2. 15부터 30까지 중 짝수의 합을 출력하라
		//
		// - 클래스명 : Print
		// - 단, while문을 사용할 것

		/*
		 * logic
		 * 
		 * while문을 사용해서 15 부터 30까지 반복하고 count 변수를 선언 짝수만 카운트에 저장하고 누적 합산
		 * 
		 */

		int count = 15;
		int sum = 0;
		while (15 <= count && count <= 30) {

			if (count % 2 == 0) {
				sum += count;
			}
			count++;

		}

		System.out.println("짝수의 합은 ? : " + sum);

	}
}
