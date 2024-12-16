package test01;

public class UserVO {
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		UserVO userVO = (UserVO) obj;
		return userNo == userVO.userNo;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(userNo);
	}
}














