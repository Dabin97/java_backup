package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(10)); //0부터 9까지 나옴
		
		//36~97까지의 숫자를 랜덤하게 뽑기
		// r.nextInt(최대값 + 최소값 - 1)) + 최소값
		System.out.println(r.nextInt(62)+36);
		System.out.println(r.nextBoolean());
		
		 
		
	}//main

}
