package wrapper;
/*
 * Wrapper 클래스는 primitive 변수 타입을 reference 형으로 바꿀때 사용되는 클래스
 * 
 * Wrapper			primitive
 * Integer <------- int
 * Double  <------- double
 * Float   <------- float
 * Boolean <------- boolean
 * Character <----- char
 * 
 */
public class WrapperClass {
	public static void main(String[] args) {
		Integer n1 = new Integer(100);
		Integer n2 = 200;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1 + n2);
		
		//Wrapper 클래스 사용법
		System.out.println(Integer.MIN_VALUE); //최대값
		System.out.println(Integer.MAX_VALUE); //최소값
		System.out.println(Integer.BYTES); //바이트
		System.out.println(Integer.SIZE);  
		//문자열을 숫자로 변환
		System.out.println(Integer.parseInt("100")*2); //int 캐스팅
		System.out.println(Double.parseDouble("3.1415")+1); //Integer아니고 Double인거 유의
		
		
		int i1 = 100;
		//auto boxing (프리미티브->레퍼런스)
		Integer i2 =  i1;
		//auto unbox (레퍼런스->프리미티브)
		int i3 = i2;
		
		
		//1.5 이전 버전에서의 boxing, unboxing
		int i4 = 100;
		Object obj = 14;
		Integer i5 = (Integer) obj;
		Object val = i5;
		int i6 = (int) val;
		
		
		
		
		
	}//main
	
}
