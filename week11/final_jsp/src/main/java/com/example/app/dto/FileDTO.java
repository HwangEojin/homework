package com.example.app.dto;

public class FileDTO {

//	CREATE TABLE tbl_file(
//			file_system_name varchar2(300), --서버에 저장되는 실제 파일명
//			file_original_nam varchar2(300), --원본 파일명
//			board_number NUMBER,
//			CONSTRAINT pk_file PRIMARY KEY (file_system_name),
//			CONSTRAINT fk_file FOREIGN KEY (board_number) REFERENCES tbl_board(board_number)
//		);
//	

	private String fileSystemName;
	private String fileOriginalName;
	private int boardNumber;

	public String getFileSystemName() {
		return fileSystemName;
	}

	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}

	public String getFileOriginalName() {
		return fileOriginalName;
	}

	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	@Override
	public String toString() {
		return "FileDTO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName + ", boardNumber="
				+ boardNumber + "]";
	}

}
