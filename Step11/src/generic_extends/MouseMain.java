package generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		//Mouse 인터페이스를 받는 클래스들만 선언할 수 있다. (OfficeMouse는 인터페이스를 받지않아서 오류뜸0
		MouseHUB<GamingMouse> hub = new MouseHUB<GamingMouse>(new GamingMouse(), 3200, 5); 
		hub.click(2); //click함수에 2를 넣어서 case 2실행 -> 게이밍 마우스 오른쪽 버튼 클릭
	}

}
