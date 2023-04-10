package set;

import java.util.HashSet;
import java.util.Iterator;

public class PersonTest {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("김철수", 20));
		set.add(new Person("홍길동", 30));
		set.add(new Person("박문수", 40));
		set.add(new Person("김철수", 20));
		
		Iterator<Person> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//(Person안에 hashCode를 만들지않았을때)set은 원래 중복 데이터가 들어가지않는데, 여기서는 중복데이터까지 모두 출력된다.
		//hashCode를 먼저 시행후 equals로 세부적으로 비교한다. 
		
		
	}//main

}
