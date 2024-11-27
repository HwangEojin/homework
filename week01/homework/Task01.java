package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 불러오기
		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기

		// logic
		// 입력받을 금액과 각 지폐를 변수로 선언
		// 나누기 + 나머지 연산
		// 결과값을 출력

//		int inputValue = 0;
//
//		System.out.println("금액을 입력하세요");
//
//		inputValue = sc.nextInt(); //입력받은 금액을 inputValue에 할당
//
//		int fiftyThousand = inputValue / 50000; // 5만 원권
//		inputValue %= 50000; // 나누었을 때의 나머지를 inputValue에 다시 할당
//
//		int tenThousand = inputValue / 10000; // 1만 원권
//		inputValue %= 10000; // 나누었을 때의 나머지를 inputValue에 다시 할당
//
//		int fiveThousand = inputValue / 5000; // 5천 원권
//		inputValue %= 5000; // 나누었을 때의 나머지를 inputValue에 다시 할당
//
//		int oneThousand = inputValue / 1000; // 1천 원
//
//		// 결과 출력
//		System.out.println("5만원권: " + fiftyThousand + "장");
//		System.out.println("1만원권: " + tenThousand + "장");
//		System.out.println("5천원권: " + fiveThousand + "장");
//		System.out.println("1천원권: " + oneThousand + "장");

		// 2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)

		// logic
		// 키 와 몸무게, BMI 수치를 각각 변수로 선언
		// 입력값을 변수에 할당
		// 연산 후 결과를 BMI 변수에 할당
		// 연산 값 출력

//		double height = 0;
//		double weight = 0;
//		double bmi = 0;
//
//		System.out.print("키(cm)를 입력하세요 :"); // 안내문 출력
//		height = sc.nextDouble() /100; // 입력값을 height에 할당 * BMI 계산식에선 신장을 m로 계산한다
//		System.out.print("몸무게를(kg) 입력하세요 : "); // 안내문 출력
//		weight = sc.nextDouble(); // 입력값을 weight에 할당
//		bmi = weight / (height * height); // 연산값을 bmi에 할당
//		System.out.printf("BMI수치는 %.2f 입니다", bmi); // 결과문 출력

		// 3. 밑변과 높이를 입력받아 삼각형의 넓이 계산하기
		// 공식 : 0.5 * 밑변 * 높이
		// logic
		// 입력받을 두 정수를 각각 변수로 선언
		// 입력값은 값을 각각 변수에 할당
		// 연산 후
		// 연산 결과 출력

//		int height = 0;
//		int width = 0;
//		double result = 0;
//		
//		System.out.print("삼각형의 높이를 입력하세요: "); 				// 안내문 출력
//		height = sc.nextInt();						 			// 입력받은 숫자를 height에 할당
//		System.out.print("삼각형의 밑변을 입력하세요: "); 				// 안내문 출력
//		width = sc.nextInt(); 									// 입력받은 숫자를 width에 할당
//		
//		result = 0.5 * height * width;							// 연산결과를 result에 할당
//		
//		System.out.println("삼각형의 넓이는 " + result);				// 연산결과를 출력
//		

		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)

		// logic
		// 입력받을 두 정수를 각각 변수로 선언
		// 입력값은 값을 각각 변수에 할당
		// 조건 체크후
		// 연산 결과 출력

//		int num1 = 0; // 입력받을 숫자1 변수 선언
//		int num2 = 0; // 입력받을 숫자2 변수 선언
//		boolean checkCondition = false; // boolean 변수 선언
//
//		System.out.print("숫자를 입력하세요: "); // 안내문 출력
//		num1 = sc.nextInt(); // 입력받은 숫자를 num1에 할당
//		System.out.print("숫자를 입력하세요: "); // 안내문 출력
//
//		num2 = sc.nextInt(); // 입력받은 숫자를 num2에 할당
//
//		System.out.println("num1은 0보다 큰가 ? :" + (num1 > 0)); // 결과 출력
//		System.out.println("num2은 0보다 큰가 ? :" + (num2 > 0)); // 결과 출력

		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원

		// logic
		// 물건의 갯수 와 가격, 총액을 각각 변수로 선언
		// 입력값을 변수에 할당
		// 연산 후 연산값을 총액에 할당
		// 출력

//		
//		int price = 0; 								//사용자에게 받을 물건의 가격을 변수로 선언
//		int quantity = 0; 							//사용자에게 받을 물건의 개수을 변수로 선언
//		int total = 0;								//총액을 변수로 선언
//		
//		System.out.print("물건 가액를 입력하시오 : ");		// 안내문 출력
//		price = sc.nextInt();						// 입력값을 price에 할당
//		System.out.print("물건 개수를 입력하시오 : ");		// 안내문 출력
//		quantity = sc.nextInt();					// 입력값을 quantity 출력
//		total = price * quantity;					// 총액 연산
//		System.out.printf("총액 : %d 원입니다.", total);// 결과값 출력

		// 6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합)

		// logic
		// number을 변수로 선언
		// 입력값을 변수에 할당
		// 연산후 각자리수 숫자를 변수에 할당
		// 연산후 result 변수에 할당
		// 결과 출력

