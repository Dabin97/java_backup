import java.util.Arrays;
	//문자열 배열 만들기, 뽑기

public class ArrayEx4 {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		
		//arr에 저장된 내용을 거꾸로 뒤집어서 저장
		//Hello World
		//
		//dlroW olleH <--- 배열에 저장
		
		for (int i = 0; i < arr.length/2; i++) { //나누기2는 678910인덱스 바꾸기위해?
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length - i - 1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		//0-10,1-9,2-8,3-7,4-6 인덱스번호가 바뀌어야한다. 따라서 arr.length - 1 -왼쪽 인덱스번호
		//여기서 왼쪽 인덱스번호는 for문의 i에 해당하므로 arr.length-i-1
	}//main

}
