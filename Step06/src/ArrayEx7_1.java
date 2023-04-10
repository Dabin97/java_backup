import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5]; // 배열
		double sum = 0; // 입력한 값을 누적시킬 변수
		double count = 0; // 횟수누적 및 배열길이 증설을 제어할 변수 //sum,count 둘다 double

		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt(); // 입력받을 변수

			if (num == -1) { // -1을 입력할 경우
				System.out.println(Arrays.toString(arr)); // 배열출력

				for (int num1 : arr) { // 배열을 순회하면서 입력한 값을 합산
					if (num1 != 0) //0을 만나면 반복을 그만둔다.
						sum += num1;
				} //for each문-Step5의 ArrayEx3 참고

				System.out.println("배열 내 평균값 : " + sum / count); // 평균값 출력
				break;
			} else { // -1이 아닌 값을 입력할 경우
				count++; // 입력횟수 누적

				if (count > arr.length) { // 입력한 횟수가 배열 길이를 넘어서는 경우/입력횟수를 사용하면 편하다
					int[] temp = new int[arr.length + 3]; // 임시배열을 원본배열+3 길이로 선언

					for (int i = 0; i < arr.length; i++) { // 임시배열에 원본배열의 각 요소값 복사
						temp[i] = arr[i];
					}

					arr = temp; // 원본배열에 임시배열 주소 덮어쓰기
					arr[(int) count - 1] = num; // 길이를 초과하여 입력된 값 추가 /count-1은 -1을 빼야해서 넣는것
				} else { // 입력한 횟수가 배열길이를 넘지 않을 경우
					arr[(int) count - 1] = num; // 입력한 값을 원본배열에 추가
				}
			}
		}
	}//main

}
