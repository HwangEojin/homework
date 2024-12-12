package task;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) throws MyException2 {

		// 2. 문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요.
		// 만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며,
		// "숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력하세요.

		/**
		 * 문자열을 입력메소드로 입력받아 변수에 저장
		 * 강제 형 전환으로 다시 정수로 만들기
		 * 
		 * 변환과정에서 숫자가 아닌 문자열이 입력되었을 경우 예외 처리
		 * 사용자 정의 예외 클래스 myexception2를 만들고
		 * 예외처리를 throws로 myException으로 넘김.
		 * try-catch에서 걸리는 예외를 throw로 사용자 정의 예외 클래스를 객체로 만들고
		 * 사용자 정의 메시지를 myexception으로 전달하고 그 메시지를 다시 super로 exception으로 전달
		 */

		Scanner scan = new Scanner(System.in);

		String foo = "";
		
		try {
			foo = scan.nextLine();
			System.out.println("변환된 정수는 : " + Integer.parseInt(foo));
		} catch (NumberFormatException e) {
			throw new MyException2("숫자가 아닌 문자열이 입력되었습니다.");
		}

	}

}
