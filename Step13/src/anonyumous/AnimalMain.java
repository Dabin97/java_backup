package anonyumous;

public class AnimalMain {
	public static void eat(Animal animal) {
		animal.eat();
	}
	public static void main(String[] args) {
		Animal animal = new Animal() { //추상메소드 간단 오버라이딩 anonyumous
			
			@Override 
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};
		animal.eat();
		
		Animal human = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다.");				
			}
		};
		human.eat();
		eat(animal);
		eat(human);
		eat(new Animal() { //이런식으로도 괄호안에 써서 사용가능하다.
			
			@Override
			public void eat() {
				System.out.println("누가 밥을 먹습니다.");				
			}
		});
		
		
		//파일을 따로 만들 필요없고 여기에서만 오버라이딩해서 사용
		//너무 쪼개도 파일 관리하기 어려우므로 간단하게 이런식으로 오버라이딩해서 사용한다. 복잡한것은 클래스로 쪼갠다.
		// new 하고 추상메소드 클래스명을 자동완성시키면 알아서 메모리가 할당된다.
		
	}//main

}
