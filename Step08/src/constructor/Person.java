package constructor;

public class Person {
	
	//접근제어자 private은 해당 클래스 내부에서만 접근가능
	private String name; 
	private int age;
	
	/*
	 *  생성자(constructor)
	 *  	생성자는 객체가 하나 생성이 될때 제일 먼저 실행되는 메서드
	 *  	1. 메서드명이 클래스명과 같다
	 *  	2. 리턴타입이 없다.
	 * 
	 */
	
	//기본 생성자
	public Person(){ //매개변수가 없고 아무일도 안하는 메서드/ 아무조건없이 객체를 찍어낼때
		System.out.println("Person 기본 생성자");  
		//데이터가 들어가는 경우 : 필수데이터가 있어야 만들어질때 데이터를 넣는다. 만들어질 조건을 매개변수에 넣는다. 
	}
	//생성자 - 이름, 나이 (init 함수와 동일한 형식) --> 객체의 필드를 초기화 하는 용도
	public Person(String n, int a) {
		System.out.println("String,int");
		name = n;
		age = a;
	}
	//동일한 이름의 메서드? 생성자는 가능. 특정조건을 달성하면 메서드명을 동일하게 사용 가능하다
	//오버로딩 - 받는 데이터만 다르고 기능이 똑같은 함수를 만들때 사용가능하다. 
	//오버로딩 : 함수 이름은 같으나 함수의 '매개 변수 개수, 타입' 등을 다르게 해서 사용하는 기법이다. 
	//리턴타입은 같아도 된다. 매개변수의 변수명도 같아도 상관없다. 
	
	
	
	//초기화
	void init(String n, int a) {
		name = n;
		if(a > 0)
			age = a;
	}
	
	//age setter
	public void setAge(int a) { //먼저 접근제어자명을 쓰고 public 되돌려받을게 없으니 void 그 다음set을 써줘야한다. 
		if(a > 0)
			age = a;
	}
	//age getter
	public int getAge() { //접근제어자명 public 변수타입 int 변수명(){return 되돌려줄 변수명}
		return age;
	}
	
	//name setter
	public void setName(String n) {
		name = n;
	}
	
	//name getter
	public String getName() {
		return name;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
