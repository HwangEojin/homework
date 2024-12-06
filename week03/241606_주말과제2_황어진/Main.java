package homework2;

public class Main {
	public static void main(String[] args) {
		/*
		 * book 클래스 필드 title, author
		 * 
		 * 생성자 기본 생성자 : 제목과 작가를 "알수없음"으로 초기화 
		 * 매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화 
		 * 매개변수 생성자 : 제목과 작가를 모두 받아 초기화
		 * 
		 * EBook 클래스 Book 클래스를 상속 필드 sizeInMB
		 * 
		 * 생성자 기본 생성자 super()를 호출하여 
		 * 제목과 작가를 "알수없음"으로 초기화하고 
		 * 크기를 0으로 설정 
		 * 매개변수 생성자 제목, 작가, 크기를 받아 초기화
		 */
		
		Book bk = new Book("알 수 없음", "알 수 없음" ,0);					// 객체 생성
		Ebook ebk = new Ebook("알 수 없음", "알 수 없음" ,0);					// 객체 생성
		
		System.out.println("책이름 : " +  bk.title);
		System.out.println("작가 : " +  bk.author);
		System.out.println("책 크기 : " +  bk.size);
		System.out.println(ebk);
		
		System.out.println("책이름 : " +  ebk.title);
		System.out.println("작가 : " +  ebk.author);
		System.out.println("책 크기 : " +  ebk.size);
		
	}
}
