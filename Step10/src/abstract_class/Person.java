package abstract_class;

public class Person extends Animal {

	public Person() {
		System.out.println("PerSon Constructor");
	}
	
	
	//추상 메서드는 반드시 오버라이딩 해야한다.
	//하지않으려면 자식 클래스로 추상클래스로 작성해야한다. (abstract class)
	@Override
	public void run() {
		System.out.println("사람이 달립니다.");
	}
	
}//class
