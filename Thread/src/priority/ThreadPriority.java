package priority;

public class ThreadPriority extends Thread{

	public ThreadPriority(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
			try {
				Thread.sleep(100);//0.1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		System.out.println(getName() + " - 스레드 종료");
	}
	
	
	
}
