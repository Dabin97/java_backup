package init;
/*스레드(Thread)
 * 동작하고 있는 프로그램을 프로세스(Process)라고 한다. 
 * 보통 한 개의 프로세스는 한 가지의 일을 하지만, 쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있다.
 */
public class ThreadRun extends Thread{
	//생성자 - 이름만(String)
	public ThreadRun(String name) {
		super(name);
	}

	//자동으로 수행할 메서드, 스레드 run을 오버라이딩
	@Override
	public void run() {
		for(int i=0;i<100;i++);
		//System.out.println(getName() + " " + i + "번째 일");
		
		System.out.println(getName() + " 스레드 종료");
	}
	
}
