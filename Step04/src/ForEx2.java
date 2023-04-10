import java.util.Scanner;
/*
 * 숫자 하나를 입력받은후
 * 입력한 숫자에 해당하는 구구단을 출력
 * 
 * 숫자 입력 : 2
 * 2 * 1 = 2
 * 2 * 2 = 4
 * ...
 * 2 * 9 = 18
 */
public class ForEx2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("단 입력 : ");
			int dan = sc.nextInt();
			
			for(int i=1;i<10;i++) { //괄호 안에 int i=1;로 초기화
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			//위에서 int i = 1;로 초기화해두었다면, for( ;i<10;i++)로 앞에 초기화부분은 비워두어도 된다. 
	}

}
