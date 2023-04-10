package obj;

import java.io.Serializable;

public class Person implements Serializable{ 
	//implements Serializable하면 Person에 노란줄이 그임, 거기에 퀵픽스를 하면 시리얼 아이디를 보여주는 코드가 나옴. 구분하는 용도
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}//class
