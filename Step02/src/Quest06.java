import java.util.Scanner;

public class Quest06 {
/*
 * 1. 정수형 변수 3개를 선언하여 숫자를 입력 받은 뒤 해당 변수들의 합과 평균을 출력하시오
단 평균은 소수점까지 출력하시오.
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력 : ");
		int n2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력 : ");
		int n3 = sc.nextInt();
		int result1 = n1 + n2 + n3;
		double result2 = result1 / 3.0;
		
		System.out.println("합 : " + result1);
		System.out.print("평균 : " + result2);
	}

}
