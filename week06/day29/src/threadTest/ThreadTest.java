package threadTest;

public class ThreadTest {
   public static void main(String[] args) {
      MyThread t1 = new MyThread("#");
      MyThread t2 = new MyThread("*");
      
      //멀티쓰레드로 생각할 수 있지만 단일쓰레드로 실행된다
      //단순히 run()에 재정의한 코드를 실행시킨 것이다
//      t1.run();
//      t2.run();
      //Thread 클래스에는 start()로 실행해야한다
      //start() 할 때 3개의 쓰레드가 사용된다
      t1.start();
      t2.start();
      
      //3개의 쓰레드 사용되는 것 확인
      for(int i = 0; i < 10; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
}
