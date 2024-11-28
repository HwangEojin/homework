
//JAVA요

//---------------------------------------------------------------
//I팀
//1. 업다운문제
//   초기 숫자 상수로 정하고 숫자 3회 입력
//     > (상수 > 입력) : up 출력
//     > (상수 < 입력) : down 출력
//
//2. OX 퀴즈 (2문제만 존재함) 
//   1번 못 맞추면 프로그램 종료
//         1번 맞추면 2번 문제로 넘어가기
//
//1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 : X
//2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : O
//
//(모든 문제를 맞춘 경우)
//1번문제를 맞힐경우 정답입니다 2번문제로 넘어갑니다 출력
//2번문제도 맞힐경우 정답입니다 모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다. 출력 후 프로그램 종료
//
//(1번문제를 틀린인 경우)
//1번문제를 틀린경우 틀렸습니다. 출력 후 프로그램 종료(다음문제로 넘어가지 않음)
//
//-------------------------------------------------------------------
//보안ER
//1. 문자 추출 사각형 생성
//      문자열(3문자 이상)을 받아온다
//      문자열에서 3번재 위치한 문자로 5*5 크기의 사각형을 출력한다
//      [출력 예시]
//            문자열을 입력해 주세요 : hello
//            l l l l l 
//            l l l l l 
//            l l l l l 
//            l l l l l 
//            l l l l l
//
//1-2(심화) 문자 추출 사각형 생성
//      문자열(3문자 이상)을 받아온다
//      문자열에서 3번재 위치한 문자로 5*5 크기의 가운데가 비어있는 사각형을 출력한다
//      [출력 예시]
//            문자열을 입력해 주세요 : hello
//            l l l l l 
//            l       l 
//            l       l 
//            l       l
//            l l l l l
//
//2. 평균 성적, 평균 학점 계산
//  사용자로부터 3과목의 점수를 각각 입력받고 주어진 표에 맞게 계산하여 평균 학점과 평균 성적을 계산하시오
//  <표>
//    점수   ㅣ  등급  ㅣ    학점
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//   95-100 ㅣ   A+  ㅣ   (4.5)
//   90-94  ㅣ   A    ㅣ    (4.0)
//   85-89  ㅣ   B+  ㅣ    (3.5)
//   80-84  ㅣ   B    ㅣ    (3)
//   75-79  ㅣ   C+  ㅣ   (2.5)
//   75미만  ㅣ   F   ㅣ    (0)
//
//[출력 예시1]
//3과목의 성적을 입력해 주세요 : 90 89 98
//평균 학점 : 4.0
//평균 성적 : A
//
//[출력 예시2]
//3과목의 성적을 입력해 주세요 : 74 74 74
//평균 학점 : 0.0
//평균 성적 : F 
//

