package section09;

public class EX09_12 {
	public static void main(String[] args) {
		Book b1 = new Book(); //객체 생성
		System.out.println("b1.title : " + b1.title);// 제목 출력
		System.out.println("b1.series : " + b1.series);// 시리즈 출력
		System.out.println("b1.page : " + b1.page);	//페이지 출력
		
		Book b2 = new Book("멘토시리즈 자바"); //객체 생성
		System.out.println("b2.title : " + b2.title);// 제목 출력
		System.out.println("b2.series : " + b2.series);// 시리즈 출력
		System.out.println("b2.page : " + b2.page);	//페이지 출력
		
		Book b3 = new Book("신데렐라", 170); //객체 생성
		System.out.println("b3.title : " + b3.title);// 제목 출력
		System.out.println("b3.series : " + b3.series);// 시리즈 출력
		System.out.println("b3.page : " + b3.page);	//페이지 출력
		
		Book b4 = new Book(5,"노인과 바다"); //객체 생성
		System.out.println("b4.title : " + b4.title);// 제목 출력
		System.out.println("b4.series : " + b4.series);// 시리즈 출력
		System.out.println("b4.page : " + b4.page);	//페이지 출력
		
	}

}
