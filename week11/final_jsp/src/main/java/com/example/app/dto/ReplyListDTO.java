package com.example.app.dto;

public class ReplyListDTO {
	
	
	private int replyNumber;
	private String replyContent;
	private String replyDate;
	private int boardNumber;
	private int memberNumber;
	private String memberId;
	
	
	public int getReplyNumber() {
		return replyNumber;
	}
	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}
	public int getBoardNumber() {
		return boardNumber;
	}
	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
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
	@Override
	public String toString() {
		return "ReplyListDTO [replyNumber=" + replyNumber + ", replyContent=" + replyContent + ", replyDate="
				+ replyDate + ", boardNumber=" + boardNumber + ", memberNumber=" + memberNumber + ", memberId="
				+ memberId + "]";
	}
	
	
	
	
	
}