//		int number = 0;									// 입력받을 숫자 변수 선언
//		int firstNumber = 0;							//10의자리 숫자 변수 선언
//		int secondNumber = 0;							//1의자리 숫자 변수 선언
//		int result=0;									//연산결과값 변수 선언
//		System.out.print("숫자를 입력하세요: "); 				// 안내문 출력
//		number = sc.nextInt();
//		
//		firstNumber = number / 10;						// firstNumber 연산 후 할당
//		secondNumber = number % 10;						// secondNumber 연산 후 할당
//		
//		result = firstNumber + secondNumber;			// result 연산 후 할당
//		System.out.println("각 자리수의 합은 :" + result);	// 결과 출력

		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false

		// logic
		// num을 변수로 선언
		// 입력값을 변수에 할당
		// 양수에다가 짝수인지 여부를 연산후 checkCondition에 할당
		// 연산 값을 출력

//				
//		int num = 0;// num를 변수로 선언
//		boolean checkCondition = false;					// 조건에 만족하는지 여부를 변수로 선언			
//		System.out.print("숫자를 입력하세요: "); 				// 안내문 출력
//		num = sc.nextInt();								//숫자 입력
//
//		checkCondition = ( num > 0 ) && (num%2 ==0);	//조건 연산
//		
//
//		System.out.println("양수이면서 짝수인지? " + checkCondition); // 연산으로 양수이면서 짝수인지 출력

		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false

		// logic
		// num1, num2를 변수로 선언
		// 입력값을 변수에 할당
		// 조건에 만족하는지 여부를 연산후 checkCondition에 할당
		// 연산 값을 출력

		
//		int num1 = 0;// num1를 변수로 선언
//		int num2 = 0;// num2를 변수로 선언
//		boolean checkCondition =false;// 조건에 만족하는지 여부를 변수로 선언
//		
//		System.out.print("첫 번째 숫자를 입력하세요: "); // 안내문 출력
//		num1 = sc.nextInt();// 첫 번째 숫자 입력
//
//		System.out.print("두 번째 숫자를 입력하세요: "); // 안내문 출력
//		num2 = sc.nextInt();// 두 번째 숫자 입력
//
//		checkCondition = num1 >= num2;
//		
//		System.out.println("첫번째 숫자가 두번째 숫자보다 큰거나 같은가? " + checkCondition);

		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false

		// logic
		// num1, num2를 변수로 선언
		// 입력값을 변수에 할당
		// 하나만 양수인지 여부를 연산후 checkCondition에 할당
		// 연산 값을 출력

//		int num1 = 0; // 첫 번째 숫자 변수 선언
//		int num2 = 0; // 두 번째 숫자 변수 선언
//		boolean checkCondition = false; // bool 변수 선언
//
//		System.out.print("첫 번째 숫자를 입력하세요: "); // 안내문 출력
//
//		num1 = sc.nextInt();// 첫 번째 숫자 입력
//
//		System.out.print("두 번째 숫자를 입력하세요: "); // 안내문 출력
//		num2 = sc.nextInt();// 두 번째 숫자 입력
//
//		// 한 숫자만 양수인지 여부 계산
//		checkCondition = ((num1 > 0) || (num2 > 0)) && !((num1 > 0) && (num2 > 0)); // &&과 || 연산으로 둘 중 하나만 True인지 확인
//		
//		// 결과 출력
//		System.out.println("한 숫자만 양수인지 여부: " + checkCondition);

		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기 (2024년 , 2025년으로 확인할 것.)
		// true or false -> true 이면 0000은 윤년입니다. false이면 0000은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어떨어지고 / 100으로 나누어떨어지지 않거나 400으로 나누어 떨어져야한다.

		// logic
		// year, isLeapYear를 변수로 선언
		// 입력값을 변수에 할당
		// 윤년 여부를 연산후 isLeapYear에 할당
		// 연산 값에 따라 조건식으로 출력
		int year = 0; // 년도를 변수로 선언
		boolean isLeapYear = false; // 윤년여부를 변수로 선언
		System.out.print("연도를 입력하세요: \n"); // 연도 입력
		year = sc.nextInt();

		isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0); // 윤년 계산
		// 윤년 계산 및 삼항연산자를 사용하여 조건식으로 출력
		if (isLeapYear) {
			System.out.printf("%d년은 윤년입니다.%n", year); // 참일때 출력
		} else {
			System.out.printf("%d년은 윤년이 아닙니다.%n", year); // 거짓일때 출력
		}
		sc.close();
	}

}
