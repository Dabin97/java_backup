package init;

import java.util.Random;

public class PlayerMain {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
//			Thread t = new Thread(new Player(), "플레이어" + i);
			Thread t = new Thread(()->{   //람다식으로 고친것, Player에서 만든식을 안에 넣으면 적용된다.
				Random r = new Random();  // Step13-lamda 참고
				int d1 = r.nextInt(6)+1;		
				int d2 = r.nextInt(6)+1;		
				
				try {
					Thread.sleep(1000); 
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " " + d1 + "," + d2); 
			},"플레이어" + i);
			t.start(); 
		}
		
		
	}//main

}
