package inheritance_01;

public class AnimalMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.run(); //Person에서 만든 메서드 
		p.eat(); //Animal에서 만든 메서드
		
		//Person이 Animal이 가지고 있는 기능을 모두 가져다가 쓴다. 
		//Animal 생성자 --> Person 생성자 순서로 실행된다. 부모->자식 순서로 실행된다. 
		//Person이 만들어지려면 Animal이 먼저 만들어져야한다. Person혼자 만들어지지않는다. 
		
		//오버로딩 : 중복정의(여러개만들기) / 오버라이딩 : 재정의(다시만들기)
		//오버라이딩 - 원본은 망치지않고 그저 똑같은 메소드(재정의된)를 만든다.
		//함수명이 같으면 지역변수부터 읽어들인다. 그러므로 자식클래스 메소드부터 실행된다. 
		
		
	}

}
