import java.util.Arrays;
import java.util.Scanner;

public class Array7_2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력(-1입력시 종료) : ");
			arr[index++] = sc.nextInt(); //index++
			
			if(arr[index-1] == -1) break; 
			//배열을 늘리기전에 미리 break를 만들어둔다. -1이 나올때까지 숫자를 입력받음.
			//arr[index-1] 하는 이유는 -1을 받고 멈췄기때문에 -1을 해줘서, '-1'값을 없앤다.
			
			if(arr.length == index) {
				//배열 늘리기(index가 5가 되서 배열이 다 차면 배열을 늘린다.)
				int[] temp = new int[arr.length + 3];
				//복사
				for(int i=0;i<arr.length;i++) {
					temp[i] = arr[i];
				}
				arr = temp;
			} // 임시 배열 temp를 통해 배열늘리는 작업
		}
		System.out.println(Arrays.toString(arr)); //모두 출력
		
		int sum = 0;
		for(int i=0;i<index;i++) { //i<arr.length 가 아니라 i<index
			sum += arr[i];
		} //총합
		System.out.println(sum/(double)(index-1)); //평균
	}//main

}
