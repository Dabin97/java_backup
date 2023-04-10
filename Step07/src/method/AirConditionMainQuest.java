package method;

public class AirConditionMainQuest {

	public static void main(String[] args) {
		AirConditionerQuest aircon = new AirConditionerQuest();
		aircon.init();
		
		aircon.powerOnOff(); //기본이 false기 때문에 결과값: TV 전원 On
		
		
		for (int i = 0; i < 21; i++) {
			aircon.heating();
		}
		
	}//main

}
