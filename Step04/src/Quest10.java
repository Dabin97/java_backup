import java.util.Scanner;

public class Quest10 {
	/*
	 * 숫자하나를 입력을 받은 후에 입력 숫자를 2진수로 바꾸어서 출력. 
	 * 실행 예시> 
	 * 숫자 입력 : 13 
	 * 이진수로 변환 결과 : 1101 
	 * ※ 단, 숫자가 적어서 4자리가 안되는 경우에는 나온거 만큼 출력 2 ---> 10
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		String str = "";
		
		 while(n>0) { 
			if(n%2==0) { 
				str="0"+str; //str += "0"을 해버리면 str에 값이 덮여져버린다. +str은 옆에 붙이는것.
			}else{ //n%2==1
				str="1"+str;}
			n /= 2;
		 }
		 System.out.println(str);
		
	}

}
