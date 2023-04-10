import java.util.Scanner;

public class Quest2 {
	/*
	 * 숫자 0을 입력할때까지
	 * 정수를 입력 받아서
	 * 0을 입력하면 입력한 숫자들의 총합과 평균을 출력
	 * 
	 * 숫자 입력 : 1
	 * 숫자 입력 : 5
	 * 숫자 입력 : -1
	 * 숫자 입력 : 2
	 * 숫자 입력 : 0
	 * 
	 * 총합 : 7
	 * 평균 : 1.75
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, i=0;//count역할
		
		for(int n=-1;n!=0;i++) {
			System.out.print("숫자 입력 : ");
			n = sc.nextInt();
			sum += n;
		}
		
		System.out.println("총합 : "+sum+" ,평균 : "+(sum/(i-1))); 
		
//		//선생님 답안
//		int total = 0, count =0;
//		Scanner sc = new Scanner(System.in);
//		
//		for(int n=-1; n!=0; count++) { //위에 n을 초기화하지않고 정수만 받으므로 int n = -1;선언
//			System.out.print("숫자 입력 : ");
//			n = sc.nextInt();
//			total += n;
//		}
//		System.out.println(total);
//		System.out.println(total/(count-1));//count-1 0을 포함했기때문에 -1해준다.
//	}

	}
}
