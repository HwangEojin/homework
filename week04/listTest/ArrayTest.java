package listTest;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			li.add((10-i) * 10);
		}
		System.out.println(li);
		
		
		//Collections 클래스 : 컬렉션 프레임워크와 관련된 여러 메소드를 가지고 있다.
		// 일부 알고리즘도 구현되어있음
		// static 메소드로 구현했기 때문에 객채를 만들 필요가 없다.
	}
}
