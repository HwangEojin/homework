package homework;

public class EX08_15 {
	public static void main(String[] args) {
		EX08_15 mid = new EX08_15();				// mid 객체 생성
		int []studentA = {97,52};					// 배열 생성
		int []studentB = {32,52};					// 배열 생성
		
		int sumA = mid.score(studentA);				// 매소드 호출 결과 값을 sumA에 저장
		int sumB = mid.score(studentB);				// 매소드 호출 결과 값을 sumB에 저장
		
		if(sumA > sumB) {							// sum A가 sumB보다 클 때
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");		// 출력
		}else if(sumA < sumB) {						// sumB가 sumA보다 클 때 
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");		// 출력
		}else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");		// 출력
		}
		
		
	}
	int score(int scores[]) {						// 메소드 선언
		int result =0;								// 결과를 저장할 변수 선언
		for(int i =0; i < scores.length; i++) {		// scores의 배열의 길이만큼 반복
			result += scores[i];					// result에 scores의 i번째 index값을 누적 합산
		}
		return result;								//result 값을 반환
		
	}
}
