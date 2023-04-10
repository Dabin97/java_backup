import java.util.Scanner;

public class Quest8_1 {
	/*
	 * 숫자 하나를 입력 받은 후 
	 * 입력 받은 숫자의 팩토리얼 결과값을 출력
	 * 
	 * 팩토리얼 : 1~해당숫자까지의 곱한 결과값
	 * 
	 * 예)
	 * 숫자 입력 : 5
	 * 1~5까지 곱한 결과 : 120
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		int total = 1;
		
		while(n>0) { //(n>1)가능
			total *= n;
			n--;
		}
		System.out.println("결과 : "+ total);

	}

}
