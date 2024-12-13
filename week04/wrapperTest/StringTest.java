package wrapperTest;

public class StringTest {
	
	public static void main(String[] args) {
		String msg = "안녕하세요";
		
		//charAt()
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(2));
		
		//indexOf()
		System.out.println(msg.indexOf("안"));
		System.out.println(msg.indexOf("h"));
		
		//split
		String msg2 = "안!녕!하!세!요";
		System.out.println(msg2);
		
		String ar[] = msg2.split("!");
		System.out.println(ar[0]);
		System.out.println(ar[1]);

		
		for (String data : ar) {
			System.out.println("for 문 출력 :  " + data);
		}
		
		//length()
		System.out.println(msg.length());
		
		//strip()
		String msg3 = "            안녕             ";
		System.out.println(msg3);
		System.out.println(msg3.length());
		System.out.println(msg3.strip());
		System.out.println(msg3.strip().length());
	
		//substring(start,end)
		System.out.println(msg2);
		System.out.println(msg2.substring(0,3));
		
		//contains()
		System.out.println(msg2.contains("하"));
		System.out.println(msg2.contains("하하하"));
	}
	
	
	

}
