
public class Operator5 {
/*
 * 	논리 연산자 : 조건식을 두개 이상 사용하거나, 조건식의 결과를 반대로 뒤집을때 사용하는 연산자
 * 
 * 	AND --> &&
 *  OR  --> ||
 *  NOt --> !
 * 
 */
	public static void main(String[] args) {
		int n1 =10, n2 = 5;
//		System.out.println(5 < n1 < 10); 5 < n1을 먼저 연산하고 true가 나온다. true와 10을 비교할수없다.
		
//		▶AND 연산 : 조건식1 && 조건식2 --> 양쪽의 조건식의 결과가 둘다 true일때만 true가 되는 연산자
//							true	   true
		System.out.println(n1 > 5 && n2 < 10); //T + T == T
//							false		true
		System.out.println(n1 < 5 && n2 < 10); //F + T == F
//							false	  true	      true
		System.out.println(n1 < 5 && n2 < 10 && n1 != n2); //F + T + T == F
		// 먼저 연산해야하는 조건식이 있으면 (괄호)로 묶어둔다. 
		
//		▶OR 연산 : 조건식1 || 조건식2 --> 양쪽의 조건식의 결과가 하나라도 true면 true가 되는 연산자
//							true	 false
		System.out.println(n1 > 5 || n2 < 1); // T + F == T
//							true	 true
		System.out.println(n1 > 5 || n2 > 1); // T + T == T
		
//		▶NOT 연산 : !조건식 --> true -> false, false -> true
		System.out.println(!(n1 < n2)); //조건식을 괄호 안에 넣는다. 
		boolean result = true;
		System.out.println(!result); //변수앞에는 그냥 !를 붙여도된다. 
		
		
		
		
	}

}
