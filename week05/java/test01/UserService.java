package test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserService {
	private List<UserVO> userList = new ArrayList<>();

	// 아이디 중복 검사 메서드
	public boolean checkId(String id) {
		return userList.stream().anyMatch(user -> user.getId().equals(id));
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
	public void register(UserVO user) {
		if (checkId(user.getId())) {
			System.out.println("회원가입 실패: 아이디가 중복됩니다.");
		} else {
			userList.add(user);
			System.out.println("회원가입 성공: " + user);
		}
	}

	// 로그인 메서드
	public boolean login(String id, String password) {
		return userList.stream().anyMatch(user -> user.getId().equals(id) && user.getPassword().equals(password));
	}
}
