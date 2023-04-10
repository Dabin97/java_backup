import java.util.Arrays;
import java.util.Scanner;

public class IndexQuest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		while (true) {
			System.out.print("프로그램 종료 할려면 0 입력하세요 : ");
			int no = sc.nextInt();
			if(no == 0) break; //프로그램 종료 break
			System.out.print("시작 인덱스 : ");
			int s = sc.nextInt(); //시작 s
			System.out.print("마지막 인덱스 : ");
			int e = sc.nextInt(); //끝 e
			System.out.print("왼쪽 로테이션 - 1, 오른쪽 로테이션 - 2 : ");
			int mode = sc.nextInt(); //모드 입력받기

			//모드에 따라 배열 밀기
			System.out.println(Arrays.toString(arr));
			if (mode == 1) {
				int first = arr[s]; //시작 인덱스를 first라는 변수에 임시보관
				for (int i = s; i < e; i++) { // 마지막 인덱스를 넘어가면 안되니까 i < e
					arr[i] = arr[i + 1];      //왼쪽로테이션이기 때문에 오른쪽으로 +1 이동한다.
				}
				arr[e] = first; 			  //이제 비어버린 맨 끝에 first에 넣어놨던 시작 인덱스를 넣는다.
				System.out.println(Arrays.toString(arr));
			} else {
				int last = arr[e];
				for (int i = e; i > s; i--) {
					arr[i] = arr[i - 1];
				}
				arr[s] = last;
				System.out.println(Arrays.toString(arr));

			}
		}
	}

}
