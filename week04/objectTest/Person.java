package objectTest;

//3번 : Object클래스 - equals()
public class Person {
	// 필드
	String name;
	int age;

	// 매개변수 있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name : " + name + ", age : " + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// 자기자신과 같은 경우
		if (this == obj) {
			return true;
		}

		// 이름이 같은 경우 => 같은 객체로 판단
		if (obj instanceof Person) {
			String other = ((Person) obj).name;
			if (this.name.length() == other.length()) {
				for (int i = 0; i < this.name.length(); i++) {
					if (this.name.charAt(i) != other.charAt(i)) {
						return false;
					}
				}
				return true;
			}
		}

		// 이름이 같은경우(코드 짧게도 가능)
		if (obj instanceof Person) {
			String other = ((Person) obj).name;
			return name.equals(other);
		}
		
		//나이까지 비교하기
		//만약 obj가 person 클래스의 인스턴스라면
		//person 클래스 타입의 참조변수에 obj를 다운캐스팅해서 대입
		//return으로 이름고 ㅏ나이가 같으면 true 반환
		// 이름 같음 => this.name.equals(other.name)	// 문자열은 equals로 비교
		// 나이 같음 => this.age == other.age // 정수는 관계연산자로 비교
		// 두개를 논리연산자 &&로 묶음
		
		//equals를 재정의하면 hashcode도 재정의, 동일객체에 대해 같은 hashcode 값이 반환되도록
		//return name.hashcode()+ Integer.hashCode(age); 형태로 작성 가능
		
		
		if(obj instanceof Person) {
			Person other = (Person)obj;
			return this.name.equals(other.name) && this.age == other.age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.age;
	}
	
	
	
	
	
	

}
