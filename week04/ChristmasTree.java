package project;

public class ChristmasTree {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) { // 0~3 까지 4번 반복

			for (int j = 0; j < 8 - (2 * i); j++) { 			// 6-4-2 공백 짝수 만큼 감소
				if (i == 0 && j == 6) { 						// i가 0이고 j가 6이라면
					System.out.print("★"); 						// 검은 별 출력
				}
				System.out.print(" ");							// 아니면 공백 출력
			}
			for (int j = 0; j < (2 * i) - 1; j++) { // 1-3-5 별 홀수만큼 증가
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		for (int i = 1; i < 5; i++) {

			for (int j = 0; j < 8 - (2 * i); j++) { //6-4-2-0 공백 짝수만큼 감소
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i) - 1; j++) { //  1-3-5-7 별 홀수만큼 증가
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if (j == 6) {
					System.out.print("■");
				}
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
