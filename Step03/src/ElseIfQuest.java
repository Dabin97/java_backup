import java.util.Scanner;

public class ElseIfQuest {
	/*
	 * 점수 하나 입력 받아서 
	 * 100-90 A
	 * 89-80  B
	 * 79-70  C
	 * 69-60  D
	 * 59-0   F
	 * 성적등급을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 입력 : ");
		int n = sc.nextInt();
		
		if(n>=90) {
			System.out.println("A");
		}else if(n>=80) {
			System.out.println("B");
		}else if(n>=70) {
			System.out.println("C");
		}else if(n>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
