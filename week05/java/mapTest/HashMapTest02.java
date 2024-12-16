package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//2번 : HashMap
public class HashMapTest02 {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		System.out.println(map);
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		System.out.println(map);

		map.put("e", 1); // key는 중복 불가능, value 중복가능
		System.out.println(map);
		System.out.println(map.get("d"));

		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());

		HashMap<String, Integer> mart = new HashMap<>();
		// 추가 put()
		mart.put("새우깡", 2200);
		mart.put("빼빼로", 2000);
		mart.put("포카칩", 2500);
		mart.put("양파링", 2900);
		System.out.println(mart);

		// 조회 get(key)
		System.out.println(mart.get("새우깡"));
		System.out.println(mart.get("양파깡"));

		// 삭제 remove(key)
		System.out.println(mart.remove("빼빼로"));
		System.out.println(mart);

		// 길이 size
		System.out.println(mart.size());

		// key에 포함되어있는지 확인 containsKey
		// value에 포함되어있는지 확인 containsValue
		System.out.println(mart.containsKey("포카칩"));
		System.out.println(mart.containsValue(1000));

		// Iterator
		// keySet -> key만 가져오기
		System.out.println(mart.keySet());
		Iterator<String> iter = mart.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// values에서 value만 가져오기
		System.out.println(mart.values());
		Iterator<Integer> iter2 = mart.values().iterator();
		System.out.println(iter2);
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}

		// Entry key, value 한쌍씩 가져오기
		Set<Entry<String, Integer>> items = mart.entrySet();
		for (Entry<String, Integer> entry : items) {
			System.out.println(entry);
		}
	}
}
