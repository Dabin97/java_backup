import java.util.Scanner;

public class Quest1 {
/*
 * 숫자 두개를 입력받은 후
 * 입력한 숫자들 중 작은 숫자부터 큰 숫자까지의 합을 출력
 * 
 * 숫자입력:1
 * 숫자입력 : 100
 * 합 : 5050
 * 
 * 숫자입력:100
 * 숫자입력:1
 * 합:5050
 */
	public static void main(String[] args) {
//		내 답안
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.print("숫자 입력 : ");
//		int n2 = sc.nextInt();
//		
//		int max = 0;
//		int min = 0;
//		int i = 0;
//		
//		if(n1>n2) {
//			min = n2;
//			max = n1;
//		}else {
//			min = n1;
//			max = n2;
//		}
//		
//		for(;min<=max;min++) {
//			i += min;
//		}
//		System.out.println(i);
//	}

		
	//선생님 예제
		int n1 = 0, n2=0, total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		
		if(n1>n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp; //데이터 이동, n1과 n2의 값을 서로 뒤바꿈. 중간에 브로커를 둔 형태.
		}//n1에는 min값, 즉 max와 min 위치를 고정하는 방법
		
		for(int i=n1;i<=n2;i++)
			total += i;
		
		System.out.println(total);
	}
}
