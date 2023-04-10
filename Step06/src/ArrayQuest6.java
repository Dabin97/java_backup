import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuest6 {
	/*
	 * 정수형 배열 길이가 10인 배열을 생성한 뒤
	 * 입력한 숫자가 짝수면 맨뒤에서부터 채우기
	 * 입력한 숫자가 홀수면 맨앞에서부터 채우기
	 * 입력이 끝나면 전체 내용을 출력
	 * 
	 * 숫자 입력 : 1
	 * [1,0,0,0,0,0,0,0,0,0]
	 * 
	 * 숫자 입력 : 4
	 * [1,0,0,0,0,0,0,0,0,4]
	 * 
	 * 숫자 입력 : 3
	 * [1,3,0,0,0,0,0,0,0,4]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 배열 10 생성
		int[] arr = new int[10];
		int s=0,e=arr.length-1;    //e는 arr의 끝 arr.length-1
		//왼쪽 오른쪽부터 시작할 인덱스 선언
		while(s <= e) {
			System.out.print("숫자 입력 : ");
			int n= sc.nextInt();
			
			if(n%2==0) {
				arr[e--] = n; //입력을 하고 --하여 9->8,8->7 ...1개씩 감소 
			}else{
				arr[s++] = n;
			}
			//s<=e가 거짓이 되는 순간 크로스한다. 그럼 멈춘다. 
		}
		System.out.println(Arrays.toString(arr));
		
		//지금까지 한 배열이 '1차원 배열'이다. 
		
	}//main

}
