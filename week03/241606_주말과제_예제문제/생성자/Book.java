package section09;

public class Book {	//클래스 선언
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	public Book() {	//생성자 1
		
	}
	
	Book(String t){ // 생성자 2
		title = t;
		
	}
	Book(String t , int p){ // 생성자 3
		title = t;
		page = p;
		
	}
	Book(int s , String t){ // 생성자 4
		series = s;
		title = t;
		
	}

}
