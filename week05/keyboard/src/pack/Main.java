package pack;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	/**
	 * Introduce
	 * 
	 * 간단한 타이핑 프로그램입니다.
	 * sample 예문을 하나 출력하고
	 * 그 예문을 따라 사용자가 직접 입력합니다.
	 * 타이핑 속도는 측정해주지 않지만, 오타율과 어떤 문자를 잘못 입력했는지 알려주는 프로그램입니다.
	 * 
	 * 추후 업그레이드 예정.
	 * 
	 */
	
	
	/*
	 * structure
	 * 
	 * pack
	 * |
	 * |----Main.class
	 * |
	 * |----TypeService.class
	 * |
	 * |----?
	 * 
	 * 
	 */
	
	/**
	 * logic
	 * 
	 * 임의의 예문을 String변수로 하나 설정하고,
	 * 입력값을 담은 변수와 비교
	 * 
	 * 비교는 모든 문자열을 배열로 바꿔서 각 인덱스끼리 비교
	 * 오타율은 예문의 길이 / 오타 갯수 * 100
	 *  
	 * 
	 */
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sampleText = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리 나라 만세.";
		char sampleTextArr[] = sampleText.toCharArray();
		char uTypedArr[] = new char[sampleText.length()];
		int correctCounter =0;
		int wrongCounter =0;
		int whatIsWrong[] = new int [sampleText.length()];
		
		
		System.out.println("예문을 따라 입력하세요.");
		System.out.println(sampleText);
		String uTyped = scan.nextLine();
		
		
		
		
		for(int i =0; i< sampleTextArr.length; i++ ) {
			if(sampleTextArr[i] == uTypedArr[i]) {
				correctCounter ++;
			}else if(sampleTextArr[i] != uTypedArr[i]) {
				wrongCounter++;
				whatIsWrong[i]  = i;
			}
		}
		
		System.out.printf("결과 : 오타개수 = %d\n",wrongCounter);
		

		for(int i =0; i< uTypedArr[i]; i++ ) {
			if (uTypedArr[i] == whatIsWrong[i]) {
				System.out.print("^"+uTypedArr[i]+"^");
			}
			System.out.print(uTypedArr[i]);

		}
		
		
		
		
		

	}

}
