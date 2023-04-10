package method;

public class PersonMain {
	//p는 메모리 주소를 받기 때문에
	//레퍼런스 형은 원본에 접근해서 값을 변경할 수 있다.
	public static void addAge(Person p) {//나이 증가 메소드
		//Person p의 나이값을 하나 증가 저장
		p.setAge(p.getAge() + 1); // p.getAge() + 1만 하면 적용이 되지않는다. p.setAge안에 넣어서 값을 넣는다. 
	}//addAge
	
	public static void main(String[] args) {
		Person s = new Person("홍길동",20);
		System.out.println(s);
		addAge(s);
		System.out.println(s);
		
		
	}//main

}

/*
 *	<메모리영역>
 *	코드영역 : 소스코드가 저장되는 곳 / 스택 : 지역변수가 저장되는 곳 
 *	힙 : new로 만든 메모리들이 저장되는 곳 / 데이터 영역 : static 영역
 *	
 * 	static라는 키워드가 붙으면 해당 프로그램이 실행되기전에 메모리를 '미리' 할당해놓는 것.
 * 	생성되는 시점부터 프로그램이 끝날때까지 유지된다. 그러므로 너무 많이 쓰면 터진다. 
 * 	
*/