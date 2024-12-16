package mapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//1번 : hashMap
public class HashMapTest01 {
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<>();
		System.out.println(map);
		System.out.println(map.toString());

		map.put("StringKey", "StringValue");
		System.out.println(map);
		map.put(map, map);
		System.out.println(map);
//		map.put(map, "Value2"); //자기 참조 추가 => 무한 재귀 발생
		// HashMap이 자기 자신을 값이나 키로만 포함시키는 경우,
		// hashCode() : 키와 값의 해시코드를 계산하는 과정에서 자기자신을 다시 호출 -> 무한 재귀
		// toString() : HashMap의 모든 키-값 쌍을 문자열로 변환하는 과정에서 자기 자신을 참조 -> 무한 재귀
//		System.out.println(map); //무한 재귀 StackOverflowError
//		

//		ArrayList<List> li = new ArrayList<>();
//		li.add(li);
//		System.out.println(li);

	}
}
