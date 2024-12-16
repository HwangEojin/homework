package test02;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {											// 메소드를 담당하는 class 선언
    private Map<String, Employee> employeeMap = new HashMap<>();		// hashmap 객체 선언

    // 사원 정보 추가
    public void addEmployee(String id, Employee employee) {				// 사원 추가 메소드. parameter로 id와 Employee 타입의 메소드 생성
        employeeMap.put(id, employee);									// Map에 새로운 요소 추가
    }

    // 특정 ID의 사원 정보 출력
    public Employee getEmployeeById(String id) {						// id로 특정 항목을 선택하여 그 값의 정보를 출력하는 메소드. parameter로 id를 받음.
        return employeeMap.get(id);										// map 객체 중 해당하는 id가 일치하는 항목이 있는지 검색
    }

    // 모든 사원의 정보 출력 (entrySet 사용)
    public void printAllEmployees() {									// 모든 사원의 정보를 출력하는 메소드. return과 parameter 없음
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {				// for-each문으로 반복 수행. entry 객체로 각 항목에 getkey, getvalue로 접근
            System.out.println("ID : " + entry.getKey() + ", 정보 : " + entry.getValue());
        }
    }

    // 모든 사원에게 연봉 추가
    public void addSalaryEmp(int salary) {
        employeeMap.values().forEach(employee -> employee.setSalary(salary));
    }
}












