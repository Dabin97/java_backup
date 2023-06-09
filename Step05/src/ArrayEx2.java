import java.util.Iterator;

public class ArrayEx2 {

	public static void main(String[] args) {
		//배열 생성과 동시에 초기화하는 방법
		//정수형 배열 5개짜리로 선언 - 순서대로 초기화
		//			  0  1  2  3  4
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[] {1, 2, 3, 4, 5, 6}; //2가지 배열 초기화방법
		int[] arr3 = new int[5]; //new로 만든 애들은 자동으로 0으로 초기화해줌
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println("------------------");
		
		System.out.println("배열의 길이 : " + arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("-----------------");
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
	}

}
