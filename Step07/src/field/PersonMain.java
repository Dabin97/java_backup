package field;

public class PersonMain {
//같은 패키지에 있으면 import를 하지않아도 된다. 
	public static void main(String[] args) {
		//new 메모리 할당하여 Person 객체(인스턴스)를 만듦.
		Person p1 = new Person(); //Person은 변수타입이다./이때 p1에 name과 age에 메모리가 할당(new)
		System.out.println(p1); //field.Person@782830e 메모리 주소값
		p1.name = "홍길동";
		p1.age = 20;
		System.out.println(p1.name + "," + p1.age);
		//이런식으로 저장되는 타입을 '레퍼런스 타입'이라고 한다.(반대: 프리미티브 타입 int 같은거)
		
		Person p2 = new Person();
		System.out.println(p2);
		p2.name = "김철수";
		p2.age = 33;
		System.out.println(p2.name + "," + p2.age);
		
		//class는 붕어빵틀에 비유한다. 
		//클래스도 배열로 선언가능
		
	}//main

}
