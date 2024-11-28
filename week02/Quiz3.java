package doWhileTest;

import java.util.Scanner;

public class Quiz3 {
   public static void main(String[] args) {
//      1번 문제
//      - 이중 for문 사용 (위로 향하는 삼각형은 행 : 6, 열 : 6 / 아래로 향하는 삼각형 행 : 5, 열 : 5)
//      (1)   여백은 행이 내려갈수록 증가, *도 행이 내려갈수록 증가
//      (2)   여백은 행이 내려갈수록 증가, *이 행이 내려갈수록 감소
      
//      ** 로직
      
//      위로 향하는 삼각형 출력
//      행(6줄)을 위한 for문
      for (int i = 1; i <= 6; i++) {
//         공백 5, 4, 3, 2, 1 칸 출력을 위한 for문
         for (int j = 5; j >= i; j--) {
            System.out.print(" ");
         }
//         * 1, 2, 3, 4, 5 칸 출력을 위한 for문
         for (int k = 1; k < i+1; k++) {
            System.out.print("* ");   
         }
         System.out.println();
      }
      
//      아래로 향하는 삼각형 출력
//      행(5줄)을 위한 for문
      for (int l = 1; l < 6; l++) {
//         공백 1, 2, 3, 4, 5칸 출력
         for (int m = 0; m < l; m++) {
            System.out.print(" ");
         }
      
////         별 5, 4, 3, 2, 1칸 출력
         for (int n = 5; n >= 0+l; n--) {
            System.out.print("* ");
         }
         System.out.println();
      }
      
      
//      ==============================================================
      
//      2번 문제
//      1) 입력클래스 import
//      2) 정수 변수선언 (콜라, 사이다, 커피, 입력받은 금액, 거스름돈)
//      3) while문 출력
//      6) switch문 (답변 선택 / 잔액반환 받으면 종료) {
//         6-1) 구매 가능시 메세지 출력 (음료수가 나왔습니다, 구매 가능한 음료수 개수)
//            잔액 / 음료수 = 구매 가능 개수 확인해서 출력
//            소지금액 - 사용한 금액 = 잔액 출력
//              --> 반복문으로 다시 돌아가서 반복 (= 선택지 출력)
//         6-2) 잔액 부족시 잔액반환 누르고 종료
//               > 잔액 출력 (0000원이 반환되었습니다)
//               > 잔액 반환 (= 프로그램 종료)
//         6-3) 그 외 번호 입력시 '잘못된 입력입니다' 출력
//      7) 버퍼 비우기 (잔액이 0이 되면 반복 종료) {

      Scanner sc = new Scanner(System.in);
      
      int money = 0, balance = 0, choice = 0, result = 0;
      final int COFFEE = 4000;
      final int COKE = 2500;
      final int CIDER = 2000;
      boolean isLoop = true;
      
      
      System.out.print("\n금액을 입력해주세요 : ");
      balance = sc.nextInt();
      while (isLoop) {
         System.out.println("메뉴 출력 1~4번까지\r\n"
               + "      1 콜라 : 2500\r\n"
               + "      2 사이다 : 2000\r\n"
               + "      3 커피 : 4000\r\n"
               + "      4 잔액반환");
         System.out.print("\n메뉴 입력해주세요 : ");
         choice = sc.nextInt();
         
         switch (choice) {
         case 1:   // 콜라
            result = balance / COKE;
            System.out.println("구매 가능한 음료 개수는 " + result + "개 입니다");
            balance = balance-(result*COKE);
            System.out.println("잔액은 " + balance + "원 입니다");
            break;
         case 2:   // 사이다
            result = balance / CIDER;
            System.out.println("구매 가능한 음료 개수는 " + result + "개 입니다");
            balance = balance-(result*CIDER);
            System.out.println("잔액은 " + balance + "원 입니다");
            break;
         case 3:   // 커피
            result = balance / COFFEE;
            System.out.println("구매 가능한 음료 개수는 " + result + "개 입니다");
            balance = balance-(result*COFFEE);
            System.out.println("잔액은 " + balance + "원 입니다");
            break;
         case 4:   // 반환
            System.out.println("잔액은 " + balance + "원 입니다");
            System.out.println(balance + "원 반환되었습니다.");
            isLoop = false;
            break;
         default:
            System.out.println("잘못 입력하셨습니다\n");
            break;
         }
         
      }
      
      sc.close();
      
      

   }
}
