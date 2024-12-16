package test01;

public class UserVO {						// user 기본 정보를 담당하는 class 선언
	// 필드
	private int userNo;
	private String id;
	private String password;
	private String name;
	private int age;

	// 생성자
	public UserVO(int userNo, String id, String password, String name, int age) {
		this.userNo = userNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	// Getter 메서드
	public int getUserNo() {
		return userNo;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "UserVO{" + "userNo=" + userNo + ", id='" + id + '\'' + ", password='" + password + '\'' + ", name='"
				+ name + '\'' + ", age=" + age + '}';
	}

	// equals 재정의 (userNo로 동일성 판단)
	@Override
	public boolean equals(Object obj) {							// return은 boolean, parameter로 Object 타입을 받음
		if (this == obj) {										// 만약 해당 객체가 obj와 일치한다면
			return true;										// true를 반환
		}
		if (obj == null || getClass() != obj.getClass()) {		// 만약 obj가 null 또는 현재 참조하고 있는 class가 obj의 class와 같지 않다면,
			return false;										// false 반환
		}
		UserVO userVO = (UserVO) obj;							// UserVo 타입 으로 obj를 다운 캐스팅
		return userNo == userVO.userNo;							// userNo 가 해당객체의 userNo와 같다의 결과 값을 반환
	}

	@Override
	public int hashCode() {										// 해시코드 반환 메소드 오버라이드
		return Integer.hashCode(userNo);						// userNo를 해시코드화 한 값을 반환
	}
}