package doWhileTest;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {

		// 구구단을 어디까지 출력할까요? : 4
		// 1 * 1 = 1 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
		// 1 * 2 = 2 2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
		// 1 * 3 = 3 2 * 3 = 6 3 * 3 = 9 4 * 3 = 12
		// 1 * 4 = 4 2 * 4 = 8 3 * 4 = 12 4 * 4 = 16
		// 1 * 5 = 5 2 * 5 = 10 3 * 5 = 15 4 * 5 = 20
		// 1 * 6 = 6 2 * 6 = 12 3 * 6 = 18 4 * 6 = 24
		// 1 * 7 = 7 2 * 7 = 14 3 * 7 = 21 4 * 7 = 28
		// 1 * 8 = 8 2 * 8 = 16 3 * 8 = 24 4 * 8 = 32
		// 1 * 9 = 9 2 * 9 = 18 3 * 9 = 27 4 * 9 = 36
		//

		// 문제 1. 사용자가 입력한 숫자까지 구구단을 출력하는 프로그램
		// 구구단은 1단부터 9단까지다.
		// 사용자가 4를 입력할 경우 1단부터 4단까지 아래와 같은 형식으로 출력한다. 단은 \t로 구분한다.
		// (이중 for 문 사용, if 사용 X)
		//
//		int inputValue = 0 ;									// 사용자로부터 받는 입력값
//		Scanner scan = new Scanner(System.in);					// scan 입력 메소드
//		
//		System.out.printf("숫자를 입력면 그 숫자의 구구단을 출력합니다 : ");	// 안내 메시지
//		inputValue = scan.nextInt();							// 입력값을 변수에 할당
//		for (int i = 1; i <= 9; i++) {							// 1~9까지 출력하는 구구단
//			for(int j = 1; j <= inputValue; j++) {				// 입력한 값까지 반복하는 단수 반복문
//				System.out.printf("%d * %d = %d",j,i,(i * j));	// 구구단 계산 및 출력
//				System.out.print("\t");							// 각 단을 \t 로 구분
//				
//			}
//			System.out.println();								// 줄넘김
//			inputValue = nextLine();							// buffer 정리
//		}
//		

//			문제 2. UP&DOWN 게임
//		   게임의 정답은 정해놓는다.
//		   사용자에게 1 ~ 50까지의 정수를 입력 받고, 입력 받은 값이 정답보다 크면 "DOWN!"을 출력한다
//		   정답보다 작으면 "UP"을 출력한다.
//		   정답이 아닐 경우 "값을 다시 입력해 주세요 : " 를 출력한 후, 값을 다시 입력 받는다.
//		   정답을 맞히면 "정답입니다 *번 째에 맞혔습니다!"를 출력하고 프로그램을 종료한다.
//		   단, 1 ~ 50까지의 정수 범위를 벗어나면 "1 ~ 50까지의 숫자만 입력해주세요 : " 를 출력한다.

//		Scanner scan = new Scanner(System.in); // 입력메소드 import
//
//		int answer = 0; // 사용자의 입력값을 받을 변수
//		int magicNumber = 20; // 게임 정답
//		int count = 0; // 몇번째에 성공했는지 숫자로 판별
//
//		boolean isLoop = true; // 반복문을 실행시킬 조건
//
//		System.out.printf("숫자를 입력하여 updown 게임을 시작하십시오 : ");	//게임 시작 안내문
//		while (isLoop) { 											// isLoop가 true이면 반복문을 실행
//			answer = scan.nextInt();								// 입력값을 변수에 저장
//			
//			if (answer > magicNumber) { // 입력값이 정답보다 큰 경우
//				System.out.printf("\nDOWN!\n"); // down 안내문 출력
//				System.out.print("오답입니다. 다시 값을 입력해주세요.\n값 : "); // 안내문 출력
//
//				count++;
//
//			} else if (answer < magicNumber) { // 입력값이 정답보다 작을 경우
//				System.out.printf("\nUP!\n");// up 안내문 출력
//				System.out.print("오답입니다. 다시 값을 입력해주세요.\n값 : "); // 안내문 출력
//
//				count++;
//
//			} else if (answer == magicNumber) { // 입력값이 정답과 일치 할 경우
//				System.out.printf("정답입니다 %d 번째에 맟혔습니다.", count);// count로 몇번째에 성공했는지 출력
//				isLoop = false; // 반복문을 반복시키는 조건을 false로 변경하여 루프 종료시키기
//			}
//
//		}
//		scan.close(); // scanner 입력메소드 도구 종료
//		

//		 문제 3번
//	      ** logic

//	      - 이중 for문 사용 (위로 향하는 삼각형은 행 : 6, 열 : 6 / 아래로 향하는 삼각형 행 : 5, 열 : 5)
//	      (1)   여백은 행이 내려갈수록 증가, *도 행이 내려갈수록 증가
//	      (2)   여백은 행이 내려갈수록 증가, *이 행이 내려갈수록 감소

//	      
//	      for (int i = 1; i <= 6; i++) {					//위로 향한는 삼각형의 마지막 행을 6으로 설정
//	         for (int j = 5; j >= i; j--) {					// 여백이 반복이 거듭 될수록 하나씩 제거됨
//	            System.out.print(" ");						// 출력
//	         }
//	         for (int k = 1; k < i+1; k++) {				// *이 행이 거듭 될수록 하나씩 추가됨
//	            System.out.print("* ");  					// 출력
//	         }
//	         System.out.println();							// 줄넘김
//	      }
//	     
//	      for (int l = 1; l < 6; l++) {						//아래로 향한는 삼각형의 마지막 행을 5으로 설정
//	         for (int m = 0; m < l; m++) {					//여백이 반복이 거듭될 수 록 하나씩 추가됨
//	            System.out.print(" ");						// 출력
//	         }
//	      
//	         for (int n = 5; n >= 0+l; n--) {				// *이 반복이 거듭될 수 록 하나씩 제거됨
//	            System.out.print("* ");						// 출력
//	         }	
//	         System.out.println();							// 줄넘김
//	      }
//			scan.close(); // scanner 입력메소드 도구 종료

//	      문제 4번
//	      1) 입력클래스 import
//	      2) 정수 변수선언 (콜라, 사이다, 커피, 입력받은 금액, 거스름돈)
//	      3) while문 출력
//	      6) switch문 (답변 선택 / 잔액반환 받으면 종료) {
//	         6-1) 구매 가능시 메세지 출력 (음료수가 나왔습니다, 구매 가능한 음료수 개수)
//	            잔액 / 음료수 = 구매 가능 개수 확인해서 출력
//	            소지금액 - 사용한 금액 = 잔액 출력
//	              --> 반복문으로 다시 돌아가서 반복 (= 선택지 출력)
//	         6-2) 잔액 부족시 잔액반환 누르고 종료
//	               > 잔액 출력 (0000원이 반환되었습니다)
//	               > 잔액 반환 (= 프로그램 종료)
//	         6-3) 그 외 번호 입력시 '잘못된 입력입니다' 출력
//	      7) 버퍼 비우기 (잔액이 0이 되면 반복 종료) {

//	      Scanner sc = new Scanner(System.in);					
//	      
//	      int balance = 0; 							//잔액을 저장할 변수 선언
//	      int choice = 0;							//선택한 메뉴 입력값 저장할 변수 선언
//	      int result = 0;							//연산 결과를 저장할 변수 선언
//	      final int COFFEE = 4000;					//커피값을 상수로 선언
//	      final int COKE = 2500;					//콜라값을 상수로 선언
//	      final int CIDER = 2000;					//사이다값을 상수로 선언
//	      boolean isLoop = true;					//반복문 조건 bool 선언
//	      
//	      
//	      System.out.print("\n금액을 입력해주세요 : ");	// 안내 메시지
//	      balance = sc.nextInt();					// 입력받은 값을 잔액에 추가
//	      while (isLoop) {							// isLoop가 true일때 반복
//	         System.out.println("메뉴 출력 1~4번까지\r\n"	// 메뉴 출력
//	               + "      1 콜라 : 2500\r\n"
//	               + "      2 사이다 : 2000\r\n"
//	               + "      3 커피 : 4000\r\n"
//	               + "      4 잔액반환");
//	         System.out.print("\n메뉴 입력해주세요 : ");		// 안내 메시지
//	         choice = sc.nextInt();						// 메뉴 입력값을 choice에 저장
//	         
//	         switch (choice) {							//choice 값에 따라 분기
//	         case 1:   // 콜라
//	            result = balance / COKE;				// 구매가능한 콜라의 개수 연산
//	            System.out.println("구매 가능한 음료 개수는 " + result + "개 입니다");	// 결과 출력
//	            balance = balance-(result*COKE);					//구매후 잔액 연산
//	            System.out.println("잔액은 " + balance + "원 입니다");	// 잔액 출력
//	            break;												// 첫화면으로 돌아가기
//	         case 2:   // 사이다
//	            result = balance / CIDER;							// 구매가능한 사이다의 개수 연산
//	            System.out.println("구매 가능한 음료 개수는 " + result + "개 입니다"); //결과 출력
//	            balance = balance-(result*CIDER);					//구매후 잔액 연산
//	            System.out.println("잔액은 " + balance + "원 입니다");	// 잔액 출력
//	            break;												// 첫화면으로 돌아가기
//	         case 3:   // 커피
//	            result = balance / COFFEE;							// 구매가능한 사이다의 개수 연산
//	            System.out.println("구매 가능한 음료 개수는 " + result + "개 입니다");	//결과 출력
//	            balance = balance-(result*COFFEE);					//구매후 잔액 연산
//	            System.out.println("잔액은 " + balance + "원 입니다");	// 잔액 출력
//	            break;												// 첫화면으로 돌아가기
//	         case 4:   // 반환
//	            System.out.println("잔액은 " + balance + "원 입니다");	//현재 잔액 출력
//	            System.out.println(balance + "원 반환되었습니다.");		//안내 메시지
//	            isLoop = false;										// 루프 종료
//	            break;
//	         default:
//	            System.out.println("잘못 입력하셨습니다\n");				//잘못된 값 입력시 출력
//	            break;
//	         }
//	         
//	      }
//	      
//	      sc.close();												//버퍼 정리
//		
		// 문제 5번 : 점심 선택 및 가격 확인

		// 사용자로부터 점심 메뉴를 입력받아 해당 메뉴와 가격을 출력하기
		// - 점심 메뉴 4가지에서만 가능하다
		// 짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)
		// - 올바른 메뉴를 입력할 때까지 반복합니다.
		// - 잘못된 메뉴를 입력하면 다시 입력받습니다.

//		  1. 입력클래스 import
//    	  2. 문자열 변수(입력 받을 값) , 상수(메뉴가격) 선언
//    	  3. while문 출력
//    	  4. switch문 메뉴 선택
//		  5. 선택한 메뉴 이름과 가격을 출력
//        6. 올바른 메뉴를 입력하여 값을 출력하면 종료
//        7. 올바른 값이 아니면 프로세스 반복

//		Scanner sc = new Scanner(System.in);					
//	
//		String inputValue = "";						// 입력받은 수를 저장할 변수 선언
//	    final int BLACK_NOODLE_PRICE = 5000; 		//짜장면을 가격을 저장할 상수 선언
//	    final int DONKATSU_PRICE = 8000; 			//돈까스 가격을 저장할 상수 선언
//	    final int PIZZA_PRICE = 25000; 				//피자을 가격을 저장할 상수 선언
//	    final int HAMBERGUR_PRICE = 6000; 			//햄버거을 가격을 저장할 상수 선언
//	    boolean isLoop = true;						//반복문 조건 bool 선언
////    
////    
//    while (isLoop) {							// isLoop가 true일때 반복
//   
//    	System.out.print("오늘의 점심 메뉴 입니다.\n메뉴를 입력하면 가격이 출력됩니다.\n짜장\n돈까스\n피자\n햄버거");	// 안내 메시지
//       System.out.print("\n\n메뉴 입력해주세요 : ");		// 안내 메시지
//       inputValue = sc.nextLine();						// 메뉴 입력값을 choice에 저장
//       System.out.println(inputValue);
//       if (inputValue.equals("짜장")) {							//inputValue 값에 따라 분기
//    	   //짜장을 입력했을 경우
//          System.out.println(inputValue + " 는(은) " + BLACK_NOODLE_PRICE +" 원 입니다.");	// 결과 출력
//          break;
//
//       }else if(inputValue.equals("돈까스")) {
//    	   //돈까스을 입력했을 경우
//           System.out.println(inputValue + " 는(은) " + DONKATSU_PRICE +"원 입니다.");	// 결과 출력 
//           break;
//       }else if (inputValue.equals("피자")) {
//    	   //피자을 입력했을 경우
//
//    	   System.out.println(inputValue + " 는(은) " + PIZZA_PRICE +"원 입니다.");	// 결과 출력 
//           break;
//       }else if (inputValue.equals("햄버거")) {
//    	   //햄버거을 입력했을 경우
//
// 	   		System.out.println(inputValue + " 는(은) " + HAMBERGUR_PRICE +"원 입니다.");	// 결과 출력 
// 	   		break;
//       }else {
//    	   //메뉴명을 잘못 입력했을 경우
//
//	   		System.out.println(inputValue + " 는(은) " + "올바른 메뉴값이 아닙니다. 다시 입력해주세요.");	// 결과 출력 
//
//       }
//    }
//    sc.close();												//버퍼 정리

		// 문제 6번 : 문자의 아스키코드 값 확인
		// 사용자로부터 문자를 입력받아 아스키코드 값을 확인하고 입력받은 문자를 아스키코드 값으로 변환한다
		// 사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여 여러번 입력받도록 한다
		// 'A'를 입력하면 종료하고 종료 메시지를 출력한다
		//

//		1. 입력클래스 import
//  	2. 문자 변수 선언
//  	3. while문 출력
//		4. 입력한 알파벳을 아스키 코드로 변환
//		5. 변환한 값을 출력
//      

//		Scanner sc = new Scanner(System.in);
//
//		char inputValue = ' '; // 입력받은 수를 저장할 변수 선언
//		int ascii = 0;
//		final String KILL_KEY = "A"; // A를 프로그램 종료 입력값으로 선언
//		
//		boolean isLoop = true; // 반복문 조건 bool 선언
//		Scanner scan = new Scanner(System.in);					
//
//
//		while (isLoop) { // isLoop가 true일때 반복
//
//			System.out.print("알파벳을 입력하면 아스키 코드값으로 출력합니다 : \n"); // 안내 메시지
//			inputValue = scan.nextLine().charAt(0); // 입력하는 문자의 값을 charAt(0)으로 첫 글자만 받아옴
//
//			ascii = (int) inputValue;					// 첫글자를 숫자(아스키값)로 변환
//			if(ascii != 65) {							// 입력값이 A가 아닌 경우
//			System.out.printf("%c의 ASCII값은 : %d 입니다.\n\n",inputValue,ascii); // 변환 결과 출력
//			}else {
//				System.out.printf("%c는 프로그램 종료 코드입니다. 프로그램을 종료합니다.",inputValue); // 변환 결과 출력
//				break;
//			}
//						
//		}
//		sc.close(); // 버퍼 정리
		
		
		
		
		
		
		
		
		

	}
}
