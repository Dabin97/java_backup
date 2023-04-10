import java.util.Scanner;

public class Quest_2 {
/*
*	2. 월 정보를 입력하면 월에 해당하는 계절을 출력하시오.
	3~5 : 봄
	6~8 : 여름
	9~11 : 가을
	12, 1, 2 : 겨울
	나머지 다른 숫자 : 잘못된 데이터 입니다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월 중 월을 입력 : ");
		int a = sc.nextInt();
		
		switch (a) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못된 데이터 입니다.");
			
		}
		
	}

}
