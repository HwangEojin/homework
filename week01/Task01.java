package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		
		
//		1.1 입력받을 금액을 cash로 변수 할당
//		1.2 변수 cash에 입력받기
//		1.3 계산해서 지폐 몇장인지 나누기
		
		Scanner sc = new Scanner(System.in);
		long cash = 0L;
		int fiveManwonBill = 0;
		int manwonBill = 0;
		int fiveCheonwonBill = 0;
		int CheonwonBill = 0;
	
		System.out.print("금액을 입력해주세요 : ");
		cash = sc.nextLong();
		System.out.printf("입력한 금액은 다음과 같습니다. %d 원",cash);
		fiveManwonBill = cash / fiveManwonBill;
		manwonBill = cash%fiveManwonBill / fiveCheonwonBill;
		fiveCheonwonBill = &manwonBill
		
		System.out.printf("cash);

		
		
		
		
		
		
		
		
		

		// 2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)

		// 3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
		// 공식 : 0.5 * 밑변 * 높이

		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)

		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원

		// 6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합)

		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false

		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false

		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false

		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기 (2024년 , 2025년으로 확인할 것.)
		//true or false -> true 이면 0000은 윤년입니다. false이면 0000은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어떨어지고 / 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다.

	}
}
