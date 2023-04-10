import java.util.Scanner;

public class Quest03 {
/*
 * 삼각형 밑변과 높이를 입력받아서
 * 삼각형의 넓이를 구하는 프로그램을 작성
 * 단, 넓이는 소수점까지 표시
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼각형의 밑변 입력 : ");
		double a = sc.nextDouble();		
		System.out.print("삼각형의 높이 입력 : ");
		double b = sc.nextDouble();
		double result = a*b*0.5; // a*b/2.0 도 가능
		
		System.out.print("삼각형의 넓이 :" + result);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("삼각형의 밑변 : ");
//		int a = sc.nextInt();
//		System.out.print("삼각형의 높이 : ");
//		int b = sc.nextInt();
//		double result = a * b/2.0;
//		
//		System.out.print("넓이 : " + result);
		
		
	}//main

}
