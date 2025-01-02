package synchronization;

public class SynchronizedTest {
	public static void main(String[] args) {
		Test t = new Test();
		
		Thread t1 = new Thread(t, "쓰레드-1");
		Thread t2 = new Thread(t, "쓰레드-2");
		
		t1.start();
		t2.start();
	}

}

