package ex03_황어진;

import java.util.Iterator;

public class Star1 {
	public static void main(String[] args) {

//		3. 아래 내용과 동일하게 출력하라(로직구성 필요없음)
//
//		(1) 피라미드 출력
//
//		- 클래스명 : Stars1
//		 (2) 사용자로부터 행을 입력받아 입력받은 숫자만큼 행으로 직각삼각형 출력

//			- 클래스명 : Stars2
//
//		[입출력결과]
//		   *
//		  * *
//		 * * *

		/*
		 * logic
		 * 
		 * 2중 for 문 사용하고 
		 * 하나는 공백 
		 * 하나는 *을 출력하는 for문 사용 
		 * 전체 행 반복은 총 3번 열 반복도 3번
		 *
		 * 
		 */

		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
