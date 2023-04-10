package exception;

import java.util.Scanner;

public class ExceptionEx4 {
	public static int div(int n1, int n2) throws ArithmeticException { // throws 일어날오류이름
		return n1 / n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		try {
			System.out.println(div(n1, n2));
			
		} catch (ArithmeticException e) {
			e.printStackTrace(); //어느 과정에서 오류가 났는지 빨간 글씨로 알려줌.
		}

		System.out.println("프로그램 종료");

/*
* 
* Exception in thread "main" java.lang.ArithmeticException: / by zero at
* exception.ExceptionEx4.div(ExceptionEx4.java:7) at ,<-- 처음 에러가 일어난곳
* exception.ExceptionEx4.main(ExceptionEx4.java:16)   <-- 실행한곳
*/

	}// main

}
