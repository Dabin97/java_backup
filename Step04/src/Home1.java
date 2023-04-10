import java.util.Scanner;

public class Home1 {
/*
 *     초(seconde)를 입력하세요 >>> 3679
    	변환 결과는 1시간 1분 19초 입니다.
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초(seconde)를 입력하세요 : ");
		int seconde = sc.nextInt();
		int hour = seconde / 3600;
		seconde %= 3600;
		int minute = seconde/60;
		seconde %= 60;
		
		System.out.println("변환 결과는 " + hour + "시간 " + minute + "분 " + seconde + "초 입니다.");
		
		
	}

}
