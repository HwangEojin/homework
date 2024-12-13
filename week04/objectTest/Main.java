package objectTest;

public class Main {
	public static void main(String[] args) {
		User user1 = new User(1, "짱구");
		User user2 = new User(1, "짱구");

		// System.out.println(user1 instanceof User);
		// System.out.println(user2 instanceof User);
		Object obj = user1;
		// obj.userNumber //업캐스팅되었기 때문에 자식 클래스의 멤버 사용불가능
		// Object obj = user2;
		User user = (User) obj; // 다운캐스팅
		// user.userNumber //userNumber 사용가능
		
		
	      String str1 = "hello";
	      System.out.println(str1);
	      System.out.println(str1.toString());
	      
	      int[] ar = {1, 2, 3};
	      System.out.println(ar);
	      System.out.println(ar.toString());
	}
}
