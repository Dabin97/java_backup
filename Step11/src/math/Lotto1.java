package math;

import java.util.ArrayList;
import java.util.Arrays;
// 로또번호 1세트를 생성해서 출력
// 로또번호 범위 1~45, 총 6개 숫자를 뽑음, 숫자는 중복 X , ArrList
// 소수점내림(임의의 수 * (최대값 - 최소값 + 1)) + 최소값
public class Lotto1 {
	
	public static void main(String[] args) {
		//ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(list.size()<6) {
			int n = (int)(Math.floor(Math.random() * 45) + 1); //따로 변수n으로 값을 받음
			if (list.contains(n))
				continue;
			list.add(n); //add(n)으로 함
		}
		System.out.println(list);
	}// main
}
