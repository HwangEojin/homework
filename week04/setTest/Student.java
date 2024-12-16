package setTest;

public class Student {
	//필드
	int number;
	String name;
	
	//Student 클래스의 생성자
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number : " + number + ", name : " + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if(obj instanceof Student) {
			//학번 (number)을 기준으로 두 Student 객체가 같은지 여부 판단 후 반환
			return this.number == ((Student)obj).number;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.number;
	}
	
	
	
	
	
	
	
	
}
