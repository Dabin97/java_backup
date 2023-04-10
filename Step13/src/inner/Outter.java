package inner; //Nested class라고도 함
//클래스 안에 클래스 만들기
public class Outter {
	private int outter;

	public Outter(int outter) {
		super();
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println("outter : " + outter);
	}
	//Outter 클래스는 Inner 객체를 특정할 수가 없음. 따라서 오류발생
	//System.out.println("inner : " + inner);
	
	//새로운 클래스를 하나 더 선언
	public class Inner{
		private int inner;

		public Inner(int inner) {
			super();
			this.inner = inner;
		}
		
		public int sum() {
			return outter + inner;
		}
		//private int outter; 인데 사용가능함->Inner클래스는 Outter클래스 소속이라서 접근이 가능하다. (근데 그 반대는 안됨, 모르기때문에(?))
		// Inner클래스의 컴파일 : Outter$Inner.class 누구 소속인지 알려줌
		//아까 event클래스 안에 생성된 인터페이스도 동일하다 : View$OnClickListener.class	
		//여기는 static을 쓰지않아서 Outter가 필요하지만 static을 만들면 그럴필요가없다.(static = 미리 메모리 할당)
		
		
	}//Inner class
	
	
}//Outter class
