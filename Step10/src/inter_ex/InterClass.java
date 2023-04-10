package inter_ex;

public class InterClass implements InterA, InterB{ //인터페이스 상속 키워드 implements (클래스먼저 상속받고 extends ,인터페이스 상속받는 순서 implements)
	//implements InterB만 있어도 작동한다. public interface InterB extends InterA했기때문
	
	@Override
	public void interA() {
		System.out.println("interA");
	}

	@Override
	public void interB() {
		System.out.println("interB");
		
	}
	
}
