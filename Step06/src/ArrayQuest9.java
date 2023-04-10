import java.util.Arrays;

public class ArrayQuest9 {

	public static void main(String[] args) {
		char[][] arr = new char[5][5];

//		for (int i = 0; i < 3; i++) { //0번째 행에서 2번째행까지 i++
//			for (int j = 2-i; j <= i+2; j++) { 
//				arr[i][j] = '*';
//			}
//		} //윗쪽 삼각형
//		for (int i = 3; i < 5; i++) {
//			for (int j = i-2; j <= 6-i; j++) {
//				arr[i][j] = '*';
//			}
//		}//아랫쪽 삼각형
		
		int col = 2,star = 1; //col은 공백
		for (int i = 0; i < arr.length; i++) {
			for (int j=0,c=col; j<star; j++,c++) {
				arr[i][c] = '*';
			}
			if(i < arr.length/2) { //arr.length/2 삼각형을 반으로 나누어서
				col -= 1; //공백은 아래로 갈수록 1씩 줄어든다
				star += 2; //별은 아래로 갈수록 2씩 증가한다.
			}else {
				col += 1; //아래쪽 삼각형은 공백과 별이 반대
				star -= 2;
			}
				
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}// main

}
