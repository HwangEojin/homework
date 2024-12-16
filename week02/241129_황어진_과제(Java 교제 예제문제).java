package javaBook;

import java.util.Scanner;

public class JavaBookCode {
	public static void main(String[] args) {

		// Java 멘토시리즈 예제 코드

		// 예제 2-1

//		System.out.print("Welcome. "); // 괄호안에 데이터를 콘솔창에 출력
//		System.out.print("Java World"); //"welcome"문자열 옆에 "Java world" 문자열 출력

		// 예제 2-2

//		System.out.println("Welcome. "); // 괄호안에 데이터를 콘솔창에 출력
//		System.out.println("Java World"); //"welcome"문자열 아래에 "Java world" 문자열 출력

		// 예제 2-3

//		System.out.printf("저는 대학교 %d학년에 재학중입니다!",3); //%d = 10진수 정수를 출력

		// 예제 2-4

//		System.out.printf("%d은 첫번쨰, %f은 두번째, %s은 세번째.",1,2.0,"셋");
		// %d는 10진수 정수
		// %f는 실수
		// %s는 문자열 서식문자

		// 예제 2-5

//		System.out.printf("%5d",1);				//다섯자리를 확보하고 오른쪽 정렬하여 출력
//		System.out.println();					//줄넘김
//		System.out.printf("%5d",12);			//다섯자리를 확보하고 오른쪽 정렬하여 출력
//		System.out.println();					//줄넘김
//		System.out.printf("%5d",123);			//다섯자리를 확보하고 오른쪽 정렬하여 출력
//		System.out.println();					//줄넘김
//		System.out.printf("%5d",1234);			//다섯자리를 확보하고 오른쪽 정렬하여 출력
//		System.out.println();					//줄넘김
//		System.out.printf("%5d",12345);			//다섯자리를 확보하고 오른쪽 정렬하여 출력

		// 예제 2-6

//		System.out.printf("%.1f",1.1234567);			//실수의 소수점 첫째짜리까지 출력
//		System.out.println();							//줄넘김
//		System.out.printf("%.2f",1.1234567);			//실수의 소수점 둘째짜리까지 출력
//		System.out.println();							//줄넘김
//		System.out.printf("%.3f",1.1234567);			//실수의 소수점 셋째짜리까지 출력
//		System.out.println();							//줄넘김
//		System.out.printf("%.4f",1.1234567);			//실수의 소수점 넷째짜리까지 출력
//		System.out.println();							//줄넘김
//		System.out.printf("%.5f",1.1234567);			//실수의 소수점 다섯째짜리까지 출력

		// 예제 2-7

//		int studentAge ;					// 학생의 나이를 저장할 수 있는 변수 선언
//		studentAge =20;						// 변수에 값을 대입
//		
//		System.out.println(studentAge);		// 학생나이를 출력

		// 예제 2-8

//		String myCity = "Seoul";					// 도시를 저장할 수 있는 변수를 선언하고 변수에 Seoul 대입
//		System.out.println("I am from " + myCity);	// 문자열을 연결하여 I am from Seoul 출력

		// 예제 2-9

//		int myAge = 20;								// 나의 나이를 변수로 선언하고 20 대입
//		int yourAge =myAge;							// 당신의 나이를 변수로 선언하고 myAge값을 대입
//		
//		System.out.println(myAge);					// 나의 나이를 출력 : 20
//		System.out.println(yourAge);				// 당신의 나이를 출력 : 20

		// 예제 2-10
//		
//		int myAge = 20;								// 나의 나이를 변수로 선언하고 20 대입
//		int yourAge =30;							// 당신의 나이를 변수로 선언하고 30 대입
//		int tempAge;								// 임시 변수 선언
//		
//		tempAge = myAge;							// tempAge에 myAge값을 복사
//		myAge= yourAge;								// myAge는 yourAge
//		yourAge = tempAge;							// tempAge에 저장된 복사값을 yourAge에 대입
//		
//		System.out.println(myAge);					// 나의 나이를 출력 : 20
//		System.out.println(yourAge);				// 당신의 나이를 출력 : 20

		// 예제 2-11

//		byte num1 = 10;								// byte 타입 변수에 10을 저장
//		short num2 = 20;							// short 타입 변수에 20을 저장
//		int num3  = 30;								// int 타입 변수에 30을 저장
//		long num4 = 40;								// long 타입 변수에 40을 저장
//		
//		System.out.println(num1);					// num1을 출력
//		System.out.println(num2);					// num2을 출력
//		System.out.println(num3);					// num3을 출력
//		System.out.println(num4);					// num4을 출력

		// 예제 2-12

//		byte num1 = 0110;							// byte 타입 변수에 2진수 72를 대입
//		short num2 = 0107;							// short 타입 변수에 8진수 71을 저장
//		int num3  = 0x46;							// int 타입 변수에 16진수 70을 저장
//		long num4 = 69L;							// long 타입 변수에 69을 저장
//		
//		System.out.println(num1);					// num1을 출력 10진수 정수값으로 출력 :72
//		System.out.println(num2);					// num2을 출력 10진수 정수값으로 출력 :71
//		System.out.println(num3);					// num3을 출력 10진수 정수값으로 출력 :70
//		System.out.println(num4);					// num4을 출력 10진수 정수값으로 출력 :69

		// 예제 2-13
//		
//		double marathon = 42.195;					// 실수 타입 변수 선언 후 값을 대입
//		float halfMarathon = 21.0975f;				// 실수 타입 변수 선언 후 값을 대입
//
//		System.out.println("마라톤은 " + marathon + "km를 달립니다"); // 출력
//		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다");	//출력

		// 예제 2-14

//		double pieDouble = 3.141592653589793;		// double 타입으로 실수 변수 선언후 값을 대입
//		float pieFloat = 3.141592653589793f;		// float 타입으로 실수 변수 선언후 값을 대입

//		System.out.println("double" + pieDouble);	// double과 float는 정밀도 차이가 있다.
//		System.out.println("pieFloat" + pieFloat);	// 7자리까지 표시

		// 예제 2-15

//		char ga ='가';								//문자 타입 변수를 선언후 값을 저장
//		char na = '나';								//문자 타입 변수를 선언후 값을 저장
//		char alphabetA ='A';						//문자 타입 변수를 선언후 값을 저장
//		char alphabetB ='B';						//문자 타입 변수를 선언후 값을 저장
//		
//		System.out.println(ga);						// ga 변수 출력
//		System.out.println(na);						// na 변수 출력
//		System.out.println(alphabetA + ", " +alphabetB); //alphabetA , alphabetB변수 출력

		// 예제 2-16

//		int ga ='가';								//정수 타입 변수를 선언후 값을 저장
//		int na = '나';								//정수 타입 변수를 선언후 값을 저장
//		int alphabetA ='A';							//정수 타입 변수를 선언후 값을 저장
//		int alphabetB ='B';							//정수 타입 변수를 선언후 값을 저장
//		
//		System.out.println(ga);						// ga 변수 출력
//		System.out.println(na);						// na 변수 출력
//		System.out.println(alphabetA + ", " +alphabetB); //alphabetA , alphabetB변수 출력 : 숫자로 65 66이 출력

		// 예제 2-17

//		int alphabetA ='A';							//A와 매핑된 유니코드 정수 65가 저장
//		int alphabetB ='B';							//B와 매핑된 유니코드 정수 66가 저장
//		System.out.println(alphabetA);				// A 변수 출력
//		System.out.println(alphabetB);				// B 변수 출력
//		char alphabetC ='C';						//유니코드 정수 67과 매핑된 문자 C가 저장
//		System.out.println(alphabetC); 				//C가 출력됨

		// 예제 2-18

//		boolean isStudent = true;					// boolean 변수를 선언하고 true를 저장 
//		System.out.println(isStudent); 				// 출력 결과 : true

		// 예제 2-19

//		boolean isStudent = true;					// boolean 변수를 선언하고 true를 저장 
//
//		if(isStudent) {								// isStudent가 true 이면
//			System.out.println("저는 학생입니다.");		//"저는 학생입니다." 결과 출력 
//		}
//		else {										// isStudent가 false 이면
//			System.out.println("저는 학생이 아닙니다.");	// "저는 학생이 아닙니다. 결과 출력
//		}

		// 예제 2-20

//		String hi = "안녕하세요";						// 문자열 변수 선언 후 값 저장
//		String niceToMeetYou = "만나서 반갑습니다.";		// 문자열 변수 선언 후 값 저장
//		System.out.println(hi);						// "안녕하세요" 출력
//		System.out.println(niceToMeetYou);			// "만나서 반갑습니다." 출력

		// 예제 2-21

//		int num1 = 11;								// 정수 타입 변수 선언 후 값 저장
//		double num2 = 3.14;							// 실수 타입 변수 선언 후 값 저장
//		double num1Change = (double)num1;			// 실수 타입 변수 선언 후 num1의 값을 실수로 바꾸어 저장
//		
//		System.out.println("num1 :" + num1);		// 11 출력
//		System.out.println("num1Change :" + num1Change);	// 11.0 출력
//		System.out.println("num1Change :" + num2);	//3.14 출력
//		System.out.println((int)1.23);				//실수의 숫자를 정수형으로 변환하면 소수점 뒤자리는 잘림

		// 예제 2-22

//		int i1 =10;									// 정수 타입 변수 선언  후 값 10 저장
//		byte b1 =(byte)i1;							// byte 타입 변수 선언 후 10을 byte 형으로 전환후 저장
//		System.out.println(b1);						// 10 출력
//		
//		int i2 = 128;								// 정수 타입 변수 선언  후 값 128 저장
//		byte b2 = (byte)i2;							// byte 타입 변수 선언 후 128을 byte 형으로 전환후 저장
//		System.out.println(b2);						// -128 출력
//													// 저장할 수 있는 최대 숫자를 초과했으므로 overFlow 발생
//	

		// 예제 2-23
//		
//		double d1 = 1.0e100;						// 10의 100승 = float의 최대 범위
//		float f1 = (float)d1;						// float 으로 형 변환 후 저장
//		System.out.println(f1);						// 저장범위를 초과하면 infinity 출력
//		
//		double d2 = 1.0e-100;						// 10의 -100승 = float의 최소 범위
//		float f2 = (float)d2;						// float 으로 형 변환 후 저장
//		System.out.println(f2);						// 출력 저장범위를 초과하면 0.0 출력

		// 예제 2-24

		// 실수형 -> 정수형
//		double pie = 3.14;							// 실수 타입 변수 선언 후 값 저장
//		int pieInt =(int)pie;						// 정수형으로 변환
//		System.out.println(pieInt); 				// 출력 결과 3

		// 정수형 -> 실수형
//		int num = 100;								// 정수 타입 변수 선언 후 값 저장	
//		double numD = (double)num;					// 실수형으로 변환
//		float numF = (float) 100;					// 100을 실수로 변환
//		System.out.println(numD);					// 100.0 출력
//		System.out.println(numF);					// 100.0 출력

		// 정수형 -> 실수형 (범위 밖)
//		int i = 999999999;							// 정수 타입 변수 선언 후 값 저장				
//		float f = (float)i;							// 실수로 변환
//		System.out.println(f);						// 1.0e9 출력

		// 예제 2-25

//		int num1 = 14;								// 정수 타입 변수 선언 후 값 저장
//		double num2 = 3.14;							// 실수 타입 변수 선언 후 값 저장
//		int num4 =(int) num2;						
//		//double num4 = num1   ==> num1을 자동으로 double로 형 변환 해줌 
//		//int num3 = (double) num2 ==> 자동형 변환을 할 수 없는 역방향. 컴파일 에러 발생
//		System.out.println(num4);					// 출력 결과 3

		// 예제 2-26

//		int i = 100;								// 정수 타입 변수 선언 후 값 저장
//		char c= 'a';								// 문자 타입 변수 선언 후 값 저장
//		int j = c;									// char 형에서 int로 자동 변환
//		double d= i;								// int 형에서 double로 자동 형변환
//		
//		System.out.println("int 형 변수 j의 값 : " + j);	//출력 결과 : 97
//		System.out.println("double 형 변수 d의 값 : " + d);	//출력 결과 : 100.0

		// 예제 2-27

		// int 형 -> byte형 강제 형 변환 (값이 작을 경우)
//		int i = 10;								// 정수 타입 변수 선언 후 값 저장
//		byte b = (byte) i;						// byte 타입 변수 선언 후 정수 타입 변수 i의 값을 byte로 형 변환후 저장 
//		System.out.println("[int -> byte] i의 값 : " + i + " b의 값" + b ); // 출력 결과 10
//		
		// int 형 -> byte형 강제 형 변환 (값이 클 경우)
//		int j = 1000;								// 정수 타입 변수 선언 후 값 저장
//		byte c = (byte) j;							// byte 타입 변수 선언 후 정수 타입 변수 i의 값을 byte로 형 변환후 저장 
//		System.out.println("[int -> byte] i의 값 : " + j + " b의 값" + c ); // 출력 결과 -24
		// 값의 손실 및 예상치 못한 결과 출력

		// 예제 2-28

//		//double 형 -> float형 강제 형 변환 (float 범위 내 값)
//		double d1 = 1.1234;													// 실수 타입 변수 선언 후 값 저장
//		float f1 = (float) d1;												// double 타입의 값을 float로 변환 후 값 저장
//		System.out.println("[double -> float] d1의 값 : " + d1 + " f1의 값" + f1 ); // 출력 결과 : d1: 1.1234, f1 :1.1234
//
//		//double 형 -> float형 강제 형 변환 (float 최소값보다 작은 경우)
//		double d2 = 1.0e-50;													// 실수 타입 변수 선언 후 값 저장
//		float f2 = (float) d2;												// double 타입의 값을 float로 변환 후 값 저장
//		System.out.println("[double -> float] d2의 값 : " + d2 + " f2의 값 :" + f2 ); // 출력 결과 : d2: 1.1234, f2 :0.0
//				
//		//double 형 -> float형 강제 형 변환 (float 최대값보다 큰 경우)
//		double d3 = 1.0e100;													// 실수 타입 변수 선언 후 값 저장
//		float f3 = (float) d3;												// double 타입의 값을 float로 변환 후 값 저장
//		System.out.println("[double -> float] d3의 값 : " + d3 + " f3의 값 :" + f3 ); // 출력 결과 : d3:1.0E100, f3 :Infinity
//				
////		//double 형 -> float형 강제 형 변환 (float 범위 내 값)
//		double d4 = 9.123456789;													// 실수 타입 변수 선언 후 값 저장
//		float f4 = (float) d4;												// double 타입의 값을 float로 변환 후 값 저장
//		System.out.println("[double -> float] d4의 값 : " + d4 + " f4의 값 : " + f4 ); // 출력 결과 : d4: 9.123456789, f4 :9.123457

		// 예제 2-29

//		//float 형 -> int 형 강제 형변환
//		float f1 =12345.67f;
//		int i1= (int)f1;
//		System.out.println("[float -> int] f1의 값 : " + f1 + " i1의 값 : " + i1); // 출력 결과 f1: 12345.67, i1 : 12345
//		
//		//double 형 -> int 형 강제 형변환
//		
//		double d1 =12345.678;
//		int i2= (int)d1;
//		System.out.println("[double -> int] d1의 값 : " + d1 + " i2의 값 : " + i2); // 출력 결과 d1: 12345.678, i2 : 12345

		// 예제 2-30

//		Scanner scanner = new Scanner(System.in);		// 입력 method import
//		
//		System.out.println("나이를 입력해주세요");			// 안내문 출력
//		int age = scanner.nextInt();					// 변수 age에 입력값 대입, 20 입력시
//		System.out.printf("내 나이는 %d세 입니다.",age);		// 출력 결과 :  내 나이는 20세 입니다.
//		
		// 예제 2-31

//		Scanner scanner = new Scanner(System.in);		// 입력 method import
//		String name, address;							// 이름, 주소를 입력받을 문자열 변수 선언
//		int age;										// 나이를 입력 받을 정수 변수 선언
//		double weight;									// 몸무게를 입력받을 실수 타입 변수 선언
//		
//		System.out.println("이름, 주소 , 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요");			// 안내문 출력
//		name = scanner.next();							// 변수 name에 입력값 대입
//		address = scanner.next();						// 변수 address에 입력값 대입
//		age = scanner.nextInt();						// 변수 age에 입력값 대입,
//		weight = scanner.nextDouble();					// 변수 weight에 입력값 대입
//		System.out.printf("당신의 이름은 %s 입니다.",name);	// 입력한 입력값이 출력
//		System.out.printf("당신의 주소은 %s 입니다.",address);// 입력한 입력값이 출력	
//		System.out.printf("당신의 이름은 %d 입니다.",age);	// 입력한 입력값이 출력
//		System.out.printf("당신의 이름은 %.1fkg 입니다.",weight);	// 입력한 입력값이 출력

		// 예제 3-1

//		int x = 100;									// 정수 변수를 선언하고 100 대입
//		int resultPlus = + x; 							// + 부호
//		int resultMinus = - x; 							// -부호
//		
//		System.out.println(resultPlus);					// 출력 결과 : 100
//		System.out.println(resultMinus);				// 출력 결과 : -100

		// 예제 3-2

//		double d = 1.11;								// 실수 변수를 선언하고 1.11 대입
//		double result = -d;								// 실수 변수에 - 부호 붙임
//		
//		System.out.println(-d);							// 출력 결과 : -1.11
//		System.out.println(result);						// 출력 결과 : -1.11

		// 예제 3-3

//		int num = 10;									// 정수타입 변수 선언 후 10 저장
//		System.out.println(num);						// 출력 결과 : 10
//		num ++;											// num을 1 증가 시킴
//		System.out.println(num);						// 출력 결과 : 11

		// 예제 3-4
//		int num = 10;									// 정수타입 변수 선언 후 10 저장
//		System.out.println(num++);						// 출력 결과 : 10 , 10이 출력된 후 +1
//		System.out.println(num);						// 출력 결과 : 11

		// 예제 3-5
//		int num = 30;									// 정수타입 변수 선언 후 30 저장
//		System.out.println(++num);						// 출력 결과 : 31 , 30+1이 연산된 후 출력
//		System.out.println(num);						// 출력 결과 : 31
//
//		System.out.println(num++);						// 출력 결과 : 31 , 31이 출력된 후 +1
//		System.out.println(num);						// 출력 결과 : 32

		// 예제 3-6

//		int x = 1;
//		
//		System.out.println(x++);						// x(=1)가 먼저 출력되고 난 뒤
//		System.out.println(x);							// x에 +1 더해져서 2
//		System.out.println(++x);						// x(=2)에 +1이 더해진 3이 출력

		// 예제 3-7
//		char alphabetX = 'X';							// 유니코드 숫자 88이 저장되고 X과 매핑
//		System.out.println(alphabetX++);				// 알파벳 X 출력 후 , 유니코드 88 + 1
//		System.out.println(alphabetX);					// 89와 매핑된 Y가 출력

		// 예제 3-8

//		boolean isHuman = false;						// boolean 변수를 선언하고 기본 값을 false로 저장
//		System.out.println(!isHuman);					// 출력 결과 : true , false가 아님 = true
//		System.out.println(isHuman);					// 출력 결과 : false, isHuman = false 출력 

		// 예제 3-9

//		int x = 100;
//		int y = 200;
//
//		System.out.println(x+y);					// 출력 결과 : 100 + 200
//		System.out.println(x-y);					// 출력 결과 : 100 - 200
//		System.out.println(x*y);					// 출력 결과 : 100 * 200
//		System.out.println(x/y);					// 출력 결과 : 100 / 200
//		System.out.println(x%y);					// 출력 결과 : 100 % 200

//		//예제 3-10
//		
//		double num1 = 1.2345;						// 실수타입 변수 선언후 값 대입
//		int num2 = 6;								// 정수 타입 변수 선언 후 6 대입
//		System.out.println(num1 + num2);    		// num2를 double로 형변환해서 연산

		// 예제 3-11

//		int result = 100000 * 100000;					// 정수타입 변수 선언후 값 대입
//		System.out.println(result);    					// 엉뚱한 연산 값 (오버플로우)

		// 예제 3-12

//		int x = 10;
//		int y = 1;
//		
//		y += x;										//y=y+x; -> 1+10 =11
//		System.out.println(y);    					//11
//
//		y *= x;										//y=y*x; -> 11*10 =110
//		System.out.println(y);    					//110
//		
//		y %= x;										//y=y%x; -> 110%10 =0
//		System.out.println(y);    					//0
//		
		// 예제 3-13

//		int a = 10;									// 정수타입 변수 선언후 값 대입
//		int b= 20;									// 정수타입 변수 선언후 값 대입
//		
//		System.out.println(a<b);					// 출력 결과 : true
//		System.out.println(a<=b);					// 출력 결과 : true
//		System.out.println(a==b);					// 출력 결과 : false
//		System.out.println(a!=b);					// 출력 결과 : true

		// 예제 3-14

//		int a = 10;									// 정수타입 변수 선언후 값 대입
//		int b= 11;									// 정수타입 변수 선언후 값 대입
//		
//		System.out.println(a<=b);					// 출력 결과 : true
//		System.out.println(a==b);					// 출력 결과 : false
//		System.out.println(a!=--b);					// 출력 결과 : false

		// 예제 3-15

//		boolean b1 =true;							// boolean 변수 선언후 true 값 대입
//		boolean b2 =false;							// boolean 변수 선언후 false 값 대입
//		boolean b3 =true;							// boolean 변수 선언후 true 값 대입
//		boolean b4 =false;							// boolean 변수 선언후 false 값 대입
//		
//		System.out.println("###논리곱###");
//		System.out.println(b1 && b2);					// 하나만 false라서 false
//		System.out.println(b1 && b3);					// 두 항 모두 true 라서 true
//		System.out.println(b2 && b4);					// 두 항 모두 false false
//		System.out.println();

//		System.out.println("###논리합###");
//		System.out.println(b1 || b2);					// b1이 true라서 true
//		System.out.println(b1 || b3);					// 두 항 모두 true라서 true
//		System.out.println(b2 || b4);					// 두 항 모두 false라서 false
//		System.out.println();

//		System.out.println("###배타적 논리합###");
//		System.out.println(b1 ^ b2);					// 달라서 true
//		System.out.println(b1 ^ b3);					// 같아서 false
//		System.out.println();

		// 예제 3-16

//		int num = (7>1) ? 1 :2;							// 7>1 결과가 참이면 1, 거짓이면 2
//		System.out.println(num);						// 출력 결과 : 1

		// 예제 3-17

//		int num =0;										// 정수타입 변수 선언후 0 대입
//		
//		if(7>1) {										// 7 > 1 조건이 참이면
//			num =1;										// num 은 1
//		}
//		else {											// 7 > 1 조건이 거짓이면
//			num =2;										// num 은 2
//		}
//		System.out.println(num);						// 출력 결과 : 1

		// 예제 4-1

//		int result = 0;									// 정수타입 변수 선언후 0 대입
//		if(3>2) {										// 3>2 조건이 참이면
//			result = 3;									// result는 3
//		}
//		System.out.println(result);						// 거짓이면 0을 출력

		// 예제 4-2

//		Scanner sc = new Scanner(System.in);			// 입력 method import
//		System.out.println("나이를 입력하세요");				// 안내문 출력
//		
//		int age = sc.nextInt();							// 정수타입 변수 선언후 입력값 대입
//		if(age>19) {									// age > 19 조건이 참이면
//			System.out.println("성인입니다.");				// 성인입니다 출력
//		}
//		System.out.println("프로그램을 종료합니다.");			// 거짓이면 프로그램을 종료합니다를 출력
//		

		// 예제 4-3

//		int num = 5;									// 정수타입 변수 선언후 5 대입
//
//		if (num > 4) {									// num > 4 조건이 참이면
//			System.out.println(num + "은 4보다 큽니다.");	// 이 코드가 출력
//
//		} else {										// num > 4 조건이 거짓이면
//			System.out.println(num + "은 4보다 작습니다.");	// 이 코드가 출력
//		}

		// 예제 4-4

//		int a = 4;										// 정수타입 변수 선언후 4 대입
//		int b = 10;										// 정수타입 변수 선언후 10 대입
//
//		if (a>b) {										// a>b 조건이 참이면
//			System.out.println("a가 b보다 큽니다");			// 이 코드가 출력
//			
//
//		} else {										// a>b 조건이 거짓이면
//			System.out.println("a가 b보다 작거나 같습니다.");	// 이 코드가 출력
//		}

		// 예제 4-5

//		int a = 4;										// 정수타입 변수 선언후 4 대입
//		int b = 10;										// 정수타입 변수 선언후 10 대입
//		int max = 0;									// 최대값을 변수로 선언
//		
//		if (a>b) {										// a>b 조건이 참이면
//			max = a;									// 최대값은 a
//
//		} else {										// a>b 조건이 거짓이면
//			max = b;									// 최대값은 b
//		}
//		System.out.println(a +" 와(과) " + b + "중에 큰 수는 " + max + "입니다.");
//		// 출력 결과 : 4 와(과) 10중에 큰 수는 10입니다.

		// 예제 4-6

//		Scanner sc = new Scanner(System.in);			// 입력 method import
//		System.out.println("나이를 입력하세요.");				// 안내 메시지 출력
//		
//		int age = sc.nextInt();							// age변수에 입력값을 저장
//		
//		if(age >19) {									// age값이 > 19 조건이 true 라면
//			System.out.println("성인입니다.");				// 성인입니다 출력
//		}else {											// age값이 > 19 조건이 false 라면
//			System.out.println("미성년자 입니다.");			// 미성년자 입니다. 출력
//
//		}

// 		예제 4-7

//		int favorite = 7;
//
//		if (favorite < 5) { 								// favorite <5 조건이 true 라면
//			System.out.println("좋아하는 숫자가 5보다 작습니다."); 	// 좋아하는 숫자가 5보다 작습니다. 출력
//		} else if (favorite > 5) { 							// favorite >5 조건이 true 라면
//			System.out.println("좋아하는 숫자가 5보다 큽니다."); 	// 좋아하는 숫자가 5보다 큽니다. 출력
//
//		} else {											// 위 조건 모두 만족하지 않으면
//			System.out.println("좋아하는 숫자가 5입니다."); 		// 좋아하는 숫자가 5입니다. 출력
//
//		}

//		예제 4-8

//		int favorite = 7;
//		
//		if (favorite > 5) { 								// favorite >5 조건이 true 라면
//			System.out.println("좋아하는 숫자가 5보다 큽니다."); 	// 좋아하는 숫자가 5보다 큽니다. 출력
//		} else if (favorite == 7) { 							// favorite >5 조건이 true 라면
//			System.out.println("좋아하는 숫자가 7입니다"); 	// 좋아하는 숫자가 7입니다 출력
//		} 

		// 예제 4-9

//		Scanner sc = new Scanner(System.in);			// 입력 method import
//		System.out.println("나이를 입력하세요.");				// 안내 메시지 출력
//		
//		int age = sc.nextInt();							// age변수에 입력값을 저장
//		
//		if(age >19) {									// age값이 > 19 조건이 true 라면
//			System.out.println("성인입니다.");				// 성인입니다 출력
//		}else if(age > 13){								// age값이 > 13 조건이 true 라면
//			System.out.println("청소년 입니다.");			// 청소년 입니다. 출력
//		}else if(age > 6){								// age값이 > 6 조건이 true 라면
//			System.out.println("어린이 입니다.");			// 어린이 입니다. 출력
//		}else {											// 위 조건 모두 만족하지 않으면
//			System.out.println("유아 입니다.");				// 유아 입니다. 출력
//
//		}

		// 예제 4-10

//		int num =7;										// 정수 타입 변수에 7 저장
//		
//		switch (num) {									//switch문에 num 변수를 받아서
//		case 1:											//num 변수의 값이 1이면
//			System.out.print("num은 1입니다.");			//num은 1입니다. 출력
//			break;										// 조건문 탈출
//		case 7: {										//num 변수의 값이 7이면
//			System.out.print("num은 7입니다.");			//num은 7입니다. 출력
//			break;										// 조건문 탈출

//		}
//		default:										//num 변수의 값이 1,7 이외의 값이면
//			System.out.print("num은 1도 7도 아닙니다.");		//num은 1도 7도 아닙니다.. 출력
//		}
//
//		
		// 예제 4-11

//		int num =7;										// 정수 타입 변수에 7 저장
//		
//		switch (num) {									//switch문에 num 변수를 받아서
//		case 1:											//num 변수의 값이 1이면
//			System.out.print("num은 1입니다.");			//num은 1입니다. 출력
//		case 7: {										//num 변수의 값이 7이면
//			System.out.print("num은 7입니다.");			//num은 7입니다. 출력
//		}
//		default:										//num 변수의 값이 1,7 이외의 값이면
//			System.out.print("num은 1도 7도 아닙니다.");		//num은 1도 7도 아닙니다. 출력
//		}
//		
		// 출력 결과 : num은 1입니다.
//					num은 1도 7도 아닙니다.
//		

//		예제 4-12

//		Scanner sc = new Scanner(System.in);			// 입력 method import
//		System.out.println("원하는 숫자를 입력하세요 (1~5)");	// 안내 메시지 출력
//		int num = sc.nextInt();							// 입력값을 num에 대입
//		switch (num) {									//switch문에 num 변수를 받아서
//		case 5:											//num 변수의 값이 5이면
//			System.out.print("5를 입력하셨습니다.");			//"5를 입력하셨습니다." 출력
//			break;										// 조건문 탈출
//			
//		case 4:											//num 변수의 값이 4이면
//			System.out.print("4를 입력하셨습니다.");			//"4를 입력하셨습니다." 출력
//			break;										// 조건문 탈출
//		case 3:											//num 변수의 값이 3이면
//			System.out.print("3를 입력하셨습니다.");			//"3를 입력하셨습니다." 출력
//			break;										// 조건문 탈출
//		case 2:											//num 변수의 값이 2이면
//			System.out.print("2를 입력하셨습니다.");			//"2를 입력하셨습니다." 출력
//			break;										// 조건문 탈출
//		case 1:											//num 변수의 값이 1이면
//			System.out.print("1를 입력하셨습니다.");			//"1를 입력하셨습니다." 출력
//			break;										// 조건문 탈출
//		
//		default:										//num 변수의 값이 1~5 이외의 값이면
//			System.out.print("1부터 5사이에 숫자를 입력하세요");	//1부터 5사이에 숫자를 입력하세요 출력
//		}

//		예제 5-1

//		int sum = 0;								// 정수 타입 변수를 선언
//		
//		for(int i = 0; i<=10; i++) {				// 0 부터 10까지 반복
//			sum += i;								// 0부터 10까지 누적합산
//		}
//		System.out.println("합 : " + sum);			// 출력 결과 : 55

//		예제 5-2

//		int sum = 0;								// 정수 타입 변수를 선언
//		
//		for(int i = 1; i<=100; i++) {				// 0 부터 10까지 반복
//			if(i%2==0) {							// 2로 나누어 떨어지면 짝수
//				sum += i;							// 짝수를 누적합산
//			}							
//		}
//		System.out.println("합 : " + sum);			// 출력 결과 : 2550
//		

//		예제 5-3

//		
//		for(int i = 2; i<=9; i++) {					// 2 부터 9까지 반복, 2단부터 9단까지
//			for(int j = 1; j<=9; j++) {				// 1 부터 9까지 반복, 각 단에서 곱하기 
//				System.out.print(i + "X" + j + "=" + (i*j) + "\t");
//			}		
//			System.out.println();						// 각 단 별로 줄바꿈
//		}		

//		예제 5-4

//		for(int i = 0; i<7; i++) {					// 0 부터 6까지 반복, 2단부터 9단까지
//			for(int j = 0; j<7-i; j++) {			// 공백이 하나씩 감소
//				System.out.print(" ");
//			}		
//			for(int k = 0; k<(2*i)+1; k++) {		// *이 하나씩 증가
//				System.out.print("*");
//			}		
//			System.out.println();					// 줄바꿈
//		}	

//		예제 5-5

//		int sum = 0;
//		int i = 1;
//		
//		while (i<=10) {							// i가 10이 될때까지 반복
//			sum += i;							// sum에 i 값을 누적 합산
//			i++;								// i가 증가
//		}
//		System.out.println("합 : " + sum); 		// 출력 결과 : 55;

//		예제 5-6

//		int sum = 0;							// 합계를 저장할 정수형 변수 선언
//		int i = 1;								// 반복 카운트를 저장할 변수 선언
//		
//		do {									// 최초 1번 실행하고 while 조건이 true면 실행
//			sum += i;							// sum에 i 값을 누적 합산
//			i++;								// i 증가
//		}
//		while (i<=10);
//		System.out.println("합 : " + sum); 		// 출력 결과 : 55;

//		예제 5-7

//		int sum = 0;								// 정수 타입 변수 선언
//
//		for(int i = 1; i<=100; i++) {					// 1부터 100까지 반복
//			if(i%2 !=0) {								// i가 짝수가 아니면
//				continue;								// 이번 차수를 종료하고 다음 반복 시행
//			}		
//			sum += i;									// sum에 i를 누적 합산
//		}		
//		System.out.println("짝수 합: " + sum);			// 출력 결과 : 짝수 합 : 2550
//		

//		예제 5-8

		int magicNumber = (int)(Math.random()*50) + 1; // 랜덤 숫자 생성후 magicNumber 변수에 저장
		Scanner scan = new Scanner(System.in);			// 입력 method import
		boolean isMatched = false;						// 일치 여부를 boolean 값으로 저장
		
		
		for (int i = 0; i < 10; i++) { 					// 0부터 9까지 반복
			System.out.println("찾는 숫자를 입력 >>>");		// 안내문 출력
			int guess = scan.nextInt();					// 입력값을 guess에 저장
			
			if (guess == magicNumber) {						// 입력한 숫자와 정답이 일치하면
				System.out.println((i+1) + "번째에 맞췄습니다");	// 몇번째에 맞췄는지 출력
				isMatched = true;						// isMatched를 true로 업데이트
				break;									// 정답을 맞추면 루프 종료
			}else if (guess > magicNumber) {			// 입력한 숫자가 정답보다 크다면
				System.out.println("맞춰야할 숫자가 더 작습니다.");	// 안내문 출력

			}
			else if (guess < magicNumber) {					// 입력한 숫자가 정답보다 작다면
				System.out.println("맞춰야할 숫자가 더 큽니다.");	// 안내문 출력
			}
			if (!isMatched) {								// 만약 isMatched가 true가 아니라면
				System.out.println("정답을 맞추지 못했습니다.");	// 정답을 맞추지 못하면 출력
			}
		}

	}
}
