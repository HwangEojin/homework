package com.app.domain;

public class UserDTO {

	//데이터를 전송하기 위한 목적의 class

	/*
	create TABLE tbl_user(
			user_number NUMBER,
			user_id varchar2(100),
			user_pw varchar2(100),
			user_name varchar2(10),
			user_age NUMBER,
			user_gender char(1) DEFAULT 'M',
			user_birth DATE,
			CONSTRAINT pk_user PRIMARY KEY(user_number)
		) ;
	 */

	//field
	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userGender;
	private String userBirth;

	//constructor

	//객체의 저장된 값을 수정하지 못하게 하고 싶은 경우 생성자로 필드 초기화
	public UserDTO() {

	}

	//모든 field값을 자유롭게 수정하게 하고 싶은 경우 getter/setter 사용

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	// toString => alt + shift + s + s

	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userName=" + userName + ", userId=" + userId + ", userAge="
				+ userAge + ", userGender=" + userGender + ", userBirth=" + userBirth + "]";
	}

}
