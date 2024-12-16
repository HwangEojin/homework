package section10;

public class EX10_27 {
	public static void main(String[] args) {
		Comic comicBook = new Comic("주머니 괴물","미상",true);			// 객체 생성
		comicBook.info_title();										// 메소드 호출
		comicBook.info_author();									// 메소드 호출
		comicBook.info_color();										// 메소드 호출
	}

}
