import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx4_1 {
	/*
	 * arr에 저장된 내용을 거꾸로 뒤집어서 저장 Hello World
	 * 
	 * dlroW olleH <--- 배열에 저장
	 * 
	 */
	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length/2; i++) { //arr.length/2 를 하지않으면 그냥 원래대로 출력된다
			char temp = arr[i]; //임시로 담아두기
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp; //다시 임시로 담아둔것을 옮기기 (위치 뒤바꾸기)
		}
		
		// 0    1   2   3   4   <- i
		//0-10/1-9/2-8/3-7/4-6/(5-5띄어쓰기)
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}//main

}
