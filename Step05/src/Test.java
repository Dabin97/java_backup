import java.util.Scanner;

public class Test {
/*
 * 숫자 5개를 입력받아서 입력한 숫자들의 총합,최대값,최소값을 출력하세요
	9시부터 작업 시작하세요
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, min=2147483647, max=-2147483648; 
		//min과 max를 값을 바꾸어넣는다. min에는 int의 최대값(2의31승)-1, max에는 -2의31승
		//int max = Integer.MIN_VALUE;
		//int min = Integer.MAX_VALUE; 이런식으로 내부함수를 사용하여 최대값 최소값을 초기화할수있다.
		
		for(int i=0;i<5;i++) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			
/*		//다른 식
 * 			if(i == 0) {
 * 				max = min = total = n;
 * 				continue;				
 * 				}
 */
			if(max < n) 
				max = n;
			if(min > n)
				min = n;
			sum += n;
		}
		
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		System.out.println("총합 : "+sum);
		
		
		
		/* while을 이용한 식
		 * 
		 * int count = 0;
		 * while(count <  5) {
			int num = sc.nextInt();
			
			if(num > max) max = num;
			else if(num < min) min = num;
			
			sum += num;
			count++;
		}
		 */
	}

}
