package homework3;

public class Account {

	// 필드
	double balance; // 잔고

	void deposit(double amount) { // 입금 메소드
		this.balance += amount; // 해당 객체의 잔고에 amount만큼 금액을 추가한다.
		System.out.println(amount + "원이 입금되었습니다.\n잔액은" + this.balance + " 원 입니다."); // 출금 메시치 출력

	}

	void withdraw(double amount) { // 출금 메소드
		this.balance -= amount; // 해당 객체의 잔고에 amount만큼 금액을 차감한다.
		System.out.println(amount + "원이 출금되었습니다.\n잔액은" + this.balance + " 원 입니다."); // 출금 메시치 출력

	}
}
