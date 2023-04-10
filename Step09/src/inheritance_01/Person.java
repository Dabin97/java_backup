package inheritance_01;

public class Person extends Animal { // extends 상속받을 클래스 (Animal = 부모클래스)

	public Person() {
		System.out.println("Person 생성자");
	}

	public void printAge() {
		System.out.println("이 사람의 나이 : " + age);
		// 부모클래스의 private에는 접근할수없다.
		// 그러나 접근제어자 protected는 부모클래스의 하위 자식클래스에서 모두 접근할수있다.
	}

	// 오버라이딩(재정의) : 재구현(메서드명이 동일, 매개변수 동일, 접근제어자도 동일)(껍데기는 똑같다)
	//public void eat() { System.out.println("사람이 밥을 먹습니다."); }
	 
	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}

	public void run() {
		System.out.println("사람이 달립니다.");
	}
	
	
	
	
	
}


