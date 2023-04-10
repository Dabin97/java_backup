package init;

import java.util.Random;

public class Player implements Runnable{

	@Override
	public void run() {
		Random r = new Random();
		int d1 = r.nextInt(6)+1;		//따로 결과값을 변수로 만듦. 
		int d2 = r.nextInt(6)+1;		// r.nextInt(최대값 + 최소값 - 1)) + 최소값

		
		try {
			Thread.sleep(1000); //밀리초 단위로 잠시 멈춤
		} catch (Exception e) {
			e.printStackTrace();
		}// 이부분은 선택
		
		System.out.println(Thread.currentThread().getName() + " " + d1 + "," + d2); 
		//Thread.currentThread().getName()를 적용해야한다. 현재 실행 중인 스레드를 가져오는 것
	}

	//Step11-Random 참고
	
}
