package instance_of;

public class Dog extends Animal{ //Animal <- Dog

	@Override
	public void eat() {
		System.out.println("강아지가 사료를 먹습니다.");
	}
	
	public void run() {
		System.out.println("강아지가 달립니다.");
	}
	
}
