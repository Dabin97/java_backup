package init;

//스레드는 스레드 클래스를 하거나, 인터페이스를 implements 해서 사용
public class RunnableRun implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - 종료"); 
		//Thread.currentThread() :  현재 실행 중인 스레드를 가져옵니다.
	} 

}
