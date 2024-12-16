package test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserService {								// 기능을 담당하는 class 생성
	
	private List<UserVO> userList = new ArrayList<>();	// UserVO를 generic으로 사용하는 ArrayList 생성

	// 아이디 중복 검사 메서드
	public boolean checkId(String id) {					// boolean를 return하고 parameter로 id값을 받는 메소드 생성
		return userList.stream().anyMatch(user -> user.getId().equals(id));	//
		// 한개의 요소가 만족하는 지 조사.  user의 id값이 parameter로 들어온 id와 일치하는지 비교해서 true/ false로 반환
	}

//    public boolean checkId2(String id) {
//    	for(UserVO user : userList) {
//    		if(user.getId().equals(id)) {
//    			return true;
//    		}
//    	}
//    	return false;
//    }    
	
//	public boolean checkId3(String id) {
//		Iterator<UserVO> iter = userList.iterator();
//		while(iter.hasNext()) {
//			UserVO user = iter.next(); 
//			if(user.getId().equals(id)) {
//				return true;
//			}
//		}
//		return false;
//	}

	// 회원가입 메서드
	public void register(UserVO user) {							//userVO user를 parameter로 받는 ,method 생성
		if (checkId(user.getId())) {							// chockId 메소드 호출: parameter로 user.getId 전달받음 
			System.out.println("회원가입 실패: 아이디가 중복됩니다.");	// 아이디 중복 검사값이 true라면 메시지 출력
		} else {												// 아이지 중복 검사 값이 false면
			userList.add(user);									// 배열에 새로운 UserVO항목을 추가.
			System.out.println("회원가입 성공: " + user);			// 안내문 출력
		}
	}

	// 로그인 메서드
	public boolean login(String id, String password) {			//return type이 boolean이고 parameter 타입이 string인 메소드 선언
		return userList.stream().anyMatch(user -> user.getId().equals(id) && user.getPassword().equals(password));
																// id가 입력값과 일치하고 , password가 입력값과 일치하면 true 아니면 false.
	}
}
