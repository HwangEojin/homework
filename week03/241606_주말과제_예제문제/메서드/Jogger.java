package homework;

public class Jogger {
	public static void main(String[] args) {
			Jogger jogger = new Jogger();				// 객체 생성
			jogger.run;									//jogger 인스턴스의 run 메소드 호출
			String name;								// 이름 변수 생성
			jogger.name = "김나비";
		}

	void run() {										//메소드 생성 return 타입 void
		System.out.println("run run run!");				//출력문
	}
	
	void sayName() {									//메소드 생성 return 타입 void
		System.out.println("제 이름은 " + name + "입니다.");
	}
	

}
