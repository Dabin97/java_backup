package method;

public class AirConditionerQuest {
	/*<에어컨>
	 * 데이터 : 	바람세기(int)- 1~3
	 * 			전원(boolean) - on(True) / off(false)
	 * 			제습(boolean) - on(True) / off(false)
	 * 			냉방난방(int) - 16 ~ 30도
	 * 
	 * 기능 : 	초기화
	 * 			전원OnOff
	 * 			제습OnOff
	 * 			냉방
	 * 			난방
	 * 			
	 */
	
	int wind;
	boolean power;
	boolean dehumidifier;
	int cooling;
	
	//초기화
	void init() {
		wind = 2;
		power = false;
		dehumidifier = false;
		cooling = 20;
	}
	
	//전원OnOff
	void powerOnOff() { 
		power = !power; 
		if(power) {
			System.out.println("에어컨 전원 On");
		}else {
			System.out.println("에어컨 전원 Off");
		}
	} 
	
	//제습OnOff
	void dehumidifierOnOff() {  
		dehumidifier = !dehumidifier; 
		if(dehumidifier) {
			System.out.println("제습 활성화");
		}else {
			System.out.println("제습 비활성화");
		}
	} 
	
	//냉방, 냉방(int) - 16 ~ 
	void cooling() {
		if(!power) return;
		
		if(cooling>16) cooling--;
			System.out.println("현재 온도 : " + cooling);
	}
	
	//난방,  - 30도
	void heating() {
		if(!power) return;
		
		if(cooling<30) {cooling++;}
			System.out.println("현재 온도 : " + cooling);
		}
	
}//class
