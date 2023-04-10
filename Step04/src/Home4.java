import java.util.Scanner;

public class Home4 {
/*
 * 입력받은 숫자가 완전수인지 판별하는 것 출력, 
 * 완전수는 '자신을 제외한' 약수들의 합이 자신과 같은 숫자를 의미한다. 
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		//주의할점, 아래 i<n이어야한다. 자기 자신은 빼야하기 때문에
		for(int i=1;i<n;i++) {//지정한 숫자까지 모든 숫자를 반복검사
			if(n%i==0) 
				sum += i; //약수를 sum에 모두 더하기
			}
			
		if(sum==n) {
			System.out.println(n + "은 완전수 입니다.");
		}else {
			System.out.println(n + "은 완전수가 아닙니다. ");
		}
		
		
	}

}
