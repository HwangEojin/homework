package homework;

public class EX08_13 {
	
	void sum (int[] nums) {						// 출력값이 없고 배열을 매개변수로 받는 메소드 생성
		int result = 0;							// 결과를 저장할 변수 선언
		for(int i = 0; i< nums.length; i++) {	//nums의 배열길이만큼 반복
			result += nums[i];		// 매개변수로 받은 배열의 요소 값을 하나씩 result 값에 더함
		}
		System.out.println("숫자들의 합은" + result + "입니다."); //결과 출력 
		
//		return result; 							// 매개변수로 받은 값을 모두 더한 result 값을 다시 반환함
	}
	
	public static void main(String[] args) {
		int nums[] = {100,200}; //배열 생성
		EX08_13 calc = new EX08_13();				// 객체 생성
		
		calc.sum(nums);								// calc 인스턴스의 sum 메소드 호출;
		
	}
}
