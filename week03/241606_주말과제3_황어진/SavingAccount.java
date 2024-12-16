package homework3;

public class SavingAccount extends Account{
	
	@Override
	void withdraw(double amount) {
		if(this.balance - amount < 0) {		// 잔고에서 금액을 차감할때, 0 미만이면,
			System.out.println("출금 실패!"); // 출금실패 출력
		}else {
			this.balance -= amount; // 해당 객체의 잔고를 금액만큼 차감
			System.out.println(amount + "원이 출금되었습니다.\n잔액은" +this.balance + " 원 입니다." ); // 출금 메시치 출력
			
		}
	}

}
