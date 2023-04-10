
public class Array2DEX1 {

	public static void main(String[] args) {
		//정수형 배열 3행 4열짜리로 생성
		int[][] arr = new int[3][4]; //첫번째[행] 두번째[열]
		
		System.out.println("행 개수 : " + arr.length);
		System.out.println("0번 행의 열 개수 : " + arr[0].length);
		System.out.println("1번 행의 열 개수 : " + arr[1].length);
		System.out.println("2번 행의 열 개수 : " + arr[2].length);
		
		for (int i = 0; i < arr.length; i++) { //행번호 제어(보통 행부터 제어한다)
			for (int j = 0; j < arr[i].length; j++) { //열번호 제어
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //행 나열하고 줄바꿈
		}
	}//main

}
