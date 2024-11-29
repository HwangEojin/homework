//황어진
package task;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
		// 배열문제 조건
		// 1) 칸수만 알고있다고 가정
		// 조건 2) 반드시 length 사용
		// 조건 3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용

		// 1. 100~1까지의 값을 배열에 넣고 출력
		// 일반 for문만 사용

		// logic
		// 배열을 선언, 배열의 길이는 100
		// 반복문을 수행하면서 값을 대입하는 반복문 1개 수행
		// 반복문을 수행하면서 값을 출력만 하는 반복문 1개 수행

//			int numArray[] = new int[100];				// 배열을 한개 선언하고 배열의 길이는 100
//			
//			for (int i = 0; i < numArray.length; i++) { //100번 반복을 수행하여 값을 대입한다.
//				numArray[i] = i+1;						// numArray의 i번째 index에 i + 1의 값을 대입한다.
//			}
//			
//			for (int i = 0; i < numArray.length; i++) { //100번 반복을 수행하여 값을 출력
//				System.out.println(numArray[i]); 		// numArray의[i]번째 값을 출력한다.
//			}

		// 2. 1~10까지의 값을 배열에 넣고 총 합 구하기
		// 일반 for문만 사용

		// logic
		// 배열을 선언, 배열의 길이는 10
		// 반복문을 수행하면서 값을 대입하는 반복문 1개 수행
		// 반복문을 수행하면서 값을 출력만 하는 반복문 1개 수행
		// 총합을 담는 변수 한개를 선언하고, 대입하는 반복문에서 총합을 누적 합산

//			int numArray[] = new int[10];			// 길이가 10인 배열을 선언
//			int sum = 0;							// 합계를 변수로 선언
//			for (int i = 0; i < numArray.length; i++) {	// 반복의 최소값은 0이고 배열의 길이만큼 반복 수행;
//				numArray[i] = i + 1;					// 배열의 i번째 index에 i+1의 값을 대입한다.
//				sum += (i + 1);								// 값을 sum 변수에 누적 합산한다.
//			}
//			for (int i = 0; i < numArray.length; i++) {	// 반복의 최소값은 0이고 배열의 길이만큼 반복 수행;
//				System.out.println(numArray[i]);		// 배열의 i번째 index의 값을 출력한다.
//			}
//			System.out.printf("1부터 10까지의 값을 누적 합산한 값은? : %d",sum);								// 누적 합산한 값을 출력한다..

		// 3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균(소수점 3자리까지) 구하기
		// 일반 for문, for-each문 상관없음

		// logic

		// scanner 도구를 import
		// 사용자로부터 입력받을 값을 double 변수로 선언
		// 입력 받은 값을 담을 배열을 선언
		// 입력 받은 값을 변수에 대입
		// for 문으로 배열에 값을 대입하고
		// for 문으로 배열의 값을 출력
		// 네 숫자의 평균을 구하는 연산식을 수행
		// 연산식 출력

//			Scanner scan = new Scanner(System.in); // 스캐너 도구를 임포트 
//						
//			double inputValue = 0;					//이동자로부터 입력받을 값을 double 변수 선언
//			double avr = 0;							// 평균값을 입력받을 변수 하나를 선언
//			double numArray[] = new double[4];		// 배열의 길이는 4
//			
//			System.out.print("숫자 4개를 입력해주세요 :");
//			for (int i = 0; i < numArray.length; i++) {	// 최소값은 0이고 numArray의 최대 길이만큼 반복
//				inputValue = scan.nextDouble();			// 네 숫자를 띄어쓰기로 입력 받고
//				numArray[i] = inputValue;				//numArray에 i번째 index에 사용자 입력 값을 대입
//			}
//			avr = (numArray[0] + numArray[1] + numArray[2] + numArray[3]) / numArray.length; // avr 변수에 평균을 구하는 연산식을 수행해서 대입
//			System.out.printf("네 숫자의 평균은 다음과 같습니다 : %.3f",avr);							// 계산값을 출력
//			scan.close(); 																	//버퍼 정리								
//		

		// 4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		// 출력시 for-each문 사용

		// logic

		// 배열을 선언 배열의 길이는 10
		// 10번 반복문을 수행하면서 배열에 값 대입
		// 5번 인덱스 부터는 값이 다시 0이 되므로 5번째 수행에서 i-5
		// i의 값을 배열에 대입
		// for - each 문으로 각 배열의 값을 차례로 출력

