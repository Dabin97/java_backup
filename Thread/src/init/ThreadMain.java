package init;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadRun r1 = new ThreadRun("스레드1");
		ThreadRun r2 = new ThreadRun("스레드2");
		ThreadRun r3 = new ThreadRun("스레드3");
		ThreadRun r4 = new ThreadRun("스레드4");
		ThreadRun r5 = new ThreadRun("스레드5");
		ThreadRun r6 = new ThreadRun("스레드6");
		
		r1.start();  //start -> 스캐쥴러에 등록 -> 자기차례가 오면 -> run() 실행 -> 종료ㅌ
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		
		
	}//main

}
