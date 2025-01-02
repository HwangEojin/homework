package empMng;

public class Employee {
	// 필드
	int id = 0;
	String name = "";
	int salary = 0;
	
	//생성자
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//급여 인상 메소드
	public void increaseSalary(double ratio) {
		if(ratio > 0) {
			this.salary += (int) (this.salary * (ratio/100));
			System.out.println(this.salary);	
		}else {
			System.out.println("비율은 0보다 커야합니다.");
		}
	}
	
	
	//직업 정보 출력 메서드
	public void printEmployee() {
	System.out.println("ID : " + this.id + "\t| Name : " + this.name + "\t| Salary :" + this.salary);
	}
	
	
	// toString 메서드 재정의
	@Override
	public String toString() {
		return "ID : " + id + "\t| Name : " + name + "\t| Salary :" + salary;
	}
	
	//id과 이름으로 객체 동일성 비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Employee employee = (Employee) obj;
		return (id == employee.id) && name.equals(employee.name);
	}
	
	

}
