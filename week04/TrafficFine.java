//2) 과속 딱지 끊기
//현재 당신은 어린이 보호구역을 지나가고 있고, 과속하고 있습니다.
//그런데 불행히도 앞에 과속카메라가 있군요.
//당신이 내게될 범칙금을 계산할 수 있습니까?

//입력한 속도가 30km 이하일 때까지 "과속입니다"를 출력하고 한번 반복때마다 -1씩 속도가 감소됩니다
//30km 이하가 되면 "정상 속도입니다"를 출력하고 반복을 종료합니다.
//속도에따라 범칙금이 부과됩니다 (상수로 선언) > 최초 속도 입력시 한번만 출력
//31~50km : 6만원
//51~70km : 9만원
//71~90km : 12만원
//90km 초과 : 15만원
//필요 : while문, if문, 증감연산자(--)

//** 메소드 로직
//- 메소드 기능 : 과속 여부 판단하고 메세지 출력
//- 메소드명 : speedCamera
//- 매개변수 : int speed
//- 리턴 : String
//만약 speed가 30 초과라면 "과속입니다" 반환
//아니라면 "정상 속도입니다" 반환
//
//** 메인 메소드 로직
//	1. Scanner 클래스 import
//	2. 속도(speed) 변수선언 및 초기화
//	3. 속도에 따라 안내메세지 출력하는 제어문 사용
//	4. while 문 사용
//	5. speedCamera 메소드 호출
//	6. speed 속도가 1씩 감소
//	7. 만약 속도가 30 미만이라면 반복 종료
package project;

import java.util.Scanner; // 입력 class import

public class Task02 {

	String speedCamera(int speed) { 						// 파라미터로 속도 입력값을 받아서
		return (speed > 30) ? "과속입니다!" : "정상속도입니다."; 	// 속도가 30초과이면 "과속입니다" string 반환하는 간단한 메소드
	};

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 					// 스캐너 객체 생성
		Task02 task = new Task02(); 							// 객체 생성

		int speed = 0; 											// 속도를 저장할 변수 선언과 초기화
		int fee = 0; 											// 범칙금을 변수로 선언 및 초기화

		System.out.println("현재 당신의 속도는? (Km)"); 				// 안내 메시지
		speed = scan.nextInt(); 								// 입력값을 변수에 저장

		if (speed > 30) {										// 속도에 따라 범칙금 액수를 변수에 저장하는 조건문
			if (90 < speed) {									// 90 초과일땐
				fee = 150000;									// 15만원
			} else if ((71 <= speed) && (speed <= 90)) {		// 71 ~ 90 이하 라면
				fee = 120000;									// 12만원
			} else if ((51 <= speed) && (speed <= 70)) {		// 51 ~ 70 이하 라면
				fee = 90000;									// 9만원
			} else if ((31 <= speed) && (speed <= 50)) {		// 31 ~ 50 이하 라면
				fee = 60000;									// 6만원
			}
			System.out.println("-----범칙금-----\n31~50km : 6만원\n51~70km : 9만원\n71~90km : 12만원\n90km 초과 : 15만원\n");
			System.out.printf("당신이 내야할 범칙금은 %d원입니다\n", fee);
			
			while (speed > 30) {
				System.out.println(task.speedCamera(speed));// 메소드 호출
				speed--; // 증감 연산자 . 반복 회차마다 speed가 1씩 감소함
			}
		} else {
			System.out.println("현재 안전하게 주행중입니다.");
		}
		
		scan.close();

	}
}