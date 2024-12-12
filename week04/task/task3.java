package task;

import java.util.InputMismatchException;
import java.util.Scanner;
public class task3 {

	public static void main(String[] args) throws MyException3{
		// 3. 사용자로부터 정수를 입력받아, 입력받은 정수가 0에서 100 사이의 값인 경우,
		// 입력받은 정수를 2배한 값을 출력하고, 그 외의 값이 입력될 경우
		// "잘못된 입력입니다"라는 예외 메시지를 출력하세요.

		/**
		 * 정수를 입력받아 변수에 저장하고
		 * 그 변수값의 2배에 해당하는 값을 계산하여 출력
		 * 만약 입력값이 0 미만 100 초과라면 exception 출력
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0;

		System.out.println("숫자를 하나 입력하면, 그 숫자의 2배를 출력합니다....");
		
		try {
			try {
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				throw new MyException3("잘못된 값을 입력했습니다.");
			}
			if (0 <= num && num <= 100) {
				System.out.println("출력되는 결과는 :" + (num * 2));
			} else {
				throw new MyException3("범위 밖의 숫자를 입력하셨습니다.");
			}
		} catch (MyException3 e) {
			System.out.println(e.getMessage());
		}

	}

}
