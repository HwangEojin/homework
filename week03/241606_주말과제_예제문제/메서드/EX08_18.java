package homework;

public class EX08_18 {
	public static void main(String[] args) {
		int money = 10000;						//현재 소지금을 변수로 선언하고 10000을 저장
		EX08_18 bus = new EX08_18();			// 객체 생성
		
		bus.take(money);						//bus 인스턴스에서 take메소드 호출
				
	}
	
	void take(int m) {							// 매개 변수로 m을 출력값이 없는 메소드 선언
		while (true) {							// return 이 나올때 까지 무한 반복
			
			if(m<3000) {						// 소지금이 3000 미만이라면
				System.out.println("교통카드를 충전하러 갑니다.");		//출력
				return;							// 탈출
			}
			System.out.println("버스를 탑니다.");	//소지금에서 1250만큼 뺍니다
			m -= 1250;
			
			
		}
	};
	
	
	
	
	
}
