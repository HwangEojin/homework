package section07;

public class EX07_15 {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 객체 생성
		stu1.studentName = "김고아"; // 이름 저장
		stu1.hello(); // hello 메서드 출력
		System.out.println("학교는" + Student.schoolName + "입니다."); // 출력
		Student.goToSchool(); // gotoschool 메소드 호출

		Student stu2 = new Student();// 객체 생성
		stu2.studentName = "김고삼";// 이름 저장
		stu2.hello();// hello 메서드 출력
		System.out.println("학교는" + Student.schoolName + "입니다.");// 출력
		Student.goToSchool();// gotoschool 메소드 호출

	}

}
