package homework;

public class Developer extends Employee { //employee로 부터 상속

	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	double calculateBonus() {
		double bonus = this.salary * 0.15;
		System.out.println("개발자의 보너스는 :" + this.salary * 0.15);
		return bonus;
	}
	
		
	
}
