package section06;

import java.util.Arrays;

public class EX06_10 {
	public static void main(String[] args) {
		int[] arr01 = {1,2,3};
		
		//배열의 얕은 복사
		int[] arr02 = arr01;
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		
		//arr02배열 값 변경
		arr02[1] = 10;
		
		//arr01 변경 후 배열 출력
		System.out.println("arr02 배열 : " + Arrays.toString(arr01));
		System.out.println("arr01 배열 : " + Arrays.toString(arr02));
	}
}
