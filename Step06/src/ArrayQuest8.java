import java.util.Arrays;

public class ArrayQuest8 {

	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		
		for (int i=0; i < arr.length; i++) {
			for(int j=0;j<=i;j++) { 
				arr[i][j]=i%2==0 ? '*':'-';
			}
		}
		
		for (int i=0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++) { 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * 	for (int i=0; i < arr.length; i++) {
				for(int j=0;j<=i;j++) { 
				arr[i][j]='*';
				}
			} //왼쪽 삼각형을 만드는 for문
		 * 여기에 짝수에만 *을 넣기 위해 삼항연산자를 사용
		 * arr[i][j]=i%2==0 ? '*':'-'; 
		 */
		
	}//main

}
