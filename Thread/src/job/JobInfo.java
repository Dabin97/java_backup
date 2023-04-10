package job;
//싱글톤
public class JobInfo {
	private static JobInfo instance = new JobInfo();
	private String jobInfo;
	
	private JobInfo() {	}

	public static JobInfo getInstane() {
		if(instance == null)
			instance = new JobInfo();
		return instance;
	}

	public synchronized String getJobInfo() throws InterruptedException { //synchronized를 넣어 먼저 가져간 사람이 가져가는걸로 만든다. 1명만 가져가게
		String msg = null;
		if(jobInfo == null) //누가 jobinfo를 가져가면
			wait(); 	    //스레드를 대기상태로 만듦. 멈춤
		msg = jobInfo;
		jobInfo = null;
		return msg;
	}

	public synchronized void writeJob(String job) {
		jobInfo = job;
		notifyAll(); //대기중인 모든 스레드를 깨움
	}
	
	
	
}
