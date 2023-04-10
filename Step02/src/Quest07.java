import java.util.Scanner;

public class Quest07 {
/*
 * 2. 정수하나(10이상의 숫자)를 입력하여 마지막 자리수를 제외한 결과와 마지막 자리수를 출력하시오.
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("10이상의 숫자를 입력 : ");
		int n = sc.nextInt();
		
		System.out.println(n/10);
		System.out.println(n%10);
		
	}

}
