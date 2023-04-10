package method;

public class TV {
	/*
	데이터 : 	채널(int)- 1 ~ 456
	 		음량(int) - 0 ~ 40
	 		전원(boolean) - on(True) / off(false)
	 		음소거(boolean) - 음소거(True) / 해제(false)
	 		
	 		
	기능 : 	초기화
			채널Up
			채널Down
			음량Up
			음량Down
			전원On + 전원Off = if else (리모컨에 전원버튼 1개)
			음소거On + 음소거Off = if else (리모컨에 음소거버튼 1개)
	*/
	
	int ch;
	int vol;
	boolean power;
	boolean mute;
	
	//초기화 - 채널값, 음량값, 전원, 음소거
	void init() { 
		ch = 455;   //값을 임의로 지정해놓음
		vol = 10;
		power = false;
		mute = false;
	}
	
	//전원OnOff
	//전원 켜져 있으면 끄기, 전원이 꺼져있으면 켜기
	//TV전원 On, TV전원 Off
	void powerOnOff() {  //토글(Toggle)
		power = !power; //not연산자, 실행할때마다 바뀐다. 따라서 if문 안에 power를 서로 뒤바꾸는 코드는 삭제해도된다. 
		if(power) {
			System.out.println("TV 전원 On");
		}else {
			System.out.println("TV 전원 Off");
		}
	} 
	
	//채널 Up : 채널값을 하나만 올리면 됨, 올린 후에 (현재 채널 : XX) <--출력
	//채널(int) - 1 ~ 456
	void chUp() {
		if(!power)
			return;   //메서드 강제 종료 
		ch %= 456;  //마지막이 나머지가 0이 나오는데
		ch++;       //이후에 ch++;을 하면 0이 1이된다. 채널이 순환되는 구조가 형성된다.  
		System.out.println("현재 채널 : " + ch);
	}
	
	void chDown() {
		if(!power) return;
		ch--; //ch--;을 먼저 올리면 아래 if문에서 else를 쓸필요가 없다. 
		if(ch < 1)
			ch = 456;
			System.out.println("현재 채널 : " + ch);
	}
	
	//음소거
	void muteOnOff() {  //토글(Toggle)
		if(!power) return;
		mute = !mute;
		if(mute) {
			System.out.println("음소거 활성화");
		}else {
			System.out.println("음소거 비활성화");
		}
	} 
	
	//음량Up, 음량(int) - 0 ~ 40
	void volUp() {
		if(!power) return;
		if(mute) muteOnOff(); //뮤트가 풀렸는지 확인, 위에 만든 메서드를 사용해도된다. 
		
		if(vol<40) vol++;
			System.out.println("현재 음량 : " + vol);
	}
	
	//음량Down
	void volDown() {
		if(!power) return;
		if(mute) muteOnOff(); 
		
		if(vol>0) vol--;
		System.out.println("현재 음량 : " + vol);
	}
	

}//class
