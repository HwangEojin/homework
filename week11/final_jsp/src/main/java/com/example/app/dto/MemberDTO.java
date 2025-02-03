package com.example.app.dto;

public class MemberDTO {
//	CREATE TABLE tbl_member(
//			member_number NUMBER,
//			member_id varchar2(300),
//			member_password varchar2(300),
//			member_name varchar2(300),
//	   		member_phone_number varchar2(300),
//			member_age NUMBER(3),
//			member_gender char(1),
//			CONSTRAINT pk_member PRIMARY KEY(member_number)
//		);

	private int memberNumber;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberPhoneNumber;
	private int memberAge;
	private String memberGender;

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}

	public void setMemberPhoneNumber(String memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberPassword="
				+ memberPassword + ", memberName=" + memberName + ", memberPhoneNumber=" + memberPhoneNumber
				+ ", memberAge=" + memberAge + ", memberGender=" + memberGender + "]";
	}

}
