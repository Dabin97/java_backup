import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//내 답안
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력 : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i=1;i<n;i++) {
//			if(n%i==0) 
//				sum += i; 
//			}
//			
//		if(sum==n) {
//			System.out.println(n + "은 완전수 입니다.");
//		}else {
//			System.out.println(n + "은 완전수가 아닙니다. ");
//		}
//		
		//모범 답안
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		if(sum==n) {
			System.out.println("입력하신 숫자는 완전수 입니다.");
		}else {
			System.out.println("입력하신 숫자는 완전수가 아닙니다.");
		}
		
		
	}//main

}
