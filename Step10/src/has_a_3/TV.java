package has_a_3;

public class TV extends PowerOnOff {

	@Override //오버라이딩은 이 상태로는 강제성이 없다. 그러므로 '추상화'를 통해 강제화시킬것
	public void powerOnOff() {
		power = !power;

		if (power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}
	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV 전원 On");
	}
	@Override
	public void powerOff() {
		power = false;
		System.out.println("TV 전원 Off");
	}

}
