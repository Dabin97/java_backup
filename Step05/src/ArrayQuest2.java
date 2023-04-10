import java.util.Scanner;

public class ArrayQuest2 {
	/*
	 * 정수형 배열 길이가 10개인 배열을 생성한 후
	 * 정수를 입력받아서 배열에 각 요소에 전부 입력을 한 후
	 * 배열에 있는 값들 중 제일 큰값, 제일 작은값을 출력
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int min = 2147483647, max = -2147483648;
		//데이터 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
			
			if(max < arr[i]) 
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		/*
		 * case 2
		 for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		max = arr1[0]; //아예 max,min을 배열의 첫번째값으로 설정
		min = arr1[0]; // 어차피 배열에 있는 값중에 하나이기때문
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] > max) max = arr1[i];
			if(arr1[i] < min) min = arr1[i];
		}
		 */
		
		
	}

}
