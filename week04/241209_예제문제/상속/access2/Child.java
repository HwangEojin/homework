package section10.access2;

import section10.access1.Parent;

public class Child extends Parent{
	void accessTest() {
		super.accessProtected(); // 이렇게 접근이 가능
		Parent p1 = new Parent();
		//p1.accessProtected; <- 자식 클래스더라도, 객체로 접근하는 것은 불가능 합니다.
		// 에러 : The method accessProtected() from the type Parent is not visible;
	}

}
