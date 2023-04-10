import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuest2_1 {
	/*
	 * 정수형 배열 길이가 10개인 배열을 생성한 후 정수를 입력받아서 배열에 각 요소에 전부 입력을 한 후 배열에 있는 값들 중 제일 큰값,
	 * 제일 작은값을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		} // arr.length까지 숫자입력받기

		int max = arr[0], min = arr[0]; 
		//전역변수로 꺼내놓는다.애초에 max도 min도 arr안에 있는것이므로 아예 0번째 인덱스로 설정한다. 
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max)
				max = arr[j];
			if (arr[j] < min)
				min = arr[j];
		}//max와 min을 구분하는 2번째 for문

		System.out.println(Arrays.toString(arr));
		System.out.println("max : " + max + ", " + "min : " + min);

	}// main

}
