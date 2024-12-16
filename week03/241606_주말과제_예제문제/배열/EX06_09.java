package section06;

import java.util.Arrays;
import java.util.Comparator;

public class EX06_09 {
	public static void main(String[] args) {
		Integer arr[] = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // 배열 생성

		System.out.println(Arrays.toString(arr)); // 정렬전 배열
		Arrays.sort(arr,Comparator.reverseOrder()); // 내림차순 정렬
		System.out.println(Arrays.toString(arr)); // 정렬후 배열
	}
}
