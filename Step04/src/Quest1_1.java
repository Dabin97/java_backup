import java.util.Scanner;

public class Quest1_1 {
	/*
	 * 숫자 두개를 입력받은 후
	 * 입력한 숫자들 중 작은 숫자부터 큰 숫자까지의 합을 출력
	 * 
	 * 숫자입력:1
	 * 숫자입력 : 100
	 * 합 : 5050
	 * 
	 * 숫자입력:100
	 * 숫자입력:1
	 * 합:5050
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		int total = 0;
		
		if(n1>n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}//if //n1=min, n2=max
		
		for(int i=n1;i<=n2;i++) {
			total+=i;
		}
		System.out.println(total);
		
	}//main

}
