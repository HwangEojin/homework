package section06;

import java.util.Iterator;

public class EX06_04 {
	public static void main(String[] args) {
		// 10개의 배열을 선언
		
		int[] numbers = new int[10];					// 길이가 10인 배열생성
		
		//배열의 랜덤 함수를 이용해 값을 입력
		for(int i = 0; i < numbers.length; i++) {		// 배열의 길이만큼 반복
			//랜덤함수를 이용해 각 배열 위치에 값을 입력
			numbers[i] = (int)(Math.random() * 30) + 1;
		}
		//배열 안에서 짝수만 구해서 합 구하기
		int sum = 0;									// 합계는 0
		for(int i = 0 ; i < numbers.length; i++) {		// 배열의 길이만큼 반복
			if(numbers[i] % 2 ==0) {					// i번째가 짝수라면
				sum += numbers[i];						// 합계에 i번째 값을 누적합산
			}
		}
		
		//출력해보기
		for(int i = 0 ; i< numbers.length; i++) {		// 배열의 길이만큼 반복
			// numbers 배열의 랜덤값 출력
			System.out.println(numbers[i] + " ");		// i번째 값을 출력
		}
		//줄바꾸기
		System.out.println();
		System.out.println("배열의 짝수들의 합 : " + sum);	// 총합 출력
		
	}
}
