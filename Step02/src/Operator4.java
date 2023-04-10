
public class Operator4 {
/*
 *  관계연산자(비교연산자) ---> 부등식
 *  
 *  	>	<	>=	<= 	==	!=
 * 
 * 결과는 true, false로 나옴. (boolean)
 */
	public static void main(String[] args) {
		int n1 =10, n2 = 17;
		
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		System.out.println("----");
		boolean flag = n1 % 2 == 0; //짝수인가?
		System.out.println(flag);
	}

}
