import java.util.Scanner;

public class Quest08 {
/*
 * 3. 사용자로부터 나이를 입력 받아서 나이가 20세 이상이면 성인, 20미만이면 미성년자라고 출력하시오.
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력 : ");
		int n = sc.nextInt();
		System.out.println(n >= 20 ? "성인" : "미성년자");
	}

}
