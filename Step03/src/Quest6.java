import java.util.Scanner;

public class Quest6 {
	/*
	 * 숫자 하나를 입력받은후
	 * 입력한 숫자에 해당하는 구구단을 출력
	 * 
	 * 숫자 입력 : 2
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * ...
	 * 2 * 9 = 18
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		int i = 0;
		
		while(i < 9) {
			i++;
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
		
		/*
		 * int i = 1;
		 * dan = 0;
		 * dan = sc.nextInt();
		 * 
		 * int i =1; while(i<10)
		 * 위에는 i++;가 syso보다 먼저 시행됐기때문에 가능했던것. 
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 입력 : ");
//		int dan = sc.nextInt();
//		
//		for(int i=1;i<10;i++) {
//			System.out.println(dan + "*" + i + "=" + dan*i);
//		}
//		
		
	}//main

}
