package homework3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 3) 잔액확인 프로그램 SavingsAccount와 CheckingAccount 클래스는 Account 클래스 상속
		 * Account 클래스
		 * 필드 balance 
		 * 메소드 deposit(double amount) : 금액을 추가
		 * withdraw(double amount) : 금액을 차감
		 * 
		 * SavingsAccount 클래스 메소드 withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
		 * 
		 * CheckingAccount 클래스 메소드 withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
		 * 
		 * 메인 메소드에서 두 클래스의 객체를 생성하고 입출금을 수행결과 출력

		 */
		
		
		
		/*
		 * logic
		 * 
		 * scanner 클래스를 import하고 입력결과를 받을 수 있는 변수를 선언
		 * account 클래스를 생성하고 필드에 balance 선언
		 * 출금 메소드 , 입금 메소드 생성
		 * SavingAccount 클래스 생성후 상속관계 선언 
		 * checkingAccount 클래스 생성후 상속관계 선언 
		 * account의 출금 메소드를 오버라이딩하여 savingaccount, checkingaccount의 조건에 따라 다른 출력값을 가지게 수정
		 * 메인메소드에서 2개의 객체를 생성하고 수행결과 출력
		 * 
		 * */
		Scanner scan = new Scanner(System.in);			// 입력 메소드 import
		SavingAccount sa = new SavingAccount();			// 객체 생성
		CheckingAccount ca = new CheckingAccount();		// 객체 생성
		
		System.out.println("\n입금할 금액을 입력하세요.\n");
		double inputValue = scan.nextDouble();
//		sa.deposit(inputValue);								// 입금
		ca.deposit(inputValue);		
	
		
		System.out.println("\n출금할 금액을 입력하세요.\n");		// 출금
		double inputValue2 = scan.nextDouble();
//		sa.withdraw(inputValue2);
		ca.withdraw(inputValue2);

		

	}

}
