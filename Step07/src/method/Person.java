package method;

public class Person {
	//이름
	String name;
	//나이
	int age;
	//성별
	boolean gender;
	
	//받을 데이터들을 담을 매개변수를 3개 설정한다. n a g
	void init(String n, int a, boolean g){  //init :처음 세팅 초기화해주는 메서드 명칭
		name = n;
		age = a;
		gender= g;
	}

	
	//인적정보 출력하는 기능(메서드)
	void printPersonInfo(){
		System.out.println(name + " " + age + " " + (gender ? "남자" : "여자"));
	}
	//printPersonInfo(매개변수), 매개변수를 받아야 작동할수있는 함수면 , 일을 할때 매개변수 데이터를 다 넣어야
	//실행이 가능하다. 
	
	
}//class
