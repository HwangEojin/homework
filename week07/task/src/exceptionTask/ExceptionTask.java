package exceptionTask;

class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		try {
			if (amount < 0) {
				throw new IllegalArgumentException("입금 금액은 음수일 수 없습니다.");
			}
			balance += amount;
			System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	public void withdraw(double amount) {

		try {
			if (balance < amount) {
				throw new IllegalArgumentException("잔액이 부족하여 더 이상 출금 할 수 없습니다.");
			}
			balance -= amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	public void checkBalance() {
		System.out.println("현재 잔액: " + balance + "원");
	}
}

public class ExceptionTask {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456", 1000);
		account.checkBalance();
		account.deposit(500);
		account.withdraw(200);
		account.withdraw(2000); // 잔액 초과
	}
}
