package has_a_3;
/*
 * Tv,에어컨,LED등은 IOt 시스템이 제어할수있게
 * 전원에 대한 모듈을 통일시켜서 개발
 * 
 * PowerOnOff -전원 관리 클래스
 * 필드-power(boolean)
 * 메서드 - powerOnOff, powerOn,powerOff
 */
public class PowerOnOff {
	protected boolean power;

	public void powerOnOff() { //PowerOnOff 메소드 하나만
		power = !power;
		
		if(power)
			System.out.println("전원 On");
		else
			System.out.println("전원 Off");
	} 
	//기능적인 것을 하나로 묶어서 처리한다면 상속관계인것이 낫다. 기능을 바꾸면서 사용한다면 has a방식으로
	
	
	public void powerOn() {
		power = true;
		System.out.println("전원 On");
	}
	
	public void powerOff() {
		power = false;
		System.out.println("전원 Off");
	}
}//class
