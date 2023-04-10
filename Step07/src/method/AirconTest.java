package method;

import java.util.Iterator;

public class AirconTest {

	public static void main(String[] args) {
		
		Aircon aircon = new Aircon();
		aircon.init(); //초기화
		aircon.powerOnOff(); //전원On
		aircon.changeMode(); //송풍
		aircon.changeMode(); //제습
		aircon.changeMode(); //냉방
		aircon.changeWindAngle(); //바람각 고정
		aircon.changeWindAngle(); //바람각 자동
		aircon.changeWindAngle(); //바람각 고정
		aircon.changeWindPower(); //바람세기 : 약
		aircon.changeWindPower(); //바람세기 : 약
		aircon.changeWindPower(); //바람세기 : 약
		aircon.changeWindPower(); //바람세기 : 약
		for(int i=0;i<20;i++) 
			aircon.tempDown(); //온도 24도 20번 반복
			
		

		
	}//main

}
