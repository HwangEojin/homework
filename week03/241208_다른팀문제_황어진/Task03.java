package methodTask;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
//	문제3.
//	★메소드 회원가입★(메소드로 코드 분리하기)★
//
//	회원가입(입력 : 아이디, 닉네임, 비번, 비번확인)
//	→ 배열로 임의로 아이디와 닉네임 만들기(배열은 1차원 배열, 값은 각 3개)
//	→ 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
//	→ 닉네임도 겹치면 알려주기
//	→ 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
//	→ 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
//	→ 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값} 입니다"
//	└ 배열, 메소드, for문, if문, 형변환

//		logic
//		아이디를 저장하는 배열 생성 
//		닉네임를 저장하는 배열 생성 
//		회원가입 절차를 수행하는 메소드 생성
//		입력값을 저장하는 변수 선언
//		입력값을 변수에 저장
//		아이디, 닉네임 입력 단계마다 기존 배열을 순회하면서 같은 것이 있다면, 중복 메시지 출력
//		비밀번호는 두번 입력받고, 입력값 2개가 일치해야함.
//		확인 후 비밀번호를 아스키코드로 암호화
//		모든 조건이 충족되면 성공 메시지 출력 후 탈출
		Task03 task = new Task03(); // 객체 생성
		Scanner scan = new Scanner(System.in); // scanner import

		String userIdTable[] = new String[] { "admin", "guest1", "guest2" }; // id 리스트
		String userNickNameTable[] = new String[] { "거북이", "두루미", "홍길동" }; // 닉네임 리스트

		boolean idFlag = false;
		boolean nickFlag = false;

		task.checkDuplication(userIdTable, "아이디"); // 중복 체크 메소드에 전달

		task.checkDuplication(userNickNameTable, "닉네임"); // 중복 체크 메소드에 전달

		task.signUp(idFlag, nickFlag); // 메소드에 입력값과 테이블을 parameter로 전달
		
		scan.close();					// 입력메소드 종료
		
	}

	// 회원 가입 메소드

	void signUp(boolean condition1, boolean condition2) { // 아이디 비밀번호 일치 flag를 parameter로 받음
		if (!condition1 && !condition2) { // 둘다 중복되지 않았다면,
			Scanner scan = new Scanner(System.in); // scanner import
			String password = ""; // 비밀번호
			String enCryptedPw = ""; // 암호화된 비밀번호

			while (true) {
				System.out.println("비밀번호를 입력해주세요.");
				password = scan.nextLine(); // 닉네임을 입력값 변수에 저장
				System.out.println("비밀번호를 다시 입력해주세요.");
				String password2 = scan.nextLine(); // 닉네임을 입력값 변수에 저장
				if (!password.equals(password2)) { // 비밀번호가 일치하지 않는다면
					System.out.println("비밀번호가 일치 하지 않습니다."); // 메시지 출력
				} else { // 비밀번호가 일치한다면
					System.out.println("비밀번호가 일치합니다."); // 메시지 출력

					for (int i = 0; i < password.length(); i++) { // 비밀번호 길이만큼 반복
						int ascii = password.charAt(i); // 각자리를 ascii로 암호화
						enCryptedPw = enCryptedPw + ascii + " "; // 암호화한 비밀번호 생성
					}
					System.out.println("암호화한 비밀번호는 " + enCryptedPw + "입니다.");// 암호화한 비밀번호 출력
					System.out.println("회원가입이 완료되었습니다.");// 완료 메시지 출력
					break;
				}

			}

		}

	}

	// 중복 체크 메소드 (아이디, 닉네임 공통 사용)
	void checkDuplication(String[] array, String arrayType) { // 입력값과 계정 table을 parameter로 받음
		boolean flag = true; // loop
		Scanner scan = new Scanner(System.in); // scanner import

		while (flag) { // loop flag가 true인 한 반복
			System.out.printf("%s를 입력해주세요.\n", arrayType); // 안내메시지
			String inputValue = scan.nextLine(); // 입력값을 변수에 저장

			for (int i = 0; i < array.length; i++) { // table을 순회하며 중복 체크
				if (array[i].equals(inputValue)) { // 각 index와 비교
					flag = true; // 중복되는게 있다면 flag를 true로 업데이트
					System.out.printf("이미 있는 %s이므로 사용할 수 없습니다.\n", arrayType); // 중복 메시지 출력
					break; // break;
				} else { // 중복되는것이 없다면
					flag = false; // 반복 flag를 false로 업데이트
				}
			}
		}
	}
}
