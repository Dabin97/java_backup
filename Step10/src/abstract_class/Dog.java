package abstract_class;

public class Dog extends Animal{

	public Dog() {
		System.out.println("Dog Construnctor");
	}


	@Override
	public void run() {
		System.out.println("개가 달립니다.");
	}
	//new class를 만들었을때 클래스명에 에러가 뜬다면, 퀵픽스를 통해 안들어간 오버라이딩을 추가할수있다.
	
	
}
