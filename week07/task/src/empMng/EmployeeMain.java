package empMng;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee(1, "Vinegar", 10000);
		Employee emp2 = new Employee(1, "Doppio", 20000);
		Employee emp3 = new Employee(2, "Nazo", 50000);
		
		
		// 급여 인상 메소드
//		System.out.println("급여를 몇 퍼센트를 인상할지 입력하시오.");
//		double inputNumber = sc.nextDouble();
//		emp1.increaseSalary(inputNumber);

		// 직원 정보 출력
		emp1.printEmployee();
		emp2.printEmployee();
		emp3.printEmployee();
		
		// 직원의 객체를 출력하면 해당 직원의 ID, 이름, 월급이 출력
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		//emp1 와 emp2가 동일한지 비교
		System.out.println(emp1.equals(emp2));
	}
}
