package generic_extends;

public class OfficeMouse { //마우스 인터페이스를 안쓰는 비표준클래스
	public void lclick() {
		System.out.println("마우스 왼쪽 버튼 클릭");
	}
	
	public void rclick() {
		System.out.println("마우스 오른쪽 버튼 클릭");
	}
	
	public void wheel() {
		System.out.println("화면 스크롤 이동");
	}
}
