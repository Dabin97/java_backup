package constructor;

public class ClassArrayTest {

	public static void main(String[] args) {
		
		//레퍼런스형 변수 타입은 배열 생성시 객체 생성이 아니라 저장할 수 있는 공간만 만든다. 
		Person[] arr = new Person[10]; 
		Student[] std = new Student[10]; //객체 10개 생성, 이러고 끝나면 생성자를 호출할 방법이 없다. 
		System.out.println(arr[0]); //메모리주소 출력, 결과값 : null
		System.out.println(std[0]); 
		
		System.out.println("프로그램 종료");
		
		//클래스들을 배열로 선언하면, 10개 저장할수있는 메모리 공간만 만들어둔것이다.
		//나중에 new 해서 하나씩 등록하는 방법으로 사용해야한다. 
		
		
		
		
	}//main

}
