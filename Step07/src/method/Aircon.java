package method;

public class Aircon {
	//모드 - 냉방(0),송풍(1),제습(2)
	int mode; 	//데이터가 적으면 int가 아니라 byte로 해도 상관없다. 
	//온도 - 18 ~ 32
	int temp;
	//풍량 - 약(0), 중(1), 강(2), 자동(3)
	int windMode;
	//바람각도 - 자동, 고정
	boolean windAngle;
	//전원 - On, Off
	boolean power;
	
	
	//초기화
	void init() {
		temp = 24;
		//모드, 풍량, 바람각도, 전원은 초기화 하지 않는다. 자동으로 초기화되는건 자바만 그렇다. 
	}
	
	//전원OnOff
	void powerOnOff() {
		power = !power;
		if(power) 
			System.out.println("에어컨 전원 On");
		else
			System.out.println("에어컨 전원 Off");
	}
	//온도Up
	void tempup() {
		//전원체크
		if(!power) return;
		//운전 모드 체크
		if(mode != 0) return; //모드가 0일때만 동작, 냉방 - 온도Up
		//온도 증가
		//최대값 처리
		if(temp < 32) temp++;
		
		System.out.println("현재 온도 : " + temp);
	}
		
	//온도Down
		void tempDown() {
			//전원체크
			if(!power) return;
			//운전 모드 체크
			if(mode != 0) return; //모드가 0일때만 동작, 냉방 - 온도Up
			//온도 증가
			//최소값 처리
			if(temp > 18) temp--;
			
			System.out.println("현재 온도 : " + temp);
		}
			
	//모드변경 - 냉방(0),송풍(1),제습(2)
	void changeMode() {
		if(!power) return;
		mode++;
		mode %= 3; //012만 나오도록
		final String[] AIRCON_MODE = {"냉방","송풍","제습"}; //상수로 선언
		System.out.println(AIRCON_MODE[mode] + " 모드로 전환합니다.");
//		switch(mode) {
//		case 0:
//			System.out.println("냉방 모드로 전환합니다.");
//			break;
//		case 1:
//			System.out.println("송풍 모드로 전환합니다.");
//			break;
//		case 2:
//			System.out.println("제습 모드로 전환합니다.");
//			break;
//		}
	}
	
	//바람각도 조정 - 자동, 고정
	void changeWindAngle() {
		if(!power) return;
		
		windAngle = ! windAngle;
		
		System.out.println(windAngle ? "바람각을 고정합니다." : "바람각을 자동으로 합니다."); //삼항연산자
	}
	
	//풍량변경
	final String[] WIND_POWER_MODE = {"약","중","강","자동"}; //상수로 선언
	void changeWindPower() {
		if(!power) return;
		windMode++;
		windMode %= 4; //0123만 나오도록
		System.out.println("바람세기 : "+WIND_POWER_MODE[mode]);
		
		
	}
	
	
	
}//class
