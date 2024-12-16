package section10;

public class Book {	//클래스 선언
	
	//필드
	
	String title;	
	String author;	
	
	
	//생성자
	Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
	//메소드
	final void info_title(){
		System.out.println("책의 제목은" + title + "입니다.");
	}
	void info_author(){
		System.out.println("책의 저자는" + author + "입니다.");
	}

}
