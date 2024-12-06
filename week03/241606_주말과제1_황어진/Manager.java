package homework;

public class Manager extends Employee {		//employee로 부터 상속

	public Manager(String name, int salary) {
		super(name, salary);
	}

	@Override								// 오버라이드
	double calculateBonus() {
		double  bonus =  this.salary * 0.2;
		System.out.println("매니저의 보너스는 :" + this.salary * 0.2);
		return bonus;				// 월급 * 0.2
		
	}	
	
}
