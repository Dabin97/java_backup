import java.util.Scanner;

public class Quest05 {
/*
 * 정수 두개를 입력받아서 
 * 두숫자의 뺄셈 결과를 출력
 * 단, 뺄셈 결과가 무조건 양수가 나오게끔 처리
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자를 입력 : ");
		int n2 = sc.nextInt();
		int result = n1 - n2 > 0 ? n1-n2 : -(n1-n2);
//		int result = n1 > n2 ? n1-n2 : n2-n1; 다른 형식
//		-1 * result == -result
		
		System.out.println(result);
//		System.out.println(n1 > n2 ? n1-n2 : n2-n1); syso에 바로 삼항연산자를 붙여도 된다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.print("숫자를 입력 : ");
//		int n2 = sc.nextInt();
//		
//		int result = n1 > n2 ? n1-n2 : n2-n1;
//		System.out.println(result); syso에 바로 삼항연산자를 붙여도 된다.
		
		
		
		
	}//main

}
