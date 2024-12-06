package homework;

public class Employee {
	// 필드
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	// 메소드
	double calculateBonus() {

		return this.salary * 0.1;

	}
}
