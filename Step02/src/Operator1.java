
public class Operator1 {
	/*
	 * 사칙연산자
	 * 		덧셈 			+
	 * 		뺄셈			-	
	 * 		곱셈			*
	 * 		나눗셈 몫 		/
	 * 		나눗셈 나머지  %
	 * 
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언 후 임의 값으로 초기화
		int n1=10, n2=7;
		int result = 0; //변수를 선언하면 언제나 초기화
		
		//n1과 n2의 덧셈결과를 result에 저장, n1,n2의 값은 안바뀜, 원본이 아니라 기존에 있던 값을 복사해온것
		result = n1 + n2;
		System.out.println(result);
		result = n1 - n2;
		System.out.println(result);
		result = n1 * n2;
		System.out.println(result);
		result = n1 / n2;
		System.out.println(result);
		result = n1 % n2;
		System.out.println(result);
		
		// 변수선언->계산->출력
		// 정수 + 정수 = 정수(연산), 똑같은 타입만 나옴
		
//		double n3 = 3.211, n4 = 1.1244;
//		double Result = 0; 
		float n3 = 3.2114F, n4 = 1.1244F; //뒤에 F를 붙이면 float 가능
		float Result = 0; //0? 0.0? 둘다 상관없음. 0이라고 써도(int) 알아서 double으로 바뀐다.
		
		Result = n3 / n4;
		System.out.println(Result);
		Result = n3 % n4;
		System.out.println(Result);
		
		
	}

}
