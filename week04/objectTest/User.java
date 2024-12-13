package objectTest;

public class User {
	//필드
	int userNumber;
	String userName;
		
	
	
	//생성자
	
	
	public User() {
		super();
	}
	
	public User(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [usernumber = " + userNumber + " userName = " + userName  + "]";
	}

	@Override
	public int hashCode() {
		return this.userNumber;
	}
	
	//해시코드 오버라이딩
	
	@Override
	public boolean equals(Object obj) {
		//자기 자신과 비교하는 경우
		if (this == obj) {
			return true;
		}
		
		//null 과 비교하는 경우
		if (obj instanceof User) {
			User usre = (User)obj;
			
		}
		return false;
		
	}
	
	
	
}
