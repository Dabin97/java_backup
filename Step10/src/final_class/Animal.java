package final_class;

//final class는 부모 클래스가 될 수 없음
public final class Animal { 
	private int age;

	public Animal(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + "]";
	}
	
	
}//class
