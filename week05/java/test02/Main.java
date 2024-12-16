package test02;

public class Main {
	public static void main(String[] args) {
		EmployeeService employeeServ = new EmployeeService();
		
		Employee emp1 = new Employee("E01", "짱구", 50, "개발부서");
		Employee emp2 = new Employee("E02", "맹구", 40, "개발부서");
		Employee emp3 = new Employee("E03", "철수", 30, "개발부서");
		Employee emp4 = new Employee("E04", "유리", 40, "보안부서");
		
		employeeServ.addEmployee(emp1.getId(), emp1);
		employeeServ.addEmployee(emp2.getId(), emp2);
		employeeServ.addEmployee(emp3.getId(), emp3);
		System.out.println("특정 사원의 정보 : " + employeeServ.getEmployeeById("E01"));
		
		System.out.println("모든 사원정보 출력");
		employeeServ.printAllEmployees();
		
		System.out.println("모든 사원에 연봉 추가");
		employeeServ.addSalaryEmp(3000);
		employeeServ.printAllEmployees();
	}
}
