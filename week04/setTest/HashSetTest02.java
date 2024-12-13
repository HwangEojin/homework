package setTest;

import java.util.HashSet;

public class HashSetTest02 {
	public static void main(String[] args) {
		//HashSet 객체 생성
		HashSet<Student> set = new HashSet<>();
		System.out.println(set);
		
		//student 객체 생성
		Student st1 = new Student(1, "호옹기일동");
		
		set.add(st1);
		System.out.println(set);
	}
}
