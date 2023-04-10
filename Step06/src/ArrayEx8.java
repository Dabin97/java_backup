import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx8 {
	/*
	 * 배열 데이터 삭제 작업
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력(-1입력시 종료) : ");
			arr[index] = sc.nextInt(); 
			
			if(arr[index] == -1) break; 
			//배열을 늘리기전에 미리 break를 만들어둔다. -1이 나올때까지 숫자를 입력받음.
			
			index++; //count의 역할
			
			if(arr.length == index) {
				//배열 늘리기
				int[] temp = new int[arr.length + 3];
				//복사
				for(int i=0;i<arr.length;i++) {
					temp[i] = arr[i];
				}
				arr = temp;
			} // 임시 배열 temp를 통해 배열늘리는 작업
		}
		System.out.println(Arrays.toString(arr)); //모두 출력
		
		//삭제할 숫자를 입력 받음
		System.out.print("삭제할 숫자 입력 : ");
		int val = sc.nextInt();
		//삭제할 숫자가 있는 배열 인덱스를 찾음
		for (int i = 0; i < index; i++) {
			if(arr[i]==val) {
				//배열의 내용을 하나씩 땡겨오는 작업
				for(int j=i;j<index-1;j++) { //삭제할곳을 땡겨와야하므로 j=0이 아니라 j=i/j<index-1은 index까지라는 뜻
					arr[j] = arr[j+1]; //앞의 인덱스 자리에 뒤의 인덱스 자리값이 차지하도록 함. 결국 땡겨오는 작업
				}
				//입력이 가능한 인덱스 번호를 하나 감소
				index--;
				break;
			}
			
		}//for
		System.out.println(Arrays.toString(arr));
		
		
	}//main
}
