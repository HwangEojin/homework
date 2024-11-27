package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다

		// logic
		// 입력 받을 값을 변수로 선언
		// 안내문 출력
		// 입력값
		// 입력값을 받아 변수에 할당
		// 조건식 참,거짓에 따라 텍스트 출력

		Scanner sc = new Scanner(System.in); // scanner import
//	   int val = 0;															//입력받은 값을 저장할 변수 선언
//	   
//	   System.out.println("숫자를 하나 입력하면 짝수인지 홀수인지 알려드립니다. :");		//안내문 출력
//	   val = sc.nextInt();													//입력받은 값을 val에 할당
//	   System.out.println(val % 2 == 0 ? "짝수 입니다." : "홀수입니다.");			//조건 연산 결과에 따라 결과 출력

//
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다

		// logic
		// 입력 받을 값을 변수로 선언
		// 안내문 출력
		// 입력값
		// 입력값을 받아 변수에 할당
		// 조건식 if~elseif 문 사용하여 조건에 따라 텍스트 출력

//	   
//	   int val = 0;															//입력받은 값을 저장할 변수 선언
//	   
//	   System.out.println("숫자를 하나 입력하면 양수인지 음수인지 0인지 알려드립니다. :");	//안내문 출력
//	   val = sc.nextInt();													//입력받은 값을 val에 할당
//	   
//	   if(val > 0) {														//val 이 0보다 큰 경우...
//		   System.out.println("양수 입니다.");									//"양수입니다"를 출력
//	   }else if (val == 0) {												//val 이 0과 같을 경우...
//		   System.out.println("0 입니다.");									//"0 입니다"를 출력
//	   }else {																//위 조건에 모두 해당하지 않는 경우...
//		   System.out.println("음수 입니다.");									//"음수입니다"를 출력
//
//	   }

//
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      	나이입력 : 16
//      	청소년입니다.

		// logic
		// 입력 받을 값을 변수로 선언
		// 안내문 출력
		// 입력값
		// 입력값을 받아 변수에 할당
		// switch case를 활용하여 조건에 따라 텍스트 출력

//	   int age = 0;															//입력받은 값을 저장할 변수 선언
//
//	   
//	   System.out.print("나이를 입력하시오. :");									//안내문 출력
//	   age = sc.nextInt();													//입력받은 값을 age에 할당
//	   
//	   if(age >= 20) {														//age가 20 이상이라면...
//		   System.out.print("성인 입니다.");									//"성인 입니다"를 출력
//	   }else if (age >=13) {												//age가 13 이상이라면..
//		   System.out.print("청소년 입니다.");									//"청소년 입니다"를 출력
//	   }else if (age > 0){													//age가 0 초과라면...
//		   System.out.print("어린이 입니다.");									//"어린이 입니다"를 출력
//	   }else {																//위 조건에 모두 해당하지 않는 경우...
//		   System.out.print("잘못된 값이 입력되었습니다.");							//"잘못된 값이 입력되었습니다."를 출력
//	   }

//
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9

		// logic
		// 입력 받을 3개의 값을 각각 변수로 선언
		// 안내문 출력
		// 입력값
		// 입력값을 받아 변수에 할당
		// 삼항연산자를 활용하여 각 변수의 값을 비교
		// 세개의 숫자를 어떻게 비교할까?
		// 

//		int val1 = 0; 														// 입력받은 값을 저장할 변수 선언
//		int val2 = 0; 														// 입력받은 값을 저장할 변수 선언
//		int val3 = 0; 														// 입력받은 값을 저장할 변수 선언
//	   
//		System.out.println("숫자를 3개 입력하면 크기를 비교하여 알려드립니다. :");			//안내문 출력
//		val1 = sc.nextInt();													//입력받은 값을 val1에 할당
//		val2 = sc.nextInt();													//입력받은 값을 val2에 할당
//		val3 = sc.nextInt();													//입력받은 값을 val3에 할당
//	   
//
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
		
		// logic
		// 입력 받을 값을 변수로 선언
		// 안내문 출력
		// 입력값
		// 입력값을 받아 변수에 할당
		// while 문을 활용하여 X가 아닌 경우를 판단
		// X를 입력했을 경우 종료메시지 출력
//		String inputValue = "";														//입력값을 받을 inputValue 선언
//		System.out.print("문자 1개를 입력하십시오 : ");									//"X"가 아닐 경우 루프 진행
//		inputValue = sc.nextLine();													//inputValue에 입력값 할당
//		System.out.println("입력받은 문자열은 : " + inputValue);							//inputValue에 입력값 할당		
//		
//
//		while (!(inputValue.equals("X"))) {
//			System.out.println(inputValue);							
//			System.out.print("문자 1개를 입력하십시오 : ");								//"X"가 아닐 경우 루프 진행
//			System.out.println("\n루프가 진행됩니다....");								//"X"가 아닐 경우 루프 진행
//			System.out.println("다시 값을 입력하십시오 : ");								//안내문 출력						
//			inputValue = sc.nextLine();												//입력받은 값을 val에 할당	
//			System.out.println("입력받은 값은 : " + inputValue);							
//			
//			if(inputValue.equals("X")) {											//재입력받은 값이 X인지 아닌지 판단	
//                break;																//재입력받은 값이 True이면 루프 종료
//            }//입력값을 출력
//		}
//		System.out.println("루프가 종료되었습니다.....");									// 루프 종료


//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
//
//
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ");
		
		
		int account = 10000;
		int inputValue = 0;
		int deposit = 0;
		
		
		boolean isLoop = true;						// 메뉴 띄울 조건
		
		// 메뉴 출력
		while (isLoop) {
			String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
		              + "1. 잔액 조회"
		              + "2. 입금"
		              + "3. 출금"
		              + "4. 종료 "
		              + "선택 : ";
			System.out.println(msg);
			inputValue= sc.nextInt();
			System.out.println(inputValue);
			
			switch (inputValue) {
			case 1: { //사용자가 1번을 눌렀을 경우
				System.out.println("입력한 메뉴 번호 = "+ inputValue);
				System.out.printf("현재 잔액은 %d원 입니다.",account);

				break;
			}
			case 2: { //사용자가 2번을 눌렀을 경우
				System.out.println("입력한 메뉴 번호 = "+ inputValue);
				System.out.print("입금하실 금액을 입력하세요. : (원)");
				deposit = sc.nextInt();									
				
				account = account + deposit; 							//잔액에 입금할 돈 추가

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + inputValue);
			}
			
			
			
			
			
			
			
				
			
		}
		// 메뉴 출력 종료
		
		
		
		

	}
}
