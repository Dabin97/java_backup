import java.util.Arrays;

public class RaggedArrayEx {

	public static void main(String[] args) {
		int[][] arr = new int[3][]; //각 행마다 알아서 1차원배열을 만들어서 넣어라, 3줄짜리라는것만 알려줌
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[] {1,2,4,56,76,2,1};
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println("----------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//래기드 배열 : 유동적으로 데이터를 넣을 수 있도록 메모리 낭비를 줄이는 방법. 쓸일은 없다.
		
	}//main

}
