import java.util.Scanner;
/*
 * 0이 나올떄까지 숫자를 입력받고
 * 0이 나오면 멈추고 모든 값을 합함.
 */
public class BreakEX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {  //true니까 무조건 돌림. 
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if(num==0) 
				break;
				
			sum += num;
			
		}
		System.out.println(sum);	
	}

}
