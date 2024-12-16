package task;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// 1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요.
		// 그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고,
		// 프로그램을 종료하세요.

		/**
		 * 입력 메소드로 숫자를 입력받아 변수에 저장
		 * 
		 * 그 변수에 입력된 값이 숫자가 아닐경우 
		 * 잘못된 입력입니다. 라는 메시지를 예외처리로 출력함
		 * try catch 사용
		 */

		Scanner scan = new Scanner(System.in);

		int theNumber = 0;
		int sum = 0;

		try {
			theNumber = scan.nextInt();
			for (int i = 0; i <= theNumber; i++) {
				sum += i;
			}
			System.out.println("합계 : " + sum);

		} catch (Exception e) {
			System.out.println("잘못된 입력입니다");
		}

	}

}
