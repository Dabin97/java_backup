import java.util.Arrays;
import java.util.Scanner;


public class IndexQuest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.print("시작인덱스 입력 : ");
			int startIndex = sc.nextInt();
			System.out.print("마지막인덱스 입력 : ");
			int endIndex = sc.nextInt(); //입력받기
			
			if(startIndex < 0 || startIndex > arr.length -1) {
				System.out.println("시작인덱스가 배열 인덱스 범위를 초과하였습니다. 다시입력하십시오.");
				continue;
			}
			else if(endIndex < 0 || endIndex > arr.length -1) {
				System.out.println("마지막인덱스가 배열 인덱스 범위를 초과하였습니다. 다시입력하십시오.");
				continue;
			} //인덱스 입력에서 배열 인덱스 범위를 초과할 경우 오류가 발생하는 것을 막기 위해 입력값 판정 추가
			
			System.out.println("1. 왼쪽 로테이션");
			System.out.println("2. 오른쪽 로테이션");
			System.out.println("3. 종료");
			System.out.print("모드 입력 : ");
			int mod = sc.nextInt();
			
			int temp = 0; //시작과 끝 인덱스를 잠시 받을 임시변수 temp
			
			// 배열 모드에 따라 한칸씩 밀기
			if(mod == 1) {
				temp = arr[startIndex];
				
				for(int i = startIndex; i < endIndex; i++) {
					arr[i] = arr[i+1];
				}
				
				arr[endIndex] = temp;
			}
			else if(mod == 2) {
				temp = arr[endIndex];
				
				for(int i = endIndex; i > startIndex; i--) {
					arr[i] = arr[i-1];
				}
				
				arr[startIndex] = temp;
			}
			else if(mod == 3) {
				break;
			}
			else {
				System.out.println("모드값을 잘못 입력했습니다. 다시입력하십시오");
			}
		}
		
		
		//arr[2]와 arr[4]를 오른쪽으로 이동하면, arr[4]는 맨 앞으로 이동한다. 
		//arr[4]를 임시메모리에 담아두고, 2->3을 땡겨준다. 그리고 담아둔 arr[4]를 오른쪽에 땡겨져서 빈 arr[2]에 넣는다. 
		
	}//main

}
