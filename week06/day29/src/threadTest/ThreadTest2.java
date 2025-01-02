package threadTest;

public class ThreadTest2 {
   public static void main(String[] args) {
      MyThread2 mt1 = new MyThread2();
      MyThread2 mt2 = new MyThread2();

//      mt1.run();
//      mt2.run();

      Thread t1 = new Thread(mt1, "A");
      Thread t2 = new Thread(mt2, "B");

      t1.start();
      t2.start();

      // Runnable 인터페이스는 함수형 인터페이스이다
      // 람다식을 활용할 수 있다
      Runnable r1 = () -> {
         for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());

            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      };

   }
}
