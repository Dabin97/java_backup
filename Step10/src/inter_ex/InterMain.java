package inter_ex;

public class InterMain {

	public static void main(String[] args) {
		InterClass interclass = new InterClass();
		interclass.interA();
		
//		System.out.println(interclass.circleArea(10));//안쓴다
		
		InterA interA = interclass; //인터페이스도 변수 타입으로 선언이 가능, 단 직접적인 생성 X / 나중에 인터페이스를 필드로 사용가능하다.
		//작은개념->큰개념 업캐스팅(자동)
		interA.interA();
	}

}
