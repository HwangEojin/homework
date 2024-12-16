package listTest;

import java.util.ArrayList;

public class ArrayList03 {
	public static void main(String[] args) {
//		List<Integer> ll = new ArrayList<>();
		ArrayList<Integer> li = new ArrayList<>();
		
		//추가
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		//값 가져오기 , index번호로 특정 값 가져오기
		System.out.println(li.get(0));
		
		//삭제 : index번호(int타입)
		//삭제한 요소를 반환
		System.out.println(li.remove(1));
		
		
		//삭제 :값으로 검색하여 삭제(Object)
		System.out.println("값 삭제 여부 : " + li.remove(Integer.valueOf(50)));
		
		//포함여부 검사 : 리스트에 존재하면 true, 없으면 false
		System.out.println(li.contains(40));
		System.out.println(li.contains(100));
		
		//수정
		System.out.println(li);
		System.out.println(li.set(2,50));
		System.out.println(li);
	}
}
