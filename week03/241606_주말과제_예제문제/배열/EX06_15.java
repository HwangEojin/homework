package section06;

public class EX06_15 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		int count = 1;

		// 1부터 25까지 차례대로 배열의 값을 넣는다.

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = count++;

			}
		}
		// 배열 출력하기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(arr[i][j] + "");
			}
			System.out.println();
		}
	}
}