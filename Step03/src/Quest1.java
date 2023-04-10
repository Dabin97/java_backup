import java.util.Scanner;

public class Quest1 {
/*
 * 숫자를 두개 입력하여
 * 두 숫자의 뺼셈결과를
 * 무조건 양수로 되게끔 출력
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 숫자를 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("2. 숫자를 입력 : ");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1-n2);
		}else {
			System.out.println(n2-n1);
		}
		// 코드가 한 줄이면 {중괄호}를 안써도 된다. if후 다음 세미콜론까지가 if문 영역으로 잡는다. 
		
		//case 2
		int result = n1-n2;
		if(result < 0) {
			result = -result;
			System.out.println(result);
		}
	}
	

}
