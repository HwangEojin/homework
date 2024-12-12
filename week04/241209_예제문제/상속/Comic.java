package section10;

public class Comic extends Book { // Book 클래스를 상속받는 자식 클래스 Comic
	// 필드
	boolean isColor;

	// 생성자
	Comic(String title, String author, boolean isColor) {
		super(title, author);
		this.isColor = isColor;
	}

	// @Override
	// final void info_title(){
	//
	// }
	// 부모 클래스에서 final로 선언된 메서드를 오버라이딩 시도하면 Cannot override the final method from
	// Book 이러한 에러가 발생합니다.

	@Override
	void info_author() { // 이 메소드는 override가 가능합니다.
		super.info_author();
	}

	void info_color() {
		if (isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}

}
