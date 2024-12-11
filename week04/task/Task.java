package task;

public class Task {

//	1. 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드(람다식 이용)
//	FunctionalInter3 이용하기
//	- 새로운 함수형 인터페이스(FunctionalInter4)를 만들고
//	- 2개의 문자열을 매개변수로 전달받는 추상 메소드(combineString)를 선언한다.
//	- 람다식을 이용하여 2개의 문자열을 연결하여 출력한다.
//
//	2. 두 수의 곱을 구하는 프로그램을 만든다.
//	(1) MultipleInter.java(인터페이스) 에  두 수를 매개변수로 받고 정수값을 반환하는 추상메소드를 만든다.
//	(2) Main.java(클래스)에 다음과 같은 static 메소드를 선언한다.
//	- MultipleInter 타입을 반환한다.
//	- 이름은 claculator
//	- 매개변수는 boolean타입을 받는다.
//	매개변수로 true가 들어오면 두수의 곱을 반환하는 람다식을 만들고
//	false가 들어오면 0을 반환하는 람다식을 만든다.
//	작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.
//
//	3. 두 문자열을 입력받아 첫 번째 문자열을 두 번째 문자열의 길이만큼 잘라내는 프로그램을 만든다.
//	ex)
//	첫 번째 : abcde
//	두 번째 : 가나다
//	결과 : de
//
//	(1) SubInter.java(인터페이스)에 두 문자열을 매개변수로 받고 문자열을 반환하는 추상 메소드를 만든다.
//	(2) Main2.java(클래스)에 다음과 같은 static 메소드를 선언한다.
//	    - 매개변수로 문자열을 전달받는다.
//	    - 전달받은 문자열이 "F"면 앞에서 자르고 "B"면 뒤에서 자르는 람다식을 만든다.
//	    작성된 람다식을 SubInter 타입의 변수에 저장하여 반환하는 메소드를 만든다.
	
	
	/*
	 * logic
	 * 
	 * 함수형 interface f3 과 f4를 만들고 추상 메소드를 각각 선언
	 * 메인메소드에서 익명 클래스로 만들고 람다식으로 메소드 호출
	 * 
	 * 인터페이스 multipleInter 를 만들고 메소드로 2개의 정수를 매개변수로 받는 추상메소드를 만듬.
	 * 메인에서 static 메소드를 만들고 매개변수로 boolean을 받고
	 * true이면 return으로 두 수의 곱을 반환하는 람다식
	 * false이면 return으로 0을 반환하는 람다식 만듬
	 * 메소드 호출
	 * 
	 * 
	 * */

	public static void main(String[] args) {

		FunctionalInter3 f3 = new FunctionalInter3() {

			@Override
			public int multiple(int param1, int param2) {
				return param1 * param2;
			}
		};

		FunctionalInter4 f4 = new FunctionalInter4() {

			@Override
			public String combineString(String param1, String param2) {
				return param1 + param2;
			}	
		};
	
		System.out.println();
		FunctionalInter4 lambda = (param1, param2) -> {return param1 + param2;};		//람다식으로 메소드 변환
		System.out.println(lambda.combineString("안녕", "하이"));

		
		MultipleInter mi = new MultipleInter() {
			
			@Override
			public int method(int param1, int param2) {
				return param1 * param2;
			}
		};
		
		
		System.out.println(mi.method(1, 2));
		
		
		
	}
	
	static MultipleInter calculator(boolean param) {
		MultipleInter result = null;
		if(param) {
			result =(param1,param2)-> {return param1 * param2;};
		}
		else {
			result = (param1,param2)->  0; 
		}
		return result;
	}

}
