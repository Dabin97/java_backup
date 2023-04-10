import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx7 {
	/*
	 * 최초의 정수형 배열은 길이가 5인 배열을 생성
	 * 
	 * 배열의 숫자를 순서대로 입력해나가면서 -1을 입력할때까지 계속해서 배열에 숫자를 입력. 단, 배열의 내용이 전부 채워지면 그때마다 배열의
	 * 길이를 3씩 늘림
	 * 
	 * 배열에 숫자 입력이 끝나면 입력된 내용을 전부 출력 배열에 입력된 숫자들의 평균을 출력 단, 마지막에 입력된 -1은 제외하고 평균 구하기
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0, count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) { //i==4 , 길이가 5가 되기전에 늘리기?
				int[] temp = new int[arr.length + 3];
			
			for (int j = 0; j < temp.length && j < arr.length; j++) {
				temp[j] = arr[j];
				}
			arr = temp;
			} //if, temp로 복사
			
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			if(n == -1) 
				break;
			arr[i] = n;
			count++;
			sum += arr[i];
		} // for

		System.out.println(Arrays.toString(arr));
		System.out.println("평균 : " + sum/(count));

	}// main

}
