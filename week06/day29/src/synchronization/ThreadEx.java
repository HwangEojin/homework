package synchronization;

public class ThreadEx implements Runnable{
   //필드
   int number;
   
   @Override
   public void run() {
      for(int i =0; i < 30; i++) {
         com();
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            System.out.println("sleep~");
         }
         break;
      }
   }
   
   public synchronized void com() {
      number++;
      System.out.println("com +");
      System.out.println("num : " + number);
      if(number > 9) {
         System.out.println("com이 num을 최대치로 올렸습니다");
         try {
            wait();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
            System.out.println("wait 중!");
         }
      }
   }
   
   public synchronized void user() {
      if(number == 0) {
         System.out.println("num이 이미 최소치입니다");
      }else {
         number--;
         System.out.println("user - ");
         System.out.println("num : " + number);
         notify();
      }
   }
}

















