
public class VariableType {
/*
 * 		변수 타입
 * 			정수형 : byte(1) short(2) int(4) long(8)
 * 			실수형 : float(4) double(8)
 * 			문자형 : char(2)
 * 			논리형 : boolean(1)
 * 
 * 저장되는 구조는 똑같지만 크기가 다르다. (정수형의 4가지, 실수형의 2가지) 
 * 맨 앞의 비트는 부호비트(양수,음수)
 * 문자형 char은 부호비트가 없다. 모두 양수이다. A는 65 아스키코드값으로 컴퓨터가 인식한다.
 * 자바는 멀티바이트 기반이라 문자형char이 2바이트이다. 영어 알파벳은 1바이트, 한글은 3바이트
 * 논리형은 bit이지만 그냥 다른 변수타입과 비슷하게 1byte로 본다. 
 * float는 뒤에 F, long은 L이 붙는다. 
 */
	public static void main(String[] args) {
		long l = 100L; //그냥 100은 int, 100L은 long이 된다. 
		System.out.println(l);
		
		byte b = 127; //(byte는 -128부터 127까지만 저장된다.)(short와 byte는 long처럼 L을 붙이지 않아도 알아서 변한다.)
		System.out.println(b);
		
		double d = 3.1415;
		System.out.println(d);
		
		float f = 3.1415F; 
		// double인 3.1415뒤에 F만 붙이면 해결된다.
		//double->float는 넘쳐서 안된다. 반대는 가능, 이럴때는 형변환을 해주어야한다. 
		System.out.println(f);
		
		char ch1 = 'A'; //문자는 작은따옴표 ''
		int n =ch1;
		System.out.println(n); //'A'의 아스키코드값이 65이다. int 정수
		System.out.println(ch1);
		
		ch1 = 'a';
		n = ch1;
		System.out.println(n); //'a'의 아스키코드값이 97이다.
		System.out.println(ch1);
		
		ch1 = '가';
		n = ch1;
		System.out.println(n); //'가'의 아스키코드값이 44032이다.
		System.out.println(ch1);
		
		boolean bl = true;
		System.out.println(bl);
		bl = false;
		System.out.println(bl);
	}

}





