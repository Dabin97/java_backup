import java.util.Scanner;

public class Quest_1 {
/*
 * 1. 숫자 3개를 입력 받은 후 가장 작은 값을 출력하시오.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n3 = sc.nextInt();
		
		int m = 0;
		
		if(n1<n2) {
			m = n1;
		}else {
			m = n2;
		}
		if(m>n3) {
			m = n3;
		}
		
		
		System.out.println("가장 작은 값 : "+ m);
	}

}
