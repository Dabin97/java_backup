import java.util.Scanner;

public class Quest04 {
/*
 * 정수 하나를 입력받아서
 * 입력한 정수가 짝수인지 홀수인지 출력
 * 단, 0은 짝수로 가정해서 출력
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력 : ");
		int n = sc.nextInt();
		String result = (n%2) == 0 ?  "짝수입니다." : "홀수입니다."; //String
//		String result = (n%2) == 1 ?  "홀수입니다." : "짝수입니다."; 
		
		System.out.println(result);
//		System.out.println(n%2 == 0 ?  "짝수입니다." : "홀수입니다."); 이것도 가능
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력 : ");
//		int n = sc.nextInt();
//		if(n%2==0) {
//			System.out.print("짝");
//		}else {
//			System.out.println("홀");
//		}
//		
		
	}//main

}
