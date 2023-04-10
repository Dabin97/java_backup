package math;

import java.util.ArrayList;
import java.util.Arrays;

public class Lotto2 {
	// 배열이용
	public static boolean checkNumber(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int n = (int) (Math.floor(Math.random() * 45) + 1);
			if (checkNumber(arr, n)) // 중복제거
				i--; // i를 줄여서 다시 하나 더 받도록 함
			else
				arr[i] = n;
		}
		System.out.println(Arrays.toString(arr));
	}

}
