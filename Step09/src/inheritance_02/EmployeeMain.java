package inheritance_02;

public class EmployeeMain {
	//Employee는 SalaryEmployee, DispatchEmployee까지 올 수 있다.(자식클래스라서)
	//자식 클래스는 부모 클래스로 형변환이 가능
	public static void work(Employee e) {
		e.work();				//하나의 메소드로 여러가지 일을 할 수 있다. = <다형성>
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		SalaryEmployee e2 = new SalaryEmployee();
		DispatchEmployee e3 = new DispatchEmployee();
		
		
		work(e1); //부모클래스로 만든 함수로 자식클래스 사용가능.
		work(e2);
		work(e3);
		
		
//		Employee t = e2; //샐러리가 실행된다.
//		t.work();
//		t = e3;
//		t.work(); //디스패치가 실행된다. 
		//형변환을 통해 부모함수가 실행될줄 알았지만, 자식함수가 실행됨.
		//이유는 함수내용이 아니라 메모리주소를 저장하기때문에, 자식변수부터 찾아보기때문에 자식함수가 실행이 된다. 
		//메모리 주소를 기반으로 메소드를 실행함. 
		
		
		//class 사용자정의자료형 = 변수타입, Employee SalaryEmployee DispatchEmployee 모두 변수타입
		//따라서 형변환이 가능하다. 자식클래스는 부모와 자식 영역을 모두 가지고 있는데, 각각 따로 영역을 가지고있는 형태이다.
		// 그러므로 자식클래스는 자동형변환의 법칙에 따라 작은 개념에서 큰개념으로 형변환 가능하다.
		//여기서 큰 개념 = 부모클래스, 작은 개념 = 자식클래스
		//즉, 자식 클래스는 부모클래스로 형변환이 가능하다. 
		// 그러나, 자식클래스->부모클래스 형변환할때, 자식클래스에만 있는 함수는 형변환할 수 없다. 
	}

}
