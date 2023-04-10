import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n1 = sc.nextInt();
		Random r = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		
		for (int i = 0; i < n1; i++) {
			System.out.print((r.nextInt(100)+1) + " ");
			arr.add(r.nextInt(100)+1);
		}
		
		System.out.println( );
		
		
		System.out.print("찾으려는 정수 입력 : ");
		int n2 = sc.nextInt();
		int count = 0;
		
		while(true) {
			if (arr.equals(n2)) 
				count++;
		}
		
//		System.out.println(count);
	}//main

}
