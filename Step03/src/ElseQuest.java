import java.util.Scanner;

public class ElseQuest {
/*
 * 사용자로부터 나이를 입력받아서
 * 입력받은 나이가 20세 이상이면 성인 이라고 출력
 * 입력받은 나이가 20세 미만이면 미성년자라고 출력
 * if -else를 이용
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력 : ");
		int n = sc.nextInt();
		
		if(n>=20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
	}

}
