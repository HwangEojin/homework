package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task4 {
	public static void main(String[] args) throws MyException4 {

		// 4. 사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz",
		// 5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz",
		// 그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요.
		// 사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.

		/**
		 * 입력받은 숫자를 변수에 저장하고 그 숫자 / 3 나머지가 0일경우 3의 배수이고 그 숫자 / 5 나머지가 0일경우 5의 배수 그 숫자 /
		 * (3*5)는 3과5의 공배수
		 * 
		 * 각 조건에 따라 문구를 출력하고 그 외에는 입력받은 숫자를 출력한다.
		 * 
		 * 만약 문자열을 입력한 경우 문구 출력
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int a = 3;
		int b = 5;
		int inputNumber = 0;
		System.out.println("숫자를 입력하세요");
		try {

			try {
				inputNumber = scan.nextInt();
			} catch (InputMismatchException e) {
				throw new MyException4("숫자가 아닌 문자열이 입력되었습니다");
			}

			if (inputNumber % (a * b) == 0) {
				System.out.println("FizzBuzz");
			} else if (inputNumber % a == 0) {
				System.out.println("Fizz");
			} else if (inputNumber % b == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(inputNumber);
			}

		} catch (MyException4 e) {
			e.printStackTrace();
		}

	}

}