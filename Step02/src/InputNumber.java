import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력받는 코드를 쓸때 먼저 써놓기, 여러개입력받을때도 1개만 쓰기
		
		System.out.print("숫자 하나 입력 >>> ");
		int n = sc.nextInt(); //scanner에서 입력받을 애들은 next라고 한다. 여러개 입력은 이 코드를 여러개 쓰기
		System.out.println("입력받은 숫자 : "+n);
		
	}

}
