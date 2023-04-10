package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * Map 
		키(Key) - 값(Value)을 이용해서 데이터를 저장, 삭제, 읽기, 수정
	 * 
	 */
	public static void main(String[] args) {
		HashMap<String, Integer>map = new HashMap<String, Integer>(); 
		// HashMap<K, V>   K=key, V=value
		
		//데이터 추가
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put("A", 500); //key값은 중복 안됨, 기존값을 지우고 새값을 저장 - 똑같은 키값이면 수정
		
		System.out.println(map);//중복되었던 키값 A는 마지막 값만 출력된다. 출력되는 모양은 딕셔너리랑 비슷{중괄호}
								//키값이 중복되어도 수정처리하지 오류처리하지않는다. key값은 set으로 관리한다.(중복을 안받음)
		System.out.println(map.get("C")); //데이터를 꺼낼때도 키값을 이용

		//전체 데이터 꺼내기
		Set<String> set = map.keySet(); //저장된 키값을 set으로 가져옴
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " - " + map.get(key));
		}
		//키값이 set이기때문에 set.Iterator를 통해 전부 출력할 수 있다. 값도 Iterator로 꺼낸다.
		//while을 이용해서 전부 출력하는데, String key라는 임시변수를 만들어서 출력한다. 
		//그 이유는 next하면 다음값으로 넘어가서 해당값을 인식하지못하기 때문에 임시변수안에 값을 넣어서 반복문을 돌린다.
		
		//맵에 저장된 개수 (list,set도 동일하게 size로 출력한다.)
		System.out.println(map.size());
		
		//맵에 해당하는 키값이 있는지?
		System.out.println(map.containsKey("C"));
		System.out.println(map.containsKey("E"));
		System.out.println(map.get("E")); //키값이 없으면 null이 리턴된다. 
										  //get은 값을 꺼낼때쓰는 키워드, 다만 키값만 넣을수있다
		
		//맵에 해당하는 값이 있는지?
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(500));
		
		//맵에 값이 비어있는지?
		System.out.println(map.isEmpty());

		//맵 내용 비우기
//		map.clear();
//		System.out.println(map);
		
		//데이터 삭제
		map.remove("A");
		System.out.println(map.remove("B")); //저장하고있던 값을 출력함, B = 200
		//삭제를 했는데 값이 리턴되는 경우, 삭제할때도 스택에서 값을 pop(꺼냄)준다. 그러므로 저장했던 값이나 삭제한 값을 리턴해준다.
		System.out.println(map);
		
	}//main

}

/*
 * 
		 * Map 
		키(Key) - 값(Value)을 이용해서 데이터를 관리
		(키와 값 모두, 값이다. 값을 이용해서 값을 꺼냄)
		map내부에서 키를 꺼내오는 컬렉션이 따로 있다. 
		
		여러개의 금고를 관리하는 클래스
		키값을 통해서 데이터를 저장하거나 읽어온다.
		
		※ 키값은 중복이 되지않음(다른 언어도 동일)
		
		고유번호같은것. 중복 X
		
		map은 사용처가 정해져있음. 
 * 
 * 
 */
