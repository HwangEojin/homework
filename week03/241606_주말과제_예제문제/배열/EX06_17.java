package section06;

public class EX06_17 {
	public static void main(String[] args) {
		int []score = {90,92,93};			// 배열 생성
		
		int sum = 0;						// 총합 변수 선언 및 초기화
		double avg = 0;						// 평균 변수 선언 및 초기화
		
		for(int val : score) {				// for each 함수로 총합 계산
			sum+=val;
			
		}
		avg = (double) sum /3;				// 평균을 계산
		System.out.println("총점 : " + sum + ", 평균 : " + avg);	//출력
	}

}
