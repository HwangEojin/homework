package javaBook;

import java.util.Scanner;

public class JavaBookCode {
	public static void main(String[] args) {

		
		
		//Java 멘토시리즈 응용 문제
		
		
		// page 76

		
		
		
		// 1. 다음 코드에서 컴파일 에러가 발생한는 곳을 찾고 이유를 적으세요.
//		String fruit  = "Apple";		// apple이라는 문자열을 담는 문자열타입 변수 선언
//		System.out.println("I like " + fruit);	// 문자열에 변수값을 더해 문자열을 붙여서 출력
		// 출력 결과 : I like Apple
		// 컴파일 에러는 발생하지 않는다.

		// 2. 다음 코드를 실행했을 때 콘솔창에 출력되는 결과는 무엇입니까?
//		int numI = 'A';					// A 문자를 정수형으로 변환 - > 아스키값 65 가 출력
//		System.out.println(numI);		// 아스키 65 
//		
//		char numC = 66;					// 숫자 65를 문자로 변환 -> B
//		System.out.println(numC);		// B

		// 출력 결과 : 65
//					 B

		// 3. 다음 코드에서 컴파일 오류가 발생하지 않으려면 코드를 어떻게 수정해야 할까요?

//		float pie =3.141592; 			// 에러 발생

//		float pie = 3.141592f; 			// float 타입 실수형 변수를 쓸 때, 실수 뒤에 f를 붙인다.
//		System.out.println(pie);		// 3.141592

		// 4. 다음과 같은 결과가 나오도록 코드를 작성해보세요.

		// 7
		// 7.0

//		int n1 = 7;						// 정수 타입 변수 선언
//		System.out.println(n1);			// 출력 결과 : 7
//		double n2 = (double) n1;		// 실수 타입 변수 선언 , 정수를 실수로 형변환
//		System.out.println(n2);			// 출력 결과 : 7.0

// 		출력 결과 : 7
//			  	 7.0

		
		
		
		// page 100

		
		
		// 1. 다음 코드를 실행했을때, 콘솔창에 출력되는 결과는 무엇입니까

//		int x = 613;
//		System.out.println(++x); 		// 출력결과 : 614  -> 613 + 1 을 연산 후 출력 
//		System.out.println(++x); 		// 출력결과 : 614  -> 614 + 1 을 연산 후 출력,
//		System.out.println(x++); 		// 출력결과 : 615  -> 위 연산값을 먼저 출력하고 615 + 1을 연산, x = 616
//		System.out.println(--x); 		// 출력결과 : 615  -> 616-1 을 연산 후 출력

		// 2. 다음과 같은 결과가 나오도록 코드를 수정 해보세요.

//		int a = 300;					// 정수 타입 변수 선언 후 300 할당
//		int b = 150;					// 정수 타입 변수 선언 후 150 할당

//		System.out.println(b/a);		// 출력 결과 : 0
//		System.out.println((double) b/a);		// 출력 결과 : 0.5

		// 3. 다음 코드를 실행했을 때 콘솔에 출력되는 결과는 무엇인가요?

//		String a = (7>9)? "apple" : "banana";	// 조건 7>9 는 항상 false 이므로 "banana" 가 a에 할당
//		a+= " juice";							// banana + juice
//		System.out.println(a);					// 출력 결과 : banana juice

		// page 124

		// 1. 다음 코드를 실행했을 때 콘솔창에 출력되는 결과는 무엇인가요?

//		int num  = 11;						// 11을 정수타입 변수 num에 저장
//		int result = 1000;					// 1000을 정수타입 변수 result에 저장
//		
//		if(num > 10)						// num 이 10보다 크다면? true
//		{	
//			result = 1100;					// result의 값을 1100로 재할당
//		}
//		System.out.println(result);			// 출력 결과 : 1100;
//		

		// 2. 다음 코드를 실행했ㅇ르때 콘솔창에 출력되는 결과는 무엇인가요?

//		int score = 77;						// 77을 정수 타입 변수에 할당 
//		char result = 'A';					// 'A'를 문자 타입 변수 result에 할당
//		
//		if(score >= 60) {					// score 값이 60과 크거나 같다면?
//			result = 'D';					// result에 'D'를 할당
//		} else if (score >= 70) {			// 위 조건에서 false라면 ,score 값이 70과 크거나 같다면?
//			result = 'C';					// result에 'C' 할당
//		}
//		System.out.println(score + "점의 학점은 " + result + "입니다."); // 출력 결과 : 77점의 학점은 D입니다.

		// 3. 위 코드를 다음과 같이 변경하고 싶다면 코드를 어떻게 수정해야할까요?

		// 77점의 학점은 C입니다.

//		int score = 77;						// 77을 정수 타입 변수에 할당 
//		char result = 'A';					// 'A'를 문자 타입 변수 result에 할당
//		
//		if(score >= 70) {					// if 조건이 먼저 연산되고 false일 경우에만 if else로 넘어가므로 70보다 크거나 같은지 먼저 계산
//			result = 'C';					// result에 'C'를 할당
//		} else if (score >= 60) {			// 위 조건에서 false라면 ,score 값이 60과 크거나 같다면?
//			result = 'D';					// result에 'D' 할당
//		}
//		System.out.println(score + "점의 학점은 " + result + "입니다."); // 출력 결과 : 77점의 학점은 C입니다.

		// 4. 다음과 같은 결과가 나오도록 코드를 switch 문으로 구현 해보세요.

//		int a= 25;									// 25의 값을 정수타입 변수 a에 저장
//		switch (a/10) {								// a/10의 결과가
//		case 2 : 									// 2라면..(소수점 버려짐)
//		System.out.println("a는 20 이상의 숫자 입니다.");	// 출력 결과 : "a는 20 이상의 숫자 입니다"
//		}

		
		
		
		
		
		
		// page 143

		
		
		
		
		
		// 1. 1부터 100까지 짝수만을 더 해 출력하는 코드를 for문을 사용해서 작성해보세요.

//		int sum = 0;								// 총합을 저장할 정수타입 변수 선언
//		for (int i = 1; i < 101; i++) {				// i는 1부터 100까지 반복
//			if (i % 2 == 0) {						// i를 2로 나누었을때 나머지가 0이면 -> 짝수이면
//				sum += i;							// sum의 i를 누적합산
//			}
//		}
//		System.out.println("짝수의 합은 : " + sum);		// 출력 결과 : 짝수의 합은 : 2550

		// 2. 두개의 주사위가 같은 값이 나올때까지 while문을 사용해서 반복하고, 반복횟수와 주사위의 눈의 번호를 출력해보세요.

//		int dice1 = 0;								// 1~6까지 정수를 저장할 변수 선언
//		int dice2 = 0;								// 1~6까지 정수를 저장할 변수 선언
//		
//		int count = 0;								// 반복 횟수를 저장할 변수 선언
//		
//		Scanner scan = new Scanner(System.in);		// 입력 method import
//				
//		while (true) {								// break가 나올때까지 무한 반복
//			System.out.println("1~6까지 주사위 눈을 입력해주세요");	//안내문 출력
//			dice1 = scan.nextInt();							// dice1에 입력값을 저장
//			scan.nextLine();								// 공백 소모
//			dice2 = scan.nextInt();							// dice2에 입력값을 저장
//			System.out.println("dice 1 : " + dice1);		// dice1의 눈의 값을 출력
//			System.out.println("dice 2 : " + dice2);		// dice2의 눈의 값을 출력
//			count ++;										// 각 반복마다 횟수를 1증가
//			System.out.println("반복 횟수 : " + count);		// 반복 횟수 출력
//						
//			if(dice1 == dice2) break;						// 만약 두 주사위의 눈이 같다면 루프 종료
//		}

		// 3. 다중 반복문을 사용해 다음과 같은 모양의 *을 출력하는 코드를 작성해 보세요.

//		   *
//		  * *
//		 * * *
//		* * * *

//		for(int i = 1; i<=4; i++) {							// 1부터 4까지 반복 수행(행이 4개이므로)
//			for(int j = 0; j < 4-i; j++) {					// 공백을 출력하는 반복문 (반복이 수행될수록 j는 작아짐)
//				System.out.print(" ");						// 공백 출력
//			}
//			
//			for(int j =0; j < i; j++) {						// *을 출력하는 반복문 (i만큼 반복)
//				System.out.print("* ");						// *을 출력
//			}
//			System.out.println();							// 각 반복이 수행되면 줄넘김
//		}

		// 출력 결과 :
//		   *
//		  * *
//		 * * *
//		* * * *

		// 4. 다중 반복문을 사용해 다음과 같은 모양의 *을 출력하는 코드를 작성해 보세요.

//		      *
//		    * * *
//		  * * * * *
//		* * * * * * *

		for (int i = 1; i <= 4; i++) { 					// 1부터 4까지 반복 수행(행이 4개이므로)
			for (int j = 0; j < (4 - i)*2; j++) { 		// 공백을 출력하는 반복문 (반복이 수행될수록 공백은 짝수 만큼 줄어듬)
				System.out.print(" "); 					// 공백 출력
			}

			for (int j = 0; j < (i*2)-1; j++) { 		// *을 출력하는 반복문 (반복이 수행될수록 *은 홀수만큼 증가함)
				System.out.print("* "); 				// *을 출력
			}
			System.out.println(); 						// 각 반복이 수행되면 줄넘김
		}

	}

}
