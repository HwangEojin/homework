package pack;

import java.util.Scanner;

public class WordFilter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		WordFilter filter = new WordFilter();

		int flag = 0; // 메소드 사용 리턴값을 담을 변수
		int count = 3;
		System.out.println("채팅 필터링 시스템입니다. 럏, 귧, 괣, 퓳 이 들어간 단어는 검열됩니다. 종료하려면 종료 를 입력하세요");

		while (count >= 0) { // 탈출 하기 전까지 반복
			if (count ==0) {
				System.out.print("부적절한 채팅을 너무 많이 입력하셨습니다.");		
				break;
			}
			String inputSentence = sc.nextLine();
			flag = filter.chatFilter(inputSentence); // 변수에 메소드 리턴값 담기
			if (flag > 0) { // 키워드가 들어가 있다면
				System.out.println("욕설이 감지되었습니다.");
				count--; // 기회 차감

			} else if (flag == -1) { // 키워드가 들어가 있지 않다면
				System.out.println("탈출합니다.");
				count = 0;
			}
		}

		sc.close();

	}

	// 럏귧 ==length ==2
	int chatFilter(String chatting) {
		String word = ""; // 입력받은 문자열을 문자로 쪼개서 저장하는 변수
		String result = ""; // 최종 출력할 변수
		int flag = 0; // 특정 키워드가 들어간 문장이면 flag값이 변경됨
		String magicKeyword = "종료";

//	
		for (int i = 0; i < chatting.length(); i++) { 											    // 매개변수 문자열 만큼 반복
			word = chatting.charAt(i) + ""; 														// 쪼갠 문자열을 변수에 담기
			if (word.equals("럏") || word.equals("귧") || word.equals("괣") || word.equals("퓳")) {   // 키워드 검사
				word = "*";
				result = result + word; 															// 키워드가 없다면 그대로 문자열에 담기
				flag = 1; 																			// 키워드가 있으면 flag를 1로 변경
			} else if (chatting.equals(magicKeyword)) {
				flag = -1; 																			// 키워드가 있으면 flag를 -1로 변경
			} else {
				result += word; 																	// 키워드가 없다면 그대로 문자열에 담기
			}

		}
		System.out.println(result); // 결과 문자열 출력
		return flag; // 체크한 리턴값 반환
	}

}
