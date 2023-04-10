package constructor;

public class Person extends Animal{
	
	private String name;

	//자식 생성자가 부모 생성자의 필요한 값을 받아서
	//부모 생성자에게 전달함 --> super(값....); : 부모 생성자를 호출하는 부분
	//자식 생성자에서 제일 먼저 실행해야되는 것이 부모 생성자 호출하는 부분
	public Person(int age, String name) {
		super(age); //Animal 생성자 호출하는 부분
		System.out.println("Person(int,String)");
		this.name = name;
	}
	
	public void printPersonInfo() {
		System.out.println(name + " " + age);
	}

	//부모클래스의 기본생성자가 없고, age만 받는 생성자만 있음. 부모클래스 생성자가 있어야 자식클래스를 만들수있는데
	//들어오는 값이 없으므로, 자식클래스에서 부모클래스로 값을 넣어준다.
	//그 키워드가 super(age);이다. 
	//부모클래스 부르기, 맨위에 있어야 한다. 그 위에 다른 코드가 들어가면 안된다. 
}
