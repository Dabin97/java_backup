package join;

public class JoinMain {

	public static void main(String[] args) { //main도 별도의 스레드이다.
		JoinThread join1 = new JoinThread("Join 스레드 - 1");
		JoinThread join2 = new JoinThread("Join 스레드 - 2");
		JoinThread join3 = new JoinThread("Join 스레드 - 3");
		
		join1.start();
		join2.start();
		join3.start();
		
		
		try {				//이걸 추가하니까 생성한 스레드가 먼저 실행되고 메인이 맨 마지막에 종료된다.
			join1.join();
			join2.join(1000); //join2 작업을 1초동안만 기다리겠다.
			join3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료");
		//메인이 가장 먼저 종료된다. 프로그램 시작점. 메인이 끝나고 생성한 스레드가 끝나야 terminate된다. 

	}//main

}
