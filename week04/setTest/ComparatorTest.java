package setTest;

import java.util.Comparator;

class Person {
   // 필드
   String name;
   int age;

   // 생성자
   public Person(String name, int age) {
      super();
      this.name = name;
      this.age = age;
   }

   // toString 오버라이딩
   @Override
   public String toString() {
      return "Person [name : " + name + ", age : " + age + "]";
   }

}

class AgeComparator implements Comparator<Person> {
//compare 메소드 구현 : 나이를 기준으로 비교
   @Override
   public int compare(Person o1, Person o2) {
      return Integer.compare(o1.age, o2.age);
      // 나이를 오름차순으로 비교
   }

   @Override
   public boolean equals(Object obj) {
      return obj instanceof AgeComparator;
   }

}

public class ComparatorTest {
   public static void main(String[] args) {
      Person p1 = new Person("짱구", 20);
      Person p2 = new Person("철수", 25);
      Person p3 = new Person("맹구", 26);

      AgeComparator ageCom = new AgeComparator();

      System.out.println(ageCom.compare(p2, p3));
      System.out.println(ageCom.equals(new AgeComparator())); // true
      System.out.println(ageCom.equals(new Object())); // false

   }
}
