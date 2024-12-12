package ex03_황어진;

import java.util.Scanner;

public class Star2 {
public static void main(String[] args) {
//	 (2) 사용자로부터 행을 입력받아 입력받은 숫자만큼 행으로 직각삼각형 출력
//		- 클래스명 : Stars2
//			[입출력결과]
//
//			출력하고 싶은 행 입력 : 4
//			*
//			**
//			***
//			****
	
	/*
	 * logic

	 * star2 
	 * 
	 * 입력값을 변수에 저장하고
	 * 각 행의 반복을 입력값 만큼 반복하게 함.
	 * 공백은 필요없음
	 * 
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("출력하고 싶은 행 입력 : ");
	int inputValue = sc.nextInt() + 1;
	
	for (int i = 1; i < inputValue; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
