import java.util.Scanner;

public class Quest2_1 {
	/*
	 * 숫자 0을 입력할때까지
	 * 정수를 입력 받아서
	 * 0을 입력하면 입력한 숫자들의 총합과 평균을 출력
	 * 
	 * 숫자 입력 : 1
	 * 숫자 입력 : 5
	 * 숫자 입력 : -1
	 * 숫자 입력 : 2
	 * 숫자 입력 : 0
	 * 
	 * 총합 : 7
	 * 평균 : 1.75
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0,sum = 0;
		for(int n=-1;n!=0;i++) {
			System.out.print("숫자 입력 : ");
			n = sc.nextInt();
			sum += n;
		}
		System.out.println(sum);
		System.out.println(sum/(i-1));
		//(i-1) i를 처음에 0으로 초기화해서 0까지 카운트됌 그래서 -1해주기.
		
		
	}//main

}
