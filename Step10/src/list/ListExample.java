package list;

import java.util.ArrayList;

public class ListExample {
/*
 * List의 특징
 * 		1. 데이터 중복 O
 * 		2. 리스트에 등록된 데이터 순서가 보장됨
 * 
 * 		ArrayList : 리스트에서 데이터를 배열로 관리
 * 
 */
	public static void main(String[] args) {
		//리스트 생성한 부분, <저장할 데이터 타입(레퍼런스형만 가능)> --> 클래스가 들어감(프리미티브 타입은 제외) : 제네릭 = 템플릿
		ArrayList<String> list = new ArrayList<String>(); 	
		//데이터 추가
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("HTML/CSS"); //중복된 데이터도 저장됨
		list.add("jsp");
		
		System.out.println(list);
		
		//데이터 삭제1 - 인덱스 번호로 삭제
		list.remove(1);
		System.out.println(list);//1번째 인덱스가 삭제됨
		
		//데이터 삭제2 - 값을 이용해서 삭제 ---> equals()를 재정의 해야됨
		list.remove("java");
		System.out.println(list);
		
		//리스트에 저장된 데이터 개수
		System.out.println(list.size()); //arr.length는 길이 list.size는 개수
		
		//해당 데이터가 리스트에 있는지?
		System.out.println(list.contains("android")); //false
		System.out.println(list.contains("jsp"));	  //true
		
		//리스트에 있는 모든 데이터를 삭제
//		list.clear();
//		System.out.println(list);
		
		//리스트에 내용이 비어있는지 체크(데이터조회 및 추출작업에서 검색용)
		System.out.println(list.isEmpty()); 
		
		//리스트에 원하는 데이터를 원하는 위치에 추가
		list.add(1,"android");
		System.out.println(list);
		
		//리스트에 있는 모든 데이터를 하나씩 꺼내기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
