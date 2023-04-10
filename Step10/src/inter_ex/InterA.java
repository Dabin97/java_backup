package inter_ex;

public interface InterA {
	//public static final은 자동으로 붙음(안써도)- 전역상수
	public static final double PI = 3.1415;
	//public abstract도 자동으로 붙음 - 추상메소드
	public abstract void interA();
	
//	//default method ---> jdk8 부터 지원 /안쓴다
//	default double circleArea(int r) {
//		return r * r * PI;
//	}
	
} //인터페이스 : 직접적인 메모리가 할당되지 않는 것들로 구성
