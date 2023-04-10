package constructor;

public class AccessTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.init("홍길동", 20);
//		p.age = -100; //잘못된 값 입력을 막을수없다. private으로 변경했더니 접근이 불가능해졌다. 
		p.setAge(100); //외부로부터 데이터를 셋팅할때는 setter를 이용한다. 
		p.printInfo();
		
		Person s = new Person("김철수",33);
		s.printInfo(); //이름 : 김철수 나이 : 33 /위처럼 기본생성자가 뜨지않았다. 
		
		
	}//main

}


/* <접근제어자>
 * 
 * public 
 * 누구든지 사용 가능하다. 오픈되어있다.
 * 
 * default
 * 같은 동네에 있으면 접근 가능하다. 같은 패키지(폴더) 내에 있으면 접근할 권한이 있다. 마을공공재
 * 
 * protected
 * 하위 객체들만 사용가능?
 * 
 * private
 * 외부에서 접근 불가, 해당 클래스 내에서만 접근할수있다. 
 * 
 */


/*
 * <생성자>
 * new를 했을때 제일 먼저 실행되는 메서드
 * 생성자를 안만들었다면 자바에서 기본생성자를 자동으로 만들어서 넣어준다.
 * 특징 1 :메서드명이 클래스명과 똑같다.
 * 특징 2 : 리턴타입이 없다. return
 * 
 * Person p = new Person();
 * Person(); 이것이 Person의 기본 생성자이다.메서드
 * 
 */ 
