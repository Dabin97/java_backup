package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			//작업이 시작되는 영역
			System.out.println(1);
			System.out.println(5/0); //실행중간에 터져서 이 아래 2가 출력되지않음
			System.out.println(2);
		}catch (ArithmeticException e) { //catch는 항상 try아래에 붙는다. 해당 Exception이름은 실행했을때 콘솔창에서 나오는 런타임에러를 참고에서 입력한다.
			//Exception이 발생했을때 처리하는 영역
			System.out.println(3);	//에러가 나면 3을 출력한다. 
		}
		System.out.println(4);		
		
		
		
		}//main

}
