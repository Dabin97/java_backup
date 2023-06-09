package static_ex;

public class StaticVar {
	public static int n1 = 10; //전역변수
	public static final double PI = 3.1415; //static 상수 선언
	public int n2 = 20; 	   
	
	public static void main(String[] args) {
		System.out.println(n1); //static 키워드가 붙어서 미리 메모리가 할당되어 있음
		//System.out.println(n2); //staticVar 클래스의 n2는 필드이기때문에 아직 생성이 안된 상태(누구껀지도 모름)
		//non-static은 반드시 생성 후 실행
		StaticVar var = new StaticVar();
		System.out.println(var.n2);
		
		//static 변수나 상수에 접근하는 방법
		//클래스명.변수명,  클래스.상수명
		System.out.println(StaticVar.PI);
		System.out.println(StaticVar.n1);
		
		//public이 아니라 private로 선언하면 StaticVar안에서만 사용가능
	}

}//class
