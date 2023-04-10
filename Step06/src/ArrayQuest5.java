import java.util.Scanner;

public class ArrayQuest5 {
	/*
	 * 정수형 배열 길이가 10인 배열을 생성한 뒤 숫자를 전부 입력을 받은 후 아래와 같이 출력, 숫자0은 짝수로 처리
	 * 
	 * [1,2,3,4,5,6,7,8,9,10] <--입력된 데이터
	 * 
	 * 홀수 : 1 3 5 7 9 짝수 : 2 4 6 8 10
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 배열 생성 - 길이 10
		int[] arr = new int[10];
		String a = "", b = "";
		
		//배열에 숫자 입력 처리
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();

			if (arr[i] % 2 == 0) {
				a += arr[i] + " "; // +=을 해야 for문 안에서 돌면서 옆에 계속 숫자가 붙는다.
			} else {
				b += arr[i] + " ";
			}
		} // for

		System.out.println("짝수 : " + a); // 출력은 바깥에 있어야 한다. 안쪽에 있는 값을 바깥으로 꺼내기 위해
		System.out.println("홀수 : " + b); // String 변수를 만들어서 += 로 값을 가져온후 출력한다.

		/*
		 * System.out.print("짝수 : "); 
		 * for(int i=0; i<arr.length; i++) { 
		 * 	if(arr[i]%2==0){
		 *  	System.out.println(arr[i]+" ");; } 
		 *  } 
		 *  이렇게도 가능(홀수 짝수 모두)
		 */
		
		//Step04-Quest10의 String 참고(10진수 2진수 변환 Quest)
		//Quest10에서는 str = "0" + str;
		//a += arr[i] + " "; [i]+" "가 계속 String a에 들어간다. 
		//덮어씌워지는것이 아니라 i가 증가하면서 조건(if)에 맞는 인덱스번호의 값이 a에 추가되는 형태

	}// main

}
