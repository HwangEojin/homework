package homework2;

public class Book {
	/*
	 * book 클래스 필드 title, author
	 * 
	 * 생성자 기본 생성자 : 제목과 작가를 "알수없음"으로 초기화 매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화 매개변수 생성자
	 * : 제목과 작가를 모두 받아 초기화
	 * 
	 * EBook 클래스 Book 클래스를 상속 필드 sizeInMB
	 * 
	 * 생성자 기본 생성자 super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정 매개변수 생성자 제목, 작가,
	 * 크기를 받아 초기화
	 */

//	String title = "알 수 없음"; // 필드에서 알 수 없음으로 초기화 하는 방법
//	String author = "알 수 없음"; // 필드에서 알 수 없음으로 초기화 하는 방법
	String title;  
	String author; 
	int size;

//	public Book(String title) {					//제목만 받아 작가를 "알수없음"으로 초기화 하는 방법
//		super();
//		this.title = title;
//	}
//	public Book(String author) {				//작가만 받아 작가를 "알수없음"으로 초기화 하는 방법
//		super();
//		this.author = author;
//	}
	
	
	public Book(String title, String author, int size) { // 제목, 작가만 받아 "알수없음"으로 초기화 하는 방법
		super();
		
		this.title = title;
		this.author = author;
		this.size = 0;
	}

}
