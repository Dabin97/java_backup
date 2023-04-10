import java.util.Arrays;

public class ArrayEX6 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(arr); //메모리 주소값, [I@6f75e721 @왼쪽 메모리타입,@오른쪽 메모리주소
		
		//arr을 기존 길이가 5인 배열을 10개로 늘리기
		//1. 임시배열을 생성(temp)
		int[] temp = new int[10];
		//2. 배열의 내용을 복사
		for(int i=0;i<temp.length && i<arr.length;i++) {
			temp[i] = arr[i];
		}
		//3. 연결을 바꿔줌
		arr = temp;
		
		System.out.println(arr); //[I@69222c14 메모리주소값이 달라진다. 위치를 바꿨기때문
		System.out.println("이 배열의 길이 : " + arr.length);
		System.out.println(Arrays.toString(arr));
		
		//배열을 조회 및 탐색용이다.
		
	}//main

}
