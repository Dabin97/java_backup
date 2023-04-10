package inter;

public class TestMain {
	public static void eat(Eat e) {
		e.eat();
	}
	public static void main(String[] args) {
		eat(new Animal());
		eat(new Dog());
		eat(new Student());
		eat(new HighSchoolStudent());
		//인터페이스를 상속받은 Animal과 Student 아래에 있는 Dog와 HighSchoolStudent도 오버라이딩된다.
		//연계가 될만한것은 인터페이스로 하나로 묶는다. 
		//다형성 : 다중상속, 인터페이스, 추상화작업
		
	}//main

}
