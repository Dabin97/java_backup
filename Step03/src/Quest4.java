import java.util.Scanner;

public class Quest4 {
	/*
	 * 점수를 하나 입력받아서 
	 * 100-95 A+ 
	 * 94-90  A
	 * 89-85  B+ 
	 * 84-80  B 
	 * 79-75  C+ 
	 * 74-70  C 
	 * 69-65  D+
	 * 64-60  D 
	 * 59-0   F 
	 * 성적 등급을 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int s = sc.nextInt();

		switch (s/5) {
		case 20:case 19:
			System.out.print("A+");
			break;
		case 18:
			System.out.print("A");
			break;
		case 17:
			System.out.print("B+");
			break;
		case 16:
			System.out.print("B");
			break;
		case 15:
			System.out.print("C+");
			break;
		case 14:
			System.out.print("C");
			break;
		case 13:
			System.out.print("D+");
			break;
		case 12:
			System.out.print("D");
			break;
		default:
			System.out.print("F");
		}
	}

}
