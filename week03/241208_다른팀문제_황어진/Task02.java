package methodTask;

import java.util.Scanner;

public class Task02 {
	// methods

//	
//	  문제2.
//	  
//	  ★메소드를 활용한 연령대별 버스카드 프로그램★
//	  
//	  연령대를 입력받고(입력) 연령대를 판별한다(어린이, 청소년, 성인)(메소드1)
//	  버스카드에 일정 금액 돈을 충전한다(입력) 
//	  버스카드를 사용(메소드2){ 
//	  // int요금과 String연령대가 들어간다(매개변수 2개) 연령대별 요금을 설정한다(final 변수)
//	  잔액 소진할 때까지 버스카드 사용(반복문) 버스카드를 사용하는동안 "버스 탑승 완료." 출력
//	  "버스를 탑니다. 잔액 : " 출력 잔액이 부족해지면 "잔액이 부족합니다."
//	  출력하고 프로그램 종료(탈출) }

//	  logic
//	  
//	  Scanner import
//	  금액 입력값을 저장할 변수 선언 (버스카드)
//	  연령대를 입력받아 조건에 따라 변수 판멸하는 메소드를 선언(메소드1)
//	  string을 return 하는 메소드
//	  
//	  연령대별로 금액을 다르게 차감하는 메소드 선언(메소드2)
//	  while문으로 잔액이 소진 될때까지 반복을 수행하고
//	  반복하는 동안 안내 메시지 출력
//	  잔액이 부족하면 메시지 출력 후 탈출

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 입력 메소드 import
		Task02 task02 = new Task02(); // 객체 생성

		int busCard = 0; // 버스카드 잔액을 저장할 변수 선언
		int age = 0; // 나이 변수 선언
		String ageRange = ""; // 나이대를 저장할 문자열 변수

		System.out.println("나이를 입력하세요."); // 메시지 출력
		age = sc.nextInt(); // 나이에 입력값을 저장
		ageRange = task02.howOld(age); // 나이대 판별 메소드를 호출하여 return 값을 변수에 저장

		System.out.println("충전할 금액을 입력하세요");// 메시지 출력
		busCard = sc.nextInt(); // 버스카드에 입력값 저장
		task02.useBusCard(busCard, ageRange); // 버스카드 사용 메소드 호출

	}

	// 나이대를 판별하는 메소드
	String howOld(int inputValue) { // parameter로 나이 입력값을 받음

		String ageRange = ""; // 연령대를 문자열로 저장

		if (inputValue >= 19) { // 19 이상
			System.out.println("성인입니다."); // 메시치 출력
			ageRange += "성인"; // 변수에 성인 저장
		} else if ((12 <= inputValue) && (inputValue < 19)) {// 12세이상 부터 19세 미만까지
			System.out.println("청소년입니다.");// 메시지 출력
			ageRange += "청소년"; // 변수에 청소년 저장
		} else if (inputValue < 12) { // 12세 미만이라면
			System.out.println("어린이입니다.");// 메시지 출력
			ageRange += "어린이"; // 변수에 어린이 저장
		} else { // 그 외에 입력값
			System.out.println("올바른 입력값이 아닙니다."); // 메시지 출력
			ageRange += "error"; // 변수에 error 저장
			return ageRange; // 나이대 문자열 반환
		}
		return ageRange; // 나이대 문자열 반환
	}

	// 버스를 사용하여 금액을 차감하는 메소드
	void useBusCard(int moneyParam, String ageRangeParam) {	// parameter로 나이대와 금액을 넘겨받음
		int balance = moneyParam;		// 잔액변수에 넘겨받은 금액을 저장
		final int KID = 400;			// 상수에 금액 저장
		final int ADOLESCENT = 800;		// 상수에 금액 저장
		final int ADULT = 1200;			// 상수에 금액 저장

		System.out.println("잔액 : " + balance); // 잔액 출력

		while (balance > 0) {					// 잔액이 남아있는한 계속 반복

			switch (ageRangeParam) {			// 나이대에 따라 출력
			case "성인": {						// 성인일 경우
				if (ADULT <= balance) {			// 요금을 지불 할 수 있으면,
					balance -= ADULT;			// 잔액에서 요금만큼 차감
					System.out.println("버스 탑승 완료");	// 메시지 출력
					System.out.println("버스 잔액 : " + balance);	// 잔액 출력
				} else {						// 요금을 지불 할 수 없다면
					System.out.println("잔액이 부족합니다.");	// 잔액 부족 메시지 출력
					return;								// 반복 탈출
				}
				break;									// break
			}
			case "청소년": {								// 청소년일 경우
				if (ADOLESCENT <= balance) {			// 요금을 지불 할 수 있으면,
					balance -= ADOLESCENT;				// 잔액에서 요금만큼 차감
					System.out.println("버스 탑승 완료");	// 메시지 출력
					System.out.println("버스 잔액 : " + balance);	// 잔액 출력
				} else {								// 요금을 지불 할 수 없다면
					System.out.println("잔액이 부족합니다.");// 잔액 부족 메시지 출력
					return;								// 반복 탈출
				}
				break;									// break
			}
			case "어린이": {								// 어린이일 경우
				if (KID <= balance) {					// 요금을 지불 할 수 있으면,
					balance -= KID;						// 잔액에서 요금만큼 차감
					System.out.println("버스 탑승 완료");
					System.out.println("버스 잔액 : " + balance);
				} else {								// 요금을 지불 할 수 없다면
					System.out.println("잔액이 부족합니다.");// 잔액 부족 메시지 출력
					return;								// 반복 탈출
				}
				break;									// break
			}
			default:
				System.out.println("올바른 입력값이 아닙니다.");// 예외처리
				return;
			}

		}

	}

}
