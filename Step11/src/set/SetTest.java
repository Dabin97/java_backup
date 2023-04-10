package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	/*
	 * Set 1. 중복 X 2. 자동 정렬
	 * 
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		// 데이터 등록
		set.add("HTML/CSS");
		set.add("js/jQuery");
		set.add("java");
		set.add("HTML/CSS");
		set.add("java");
		set.add("jsp");
		set.add("Spring");
		set.add("Android");

		System.out.println(set); // 중복데이터는 안보이고 알아서 정렬됨

		// java 삭제
		System.out.println(set.remove("java"));
		System.out.println(set);

		// 데이터 개수 체크
		System.out.println(set.size());
		// 데이터 검색 - 있는지 체크
		System.out.println(set.contains("java")); // java위에서 삭제함
		// set 내용 비우기
//		set.clear();
		// set이 비었냐?
		System.out.println(set.isEmpty());
		
		
		//전체조회 - 1
		Object[] arr1 = set.toArray();
		// Object로 주는 toArray는 형변환이 필요하다. 배열로 주는것은 형변환을 안해도 된다.]
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		String[] arr2 = new String[set.size()];
		String[] arr3 = set.toArray(arr2); //arr2를 가져오는 배열형식의 set.toArray
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//전체 조회 - 2
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) { //it.hasNext() ()안에 들어간것이 set안에 있느냐 묻는것
			System.out.println(it.next());
		} //데이터를 처음부터 끝까지 뽑음
		
		
		
		
	}//main

}
