package has_a_3;

public class PowerMain {

	public static void main(String[] args) {
		IotApp app = new IotApp();
		
		app.addDevice(new LED());
		app.deviceAllPowerOn();
		app.deviceAllPowerOff();
	}

}
