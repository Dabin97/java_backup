import java.util.Scanner;

public class Quest3 {
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
		System.out.print("점수 입력 : ");
		int s = sc.nextInt();
		
		switch (s/10) {
		case 10 :
			System.out.println("A");
			break;					//case 10 : case 9 같은 결과값이 나오므로 붙여도 된다.
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		//if문은 최대값 또는 최소값이 맨 위로 올라갔는데, switch문은 순서 상관없다. 
	}

}
