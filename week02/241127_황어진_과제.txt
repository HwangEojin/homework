package homework;

import java.util.Iterator;
import java.util.Scanner;

public class Task02 {
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
		// 최소, 최대 , 중간 값을 변수로 선언
		// 안내문 출력
		// 입력값을 받아 변수에 할당
		// 삼항연산자를 활용하여 각 변수의 값을 비교
		// 삼항연산자로 세 숫자중에 최소값을 구하고 변수에 할당
		// 세 숫자중 최대값을 구하고 변수에 할당//
		// 최소값도 아니고 최대값이 아닌것이 중간값
		// 순서대로 출력


		int val1 = 0; 														// 입력받은 값을 저장할 변수 선언
		int val2 = 0; 														// 입력받은 값을 저장할 변수 선언
		int val3 = 0; 														// 입력받은 값을 저장할 변수 선언
		
		int minValue = 0;													// 최소값을 변수로 선언
		int midValue = 0;													// 중간값을 변수로 선언
		int maxValue = 0;													// 최대값을 변수로 선언
	   
		System.out.println("숫자를 3개 입력하면 크기를 비교하여 알려드립니다. :");			//안내문 출력
		val1 = sc.nextInt();													//입력받은 값을 val1에 할당
		val2 = sc.nextInt();													//입력받은 값을 val2에 할당
		val3 = sc.nextInt();													//입력받은 값을 val3에 할당
	   
		minValue = ( (val1<val2) ? (val1 < val3 ? val1 : val3) :(val2<val3 ? val2 : val3)); //최소값을 구하는 삼항연산식
		maxValue = ( (val1>val2) ? (val1 > val3 ? val1 : val3) :(val2>val3 ? val2 : val3));	//최대값을 구하는 삼항연산식
		midValue = ((val1 != minValue && val1 != maxValue) ? val1 : (val2 !=minValue && val2 !=maxValue)? val2 : val3);
		// 최소 값도 아니고 최대값도 아닌 것이 중간값이니, 중간값을 구하는 식으로 변수에 할당
		System.out.printf
		(
			"%d %d %d", minValue,midValue,maxValue //최소,중간,최대 값 순서대로 출력
					
		);
		
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
		
		// logic
		// 입력 받을 값을 변수로 선언
		// 안내문 출력
		// 입력값을 받아서 변수에 할당
		// 입력값의 구구단수 출력을 위해 for문
		// 출력
		
//		int inputNum = 0;												// 입력값을 담을 변수 선언
//		int result = 0;													// 연산 결과 값을 담을 변수 선언
//		System.out.println("\n구구단을 외자! 구구단을 외자! 몇 단? :");			// 안내문 출력
//		inputNum = sc.nextInt();										// 입력값을 변수에 할당
//		System.out.printf("\n구구단을 외자! 구구단을 외자! %d 단! :\n",inputNum);// 안내문 출력
//		
//		for (int i = 1; i < 10 ; i++) {									// 입력값 단의 반복문 1부터 9까지
//			
//			result = inputNum * i;										//구구단 계산값을 반복 연산
//			System.out.printf("\n%d X %d = %d",inputNum,i,result);		//결과값 출력
//
//		}

	
		
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
	
		
		// logic
		// 현재 잔액, 입금할 돈 , 출금할 돈, 선택한 메뉴를 각각 변수에 할당
		// 메뉴 출력을 위해 while문 사용
		// 메뉴 선택창에서 메뉴 선택값을 받아서 selectMenu 변수에 할당
		
		// 각 메뉴별 기능 구현
		// 1. 잔액 조회 = 현재 잔액 변수 출력
		// 2. 입금 = 현재 잔액 + 입금할 돈(입력값)
		// 3. 현재 잔액 - 출금할 돈(입력값)
		// 4. 나가기 = while 루프 종료시키기
		
		
//		
//		int account = 10000;						// 초기 잔액을 변수로 선언
//		int selectMenu = 0;							// 선택한 메뉴를 변수로 선언
//		int deposit = 0;							// 입금할 금액를 변수로 선언
//		int Withdrawal  = 0;						// 출금할 금액를 변수로 선언
//		String isQuit ="";
//		
//		
//		String msg = "\nATM 메뉴의 번호를 선택하세요 : \n"		// 메뉴를 출력하기 위한 문자열 변수
//	              + "1. 잔액 조회\n"
//	              + "2. 입금\n"
//	              + "3. 출금\n"
//	              + "4. 종료\n"
//	              + "선택 : ";
//		
//		boolean isLoop = true;						// 메뉴 출력 조건
//		
//		// 메뉴 출력
//		while (isLoop) {
//		
//			System.out.println(msg);				// 메시지 출력
//			selectMenu= sc.nextInt();				// 메뉴 입력값을 받아서 selectMenu에 할당
//			
//			switch (selectMenu) {										// 입력한 메뉴 값(selectMenu)값에 따라 case 를 변경
//			case 1: { 													//사용자가 1번을 눌렀을 경우
//				System.out.printf("\n현재 잔액은 %d원 입니다.\n",account);
//				break;
//			}
//			case 2: { 													//사용자가 2번을 눌렀을 경우
//				System.out.print("\n입금하실 금액을 입력하세요. : (원)\n");			//안내문 출력
//				deposit = sc.nextInt();									
//				account = account + deposit; 								//잔액에 입금할 돈 추가
//				System.out.println("입금이 완료되었습니다.");						//안내문 출력
//				System.out.printf("\n현재 잔액은 %d원 입니다.\n",account);		//현재 잔액 출력
//				break;
//			}
//			case 3:{ 													//사용자가 3번을 눌렀을 경우
//				System.out.print("\n출금하실 금액을 입력하세요. : (원)\n");			//안내문 출력
//				Withdrawal = sc.nextInt();									
//				account = account - Withdrawal; 							//잔액에서 출금할 돈 빼기
//				System.out.println("출금이 완료되었습니다.");						//안내문 출력
//				System.out.printf("\n현재 잔액은 %d원 입니다.\n",account);		//현재 잔액 출력
//				break;
//			}
//			case 4:{
//				System.out.println("\n입력한 메뉴 번호 = "+ selectMenu);
//				System.out.print("\n나가시겠습니까? y/n\n");						//안내문 출력
//			    sc.nextLine();												//버퍼에 남아있는 공백 제거
//
//				isQuit = sc.nextLine();										// Y/N으로 입력값 받기
//				if (isQuit.equals("y")) {									// 만약 입력값이 y면...
//					isLoop = false;											// 메뉴 출력 조건을 false 설정
//				}else if(isQuit.equals("n")) {								// 만약 입력값이 n면...
//					isLoop = true;											// 메뉴 출력 조건을 true면 설정...
//			
//				}else {
//					System.out.println("잘못된 값을 입력하셨습니다");				// 안내문 출력
//				}
//				break;
//			}
//			default:{
//				System.out.println("잘못된 값을 입력하셨습니다");				// 안내문 출력
//			}
//																		// 메뉴 출력 종료
//			}
//		}
	}
}
