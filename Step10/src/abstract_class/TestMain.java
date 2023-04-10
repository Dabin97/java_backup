package abstract_class;

public class TestMain {

	public static void main(String[] args) {
		//추상 클래스는 직접적으로 생성 X
		//Animal animal = new Animal();
		
		
		//자식 클래스가 생성이 될때만 추상클래스가 생성이 된다. 
		Person p = new Person();
		p.eat();
		p.run();
		
		//추상 클래스도 데이터 타입
		Animal a = p;
		a.eat();
	
	}//main

}
