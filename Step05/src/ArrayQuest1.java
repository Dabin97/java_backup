import java.util.Scanner;

public class ArrayQuest1 {
	/*
	 * 	 정수형 배열 길이가 7인 배열을 생성한 뒤에
	 * 	 배열에 숫자를 전부 사용자로부터 입력을 받아서 저장한 후에
	 * 	 배열에 있는 모든 값을 출력
	 * 
	 * 예시)
	 * 0번째 숫자 입력 : 3
	 * 1번째 숫자 입력 : 4
	 * ...
	 * 6번째 숫자 입력 : 5
	 * 
	 * 3 4 ... 5
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+ "번째 숫자 입력 : " );
			int n =  sc.nextInt();
			arr[i] = n;				//arr[i] = sc.nextInt(); 도 가능
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		
	}

}
