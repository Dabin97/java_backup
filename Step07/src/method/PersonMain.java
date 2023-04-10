package method;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		
		p1.printPersonInfo(); //데이터 클래스에서 만든 메서드를 가져오는 방법
		
		//Person 하나 더 생성해서 정보 출력
		Person p2 = new Person();
		p2.name = "김철수";
		p2.age = 22;
		p2.gender = false;
		
		p2.printPersonInfo();
		
		//init메서드를 이용한 출력
		Person p3 = new Person();
		p3.init("이영희", 50, false);
		p3.printPersonInfo();
		
		
	}//main

}
