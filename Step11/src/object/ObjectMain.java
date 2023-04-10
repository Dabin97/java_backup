package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1 == p2); //false 메모리주소 비교라서
		System.out.println(p1.equals(p2)); //true - equals함수 만들었다.
		
		Dog d1 = new Dog("비숑", 21);
		Dog d2 = new Dog("믹스", 32);
		Dog d3 = new Dog("비숑", 32);
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d1.equals(d2)); //false
		System.out.println(d1.equals(d3)); //false
		
	}

}
