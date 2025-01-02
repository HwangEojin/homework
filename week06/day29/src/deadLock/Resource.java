package deadLock;

public class Resource {
	synchronized void methodA(Resource r) {
		System.out.println(Thread.currentThread().getName() + " 메소드 A");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		r.methodB(this);
	}
	synchronized void methodB(Resource r) {
		System.out.println(Thread.currentThread().getName() + " 메소드 B");
	}
}
