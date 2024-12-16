package homework3;

public class CheckingAccount extends Account {

	@Override
	void withdraw(double amount) {
		System.out.println(this.balance);
		this.balance =this.balance-(amount + 1000); // 해당 객체의 잔고를 금액 + 수수료만큼 차감
		System.out.println(amount + "원이 출금되었습니다.\n잔액은" +this.balance + " 원 입니다." ); // 출금 메시치 출력

	}

}
