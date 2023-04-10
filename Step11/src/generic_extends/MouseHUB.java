package generic_extends;

public class MouseHUB<T extends Mouse> { //마우스 인터페이스를 받은 애만 등록할거라는 제네릭
	private T mouse;
	private int dp;
	private int wheel;
	
	
	public MouseHUB(T mouse, int dp, int wheel) {
		super();
		this.mouse = mouse;
		this.dp = dp;
		this.wheel = wheel;
	}
	
	public void click(int n) {
		mouse.click(n); //click함수에 n넣음.
	}
	
	public void wheel() {
		mouse.wheel(); //wheel함수 실행
	}
	
}