//		int numArray[] = new int[10]; // 숫자를 담을 배열 변수를 하나 선언 길이는 10
//
//		for (int i= 0; i < numArray.length; i++) {		//반복을 배열의 길이만큼 수행
//			numArray[i] = i;							// 배열의 i번째 index에 i를 대입
//			if(5<= i) {									// 만약 i의 값이 5보다 크거나 같다면...
//				numArray[i] = i-5;						// 배열의 대입되는 i 값에서 5를 뺀다.
//			}
//		}
//		
//		for(int j : numArray) {							//for -each 문으로 현재 배열의 index를 순차적으로 출력
//			System.out.print(j);						//각 index가 j에 할당되고 출력됨이, array가 끝날때까지 반복한다.
//		}

		// 5. A~F까지를 C만 제외하고 배열에 담아 출력
		// 일반 for문
		// 초기식 int i = 0;

		// logic

		// 값을 담을 char 타입 배열을 선언 길이는 6
		// A ~ F 까지의 값을 아스키값으로 보면
		// A(65) ~ F(70)이고,
		// 5번 반복을 통해 배열에 대입
		// 반복중 2번째가 오면, 값을 대입하지 않고 다음 반복으로 넘어감
		// 대입된 배열의 값을 출력

//		char numArray[] = new char[6];						//배열을 변수로 선언 길이는 6
//		for (int i = 0; i < numArray.length; i++) {			// A부터 배열의 길이 만큼 반복
//			if (i == 2) continue;							// 2번째 (C)라면 이번 반복을 한차례 건너뛰고 다음 반복를 실행
//			numArray[i] = (char)(i + 65);					// 배열 각 index에 알파벳 값 대입		
//			System.out.println((char)(i + 65));
//		}
//		for(char i : numArray) {							//for -each 문으로 현재 배열의 index를 순차적으로 출력
//			System.out.print(i);							//각 index가 i에 할당되고 출력됨이, array가 끝날때까지 반복한다.
//		};

		// 6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력

		// logic

		// 문자열 전체를 담을 char 타입 배열 변수를 하나 선언
		// 각 문자를 아스키 코드로 번호로 바꿔보면 다음과 같다.
		// 97, 66 ,99 ,68....121,90
		// 소문자 대문자 각각 2씩 증가하는 것을 볼 수 있다.
		// 소문자는 97에서 121
		// 배열의 길이 만큼 반복을 수행하고,
		// 소문자는 i+97 연산으로 대입하고
		// 대문자는 i+66 연산으로 대입

//			char chaArr[]= new char[26];				// a-Z까지 26의 길이의 배열을 선언
//			for (int i = 0; i <chaArr.length; i+=2) { // 초기값 0에서 배열 길이 만큼 2씩 증가
//				char lowerCase = (char) (i + 97);	// 소문자 아스키코드 i + 97의 값을 문자로 변환
//				char upperCase = (char)(i + 66);	// 대문자 아스키코드는 i + 66 연산후 출력
//				chaArr[i+1] = upperCase;			// 배열에 i+1번째 index에 대문자를 넣음
//				chaArr[i] = lowerCase;				// 배열의 i 번째 index에 소문자를 넣음
//			}
//		
//			for(char i : chaArr) {							//for -each 문으로 현재 배열의 index를 순차적으로 출력
//				System.out.print(i);							//각 index가 i에 할당되고 출력됨이, array가 끝날때까지 반복한다.
//			};

		// 7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기

		// 일반 for문

		// logic

		// scanner 도구 import
		// 정수 입력값을 저장할 변수를 선언
		// 최대값, 최소값을 저장할 변수 선언
		// 입력값을 저장을 할 배열을 선언
		// 입력값을 받으면 변수에 할당
		// 최소값을 계산 중첩 삼항연산자
		// 최대값을 계산 중첩 삼항연산자
		// 너무너무 복잡해지는 코드...
		// 정말 이게 최선일까?
		// 입력받을때마다 이전에 입력받았던 값이랑 비교해서 인덱스 0을 가장 최소숫자 인덱스 4를 최대 숫자로 할수있을까
		// 결과 출력

		Scanner scan = new Scanner(System.in); // 입력 메소드 import

		int inputValue = 0; // 입력값을 저장할 변수 선언

		int minValue = 0; // 연산후 최소값을 저장할 변수 선언
		int maxValue = 0; // 연산후 최대값을 저장할 변수 선언

		int numArr[] = new int[5]; // 길이 5의 정수 타입을 저장할 배열 선언

		for (int i = 0; i < numArr.length; i++) { // 0 부터 배열의 길이까지 반복

			System.out.println("숫자를 입력해주세요. : ");
			inputValue = scan.nextInt(); // 입력값을 받아서 변수에 저장
			numArr[i] = inputValue;
			
			for (int j : numArr) {
					if ((numArr[i] > numArr[0])) {
						int temp = numArr[i];
						int temp1 = numArr[0];
						numArr[i] = temp1;
						numArr[0] = temp;
					}
			}
		}


		

		for (int i : numArr) { // for -each 문으로 현재 배열의 index를 순차적으로 출력
			System.out.print(numArr[i]); // 각 index가 i에 할당되고 출력됨이, array가 끝날때까지 반복한다.
		};
		

		// 8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		// 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기

		// 9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
		// 3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!
	}
}
