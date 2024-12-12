package section10;

public class SchoolBus extends Bus{

	SchoolBus(int peopleNum) {
		super(peopleNum);				// 버스의 생성자 호출
	}

	@Override
	void takePerson() {					// Bus 클래스의 takePerson()오버라이딩
		super.takePerson();				// Bus 클래스의 takePerson() 메서드 호출
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
	}

	@Override
	void ride() {						// Car 클래스의 ride() 오버라이딩
		super.ride();
		System.out.println("시속 50km/h로 천천히 달립니다.");

	}	
	
	
	

}
