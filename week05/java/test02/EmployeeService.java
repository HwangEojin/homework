package test02;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    private Map<String, Employee> employeeMap = new HashMap<>();

    // 사원 정보 추가
    public void addEmployee(String id, Employee employee) {
        employeeMap.put(id, employee);
    }

    // 특정 ID의 사원 정보 출력
    public Employee getEmployeeById(String id) {
        return employeeMap.get(id);
    }

    // 모든 사원의 정보 출력 (entrySet 사용)
    public void printAllEmployees() {
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            System.out.println("ID : " + entry.getKey() + ", 정보 : " + entry.getValue());
        }
    }

    // 모든 사원에게 연봉 추가
    public void addSalaryEmp(int salary) {
        employeeMap.values().forEach(employee -> employee.setSalary(salary));
    }
}












