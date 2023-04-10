package exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5/0); 
			System.out.println(2);
			
		}catch (ArithmeticException e) { 
			System.out.println(3);	
		}finally { //Exception이 발생하든 안하든 반드시 실행하는 영역 - 마지막 뒷처리하는 영역
			System.out.println(4);
		}
		System.out.println(5);	
		
//		try - catch - finally 구조를 '트랜잭션(transaction)'이라고 한다.
		
		
		
	}//main

}
