package map;

import java.util.HashMap;

public class MapObjectTest {

	public static void main(String[] args) {
		//Hashmap 하나 생성
		//Person 객체 맵에 5건 저장 - 키값은 이름, 값은 - Person객체
		HashMap<String, Person> map = new HashMap<String, Person>();
		//이름이 들어갈 키값은 String으로, 값은 Person객체라는 뜻은 Person으로 넣으면 된다. 
		map.put("홍길동", new Person("홍길동", 20)); //Person객체를 넣었으므로 값 부분에는 new Person("홍길동", 20) 이렇게 넣는다.
		map.put("김철수", new Person("김철수", 20));
		map.put("이영희", new Person("이영희", 40));
		map.put("박영수", new Person("박영수", 50));
		map.put("이수영", new Person("이수영", 60));
		
		System.out.println(map.containsValue(new Person("이영희", 40))); //해당값이 있느냐?
		
		//Value에 객체를 넣는것은 별로없고, Object를 넣어서 산재해있는 값들을 한번에 정리하는 용도로 사용한다. 
		
	}

}
