import java.util.Scanner;

public class ArrayQuest3 {
	/*
	 * 정수형 배열 길이가 10인 배열을 선언할때
	 * 원하는 값으로 초기화를 한 후에
	 * 배열에 있는 값들 중 짝수와 홀수의 개수를 출력
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int c1=0, c2=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				c1++;
			}else if(arr[i]%2==1) {  //else{c2++;} 해도 된다.
				c2++;
			}
		}//for
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}//for
		
		System.out.println();
		System.out.println("짝수 " + c1 + "개");
		System.out.println("홀수 " + c2 + "개");
		
	}//main

}
