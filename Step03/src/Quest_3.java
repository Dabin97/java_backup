import java.util.Scanner;

public class Quest_3 {
/*
 * 3. 숫자 두개를 입력 받아서 작은수부터 큰수까지의 합을 출력하시오.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		int i = 0;
		
		if(n1>n2) {
			min = n2;
			max = n1;
		}else {
			min = n1;
			max = n2;
		}
			
		while(min<=max) {
			i += min;
			min++;
		}
		System.out.println(i);
	}

}
