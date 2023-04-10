package method;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.init();
		
		tv.powerOnOff(); //기본이 false기 때문에 결과값: TV 전원 On
		
		for (int i = 0; i < 500; i++) {
			tv.chUp();
		}
		for (int i = 0; i < 31; i++) {
			tv.volUp();
		}
		for (int i = 0; i < 11; i++) {
			tv.volDown();
		}
		
		
	}//main

}
