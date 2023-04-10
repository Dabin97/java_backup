import java.util.Arrays;

public class ArrayQuest9_1 {
	/*
	 * 점화식을 이용한 2차원배열 다이아몬드 찍기
	 * 
	 * 1. 알고리즘 접근 순서
	 * 		- 수학적 점화식을 만들기 위해 행,열의 값을 변환
	 * 		  기존행,열값 : 0, 1, 2, 3, 4
	 * 		  변환행,열값 : -2, -1, 0, 1, 2
	 * 
	 * 		- 별이 찍히는 각 데이터 칸의 행,열 값에서 점화식 도출
	 * 		  행값 = 변환행값 + 2
	 * 		  열값 = |변환행값|(절댓값)
	 * 
	 * 		- 각 행에 찍히는 별의 개수에서 점화식 도출
	 * 		  행별 개수 = 배열의 행 갯수 - |변환행값|(절댓값)
	 * 
	 * 		- 위에서 구한 값으로 for문 구성
	 */
	
	public static void main(String[] args) {
char[][] arr = new char[5][5];
		
		for(int i = -2; i < 3; i++) {
			if(i < 0) {
				for(int j = -1 * i; j < arr.length - (-1 * i); j++) {
					arr[i + 2][j] = '*';
				}
			}
			else {
				for(int j = i; j < arr.length - i; j++) {
					arr[i + 2][j] = '*';
				}
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}//main

}
