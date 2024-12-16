package test02;

public class Employee {
	// 필드
	private String id;
	private String name;
	private int age;
	private String department;
	private int salary;

	// 생성자
	public Employee(String id, String name, int age, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}

	// Getter, Setter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "Employee{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", age=" + age + ", department='"
				+ department + '\'' + ", salary=" + salary + '}';
	}

	// equals 재정의 (id로 동일성 판단)
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
//		if (obj == null || getClass() != obj.getClass()) {
//			return false;
//		}
		if (obj == null || !(obj instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) obj;
		return id.equals(employee.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}











