import java.util.Scanner;

public class Test2 {
//숫자 두개를 입력 받은 후 두 숫자의 최대 공약수를 출력하시오.
	public static void main(String[] args) {
		//내 답안
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.print("숫자 입력 : ");
//		int n2 = sc.nextInt();
//		int min =0, max=0;
//		int temp = 0;
//		
//		for(int i = 1; i <= n1; i++) {
//			if(n1%i==0 && n2%i==0) {
//				temp = i;
//				if(temp < i) 
//					max = temp;
//				if(temp > i)
//					min = temp;
//			}//if
//		} //for
//		System.out.print(temp);
		
		 //모범 답안
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		int gcm = 1;
		
		if(n1>n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}				//n1에 무조건 작은값 넣기
		
		for(int i=2;i<=n1;i++) { //1은 이미 공약수라 미리 들어가있어서 2부터 나눈것
			if(n1 % i == 0 && n2 % i == 0) 
				gcm = i;
		}
		System.out.println("두 수의 최대 공약수 : " + gcm);
		
		
	}//main

}
