package ex04_황어진;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		

		//4. 학생 성적 관리 프로그램을 구현하라
		//[요구사항]
		//(1) Person 클래스
		//    - 필드 (private) : String name(학생 이름)
		//    - 생성자 : 이름을 매개변수로 받아 초기화
		//    - 메소드
		//        getName() : name 필드의 값을 반환
		//
		//
		//(2) Student 클래스
		//    Person 클래스 상속
		//    - 필드 (private) : int javaScore, int dbmsScore, int htmlScore(과목 점수)
		//    - 생성자 : Person의 생성자를 호출하고, 각 점수 초기화
		//    - 메소드
		//        getTotalScore() : 세 과목 점수를 더한 값(정수)을 반환
		//        getAverageScore() : 평균(정수형)으로 반환
		//
		//
		//(3) Main 클래스
		//    메인 메소드 구현
		//    Student 객체를 생성하여 이름과 점수를 입력받는다(입력받을 점수는 0~100 범위 내, 입력클래스 사용)
		//    각 학생의 총점과 평균을 출력한다
		
		
		/*
		 * logic
		 * 
		 * person ,student , main 클래스 생성
		 * 각 클래스에 맞는 필드와 생성자 , 메소드 기입
		 * student는 person의 자식 클래스로 만들고
		 * student 클래스에는 총합 과 평균을 반환하는 메소드를 만듬
		 * 
		 * main에는 입력메소드로 이름과 점수를 입력 받고 0~100 이내 
		 * 총점과 평균을 출력
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		
		Student st1 = new Student("황어진");
		System.out.println("자바 점수를 입력하세요");
		st1.setJavaScore(sc.nextInt());
		System.out.println("DBMS 점수를 입력하세요");
		st1.setDbmsScore(sc.nextInt());
		System.out.println("HTML 점수를 입력하세요");
		st1.setHtmlScore(sc.nextInt());
		
		System.out.println("총합은 : " + st1.getTotalScore());
		System.out.println("평균은 : " + st1.getAverageScore());
		
		
		
	}
}
