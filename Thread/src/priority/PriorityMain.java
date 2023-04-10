package priority;


public class PriorityMain {

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority("T1");
		ThreadPriority t2 = new ThreadPriority("T2");
		ThreadPriority t3 = new ThreadPriority("T3");
		ThreadPriority t4 = new ThreadPriority("T4");
		ThreadPriority t5 = new ThreadPriority("T5");
		ThreadPriority t6 = new ThreadPriority("T6");
		
		t1.setPriority(Thread.MAX_PRIORITY); //t1이 max인데도 맨 처음에 나오지않는다. 
		t2.setPriority(Thread.MIN_PRIORITY); 
		t3.setPriority(Thread.MIN_PRIORITY); //우선순위값 설정(1~10)max = 10, min = 1
		t4.setPriority(Thread.MIN_PRIORITY); //getPriority : 스레드의 우선순위 반환
		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();  
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
	}

}
/*
	start() : 스레드 실행
	run() : 스레드 수행시 처리되는 메서드
	join() , join(long millis): 지정된 시간동안 스레드 수행
	sleep(long millis) : 지정된 시간동안 스레드 일시정지

*/