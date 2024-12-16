package listTest;

class MyClass<T>{
	// 필드
	T data;

	public MyClass(T data) {
		super();
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
	
}


public class ArrayListTest02 {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass(1);
		System.out.println(mc1);
		mc1.printData();
		
		MyClass<String> mc2 = new MyClass("hello");
		
	}

}
