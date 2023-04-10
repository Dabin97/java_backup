package has_a_1;

public class TestMain {

	public static void main(String[] args) {
		Police police = new Police();
		police.shot();
		police.shot();
		police.shot();
		police.shot();
		police.shot();
		
		//총이 바뀌면 총 소스코드를 고쳐야한다. 부모 클래스는 하나만 만들수있다. 확장성이 떨어진다.
		//객체 안에 객체 선언(캡슐화), 객체를 구성요소끼리 묶어두면 객체를 손쉽게 바꿀수있다. 
		
		
		
		
	}//main

}
