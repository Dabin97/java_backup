import java.util.Scanner;

public class Quest6 {
	/*
	 * 영화 평점을 1~5까지의 정수를 받은 후 입력 받은 평점 만큼 ★을 출력하시오 평점 및 별 출력 후 프로그램이 종료
	 * 
	 * 이번 영화의 평점을 입력 하세요 : 3 평점 : ★★★
	 * 
	 * 이번 영화의 평점을 입력 하세요 : 6 평점은 1~5 사이만 입력할 수 있습니다. 이번 영화의 평점을 입력 하세요 : 3 평점 : ★★★
	 */
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이번 영화의 평점을 입력 하세요 : ");
//		int s = sc.nextInt();
//		
//		switch (s) {
//		case 1:
//			System.out.print("평점 : ★");
//			break;
//		case 2:
//			System.out.print("평점 : ★★");
//			break;
//		case 3:
//			System.out.print("평점 : ★★★");
//			break;
//		case 4:
//			System.out.print("평점 : ★★★★");
//			break;
//		case 5:
//			System.out.print("평점 : ★★★★★");
//			break;
//		default:
//			System.out.print("평점은 1~5 사이만 입력할 수 있습니다.");
//			
//		}

		Scanner sc = new Scanner(System.in);

		while (true) { //1-5까지의 정수가 나올때까지 돈다. 
			System.out.print("이번 영화의 평점을 입력하세요 : ");
			int star = sc.nextInt();

			if (star > 5 || star < 1) {
				System.out.println("평점은 1~5 사이만 입력할 수 있습니다.");
				continue;
			}//if문 닫음

			String result = "";

			for (int i = 0; i < star; i++) //for문 ,i가 별점의 점수가 될때까지 i++(i=0이기때문에)
				result += "★";

			System.out.println("평점 : " + result);

			break;
		} //while문 닫음

	}
}
