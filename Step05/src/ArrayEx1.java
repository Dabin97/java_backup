
public class ArrayEx1 {
	/*
	 * 	배열(Array)
	 * 		변수 선언시 하나의 변수명으로
	 * 		동시에 여러개의 값을 저장할 공간을 만드는 자료구조
	 * 		탐색속도가 빠르다.데이터 탐색용도로 많이 쓰임. 일렬로 배열된 선형구조
	 * 
	 * 	인덱스(Index) - 0 ~ 배열 개수 - 1
	 * 		동시에 여러개 선언된 배열의 요소들을 구분하는 번호표
	 * 
	 * 	배열 선언 방법
	 * 		변수타입[] 변수명 = new 변수타입[개수];
	 */
	public static void main(String[] args) {
		//정수형 변수 5개짜리로 배열 선언 []
		int[] arr = new int[5]; 
		//new : 프로그램이 실행하는 중에 메모리를 별도로 할당 받겠다고 하는 키워드 (동적할당)
		// 이미 메모리가 할당된것 : 스택(stack) / new로 메모리를 받는것 : 힙(heap)
		
		arr[0] = 10; //배열 arr의 0번째에 10을 저장하겠다. 
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60; //인덱스 번호가 범위를 벗어나면 런타임에러 발생
		//6번째 값, 문법적으론 문제가 없지만 실행하면 오류가 뜬다. arr의 길이 5를 넘어갔기때문
		//[변수값]도 넣을수있다. 변수값이 달라지면서 안쪽 데이터를 쭉 뽑아올수있다.
		//[문자]도 가능, int[]가 아니라 char[]로 해야한다. 

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}//main

}
