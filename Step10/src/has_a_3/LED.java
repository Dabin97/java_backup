package has_a_3;

public class LED extends PowerOnOff{
	
	@Override
	public void powerOnOff() {

		power = !power;

		if (power)
			System.out.println("전등 전원 On");
		else
			System.out.println("전등 전원 Off");
	}
	@Override
	public void powerOn() {
		power = true;
		System.out.println("전등 전원 On");
	}
	@Override
	public void powerOff() {
		power = false;
		System.out.println("전등 전원 Off");
	}
}//class
