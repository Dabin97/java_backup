package inner;
//아까는 static을 쓰지않아서 Outter가 필요하지만 static을 만들면 그럴필요가없다.(static = 미리 메모리 할당)
public class OutterStaticClass {
	private int outter;
	private static double n = 23.1234; //static으로 선언된거 하나
	
	public OutterStaticClass(int outter) {
		super();
		this.outter = outter;
	}
	
	//class안에 static class 선언
	public static class InnerStaticClass{ //Inner클래스가 private이면 외부에서 접근불가능, 내부에서 new가능(내부요소관리용도)
		private int i;
		
		public InnerStaticClass(int i) {
			this.i = i;
		}
		
		public int sum() {
//			return outter + i; //outter가 None Static이기 떄문에 접근이 불가(InnerStaticClass는 static class) static끼리는 접근가능
			return (int)(n + i); 
		}
	}//InnerStaticClass
	
	
	
}//OutterStaticClass
