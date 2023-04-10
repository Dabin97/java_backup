package init;

public class RunnableMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableRun(), "스레드1");//스레드 클래스를 상속받지 않고 인터페이스를 상속받기 때문에
		Thread t2 = new Thread(new RunnableRun(), "스레드2");//ThreadRun이 아니라 Thread로 new를 만든다.
		Thread t3 = new Thread(new RunnableRun(), "스레드3");
		Thread t4 = new Thread(new RunnableRun(), "스레드4");
		Thread t5 = new Thread(new RunnableRun(), "스레드5");
		Thread t6 = new Thread(new RunnableRun(), "스레드6");
		
		t1.start();  
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start(); 
		
		//class Thread implements Runnable : Thread f3하니까 Runnable이 있었다. Runnable 객체를 가지고있으니까 실행가능
		
	}

}
