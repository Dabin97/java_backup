import java.util.Arrays;
import java.util.Iterator;
public class ArrayQuest7 {
/*
 * 1. 2차원 배열 5행 5열 짜리를 생성
 * 2. 오른쪽 그림과 같이 배열에 내용을 채우기
 * 3. 배열의 전체 내용을 출력
 */
	public static void main(String[] args) {
		int[][] arr = new int [5][5];
		
		int j=0,sw = 1, n=1; //sw는 증감값
		for (int i = 0; i < arr.length; i++) {
			while(j <arr.length && j >= 0) { 
				arr[i][j] = n++; //n=1을 n++해서 25까지
				j += sw;  //j = j+sw; j=0,sw=1;
			}
			sw = -sw; //1=-1?
			j += sw; //25 += -1?
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		
	}//main

}
