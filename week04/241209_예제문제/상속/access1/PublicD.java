package section10.access1;

public class PublicD {								// 클래스 선언
	public static void main(String[] args) {
		PublicA  a = new PublicA(10);				// error : PublicA is not visible
	}

}
