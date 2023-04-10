
public class Operator3_1 {

	public static void main(String[] args) {
		int n1 = 5, n2 = 3;
		int result = n1++ + 5 * ++n2 + n1;
		System.out.println(result); //5 + (5*4) + 5 == 30 (예상)
		// 31이 결과값, 뒤의 n1은 n1++된 값인 6이기 때문이다. 연산하나만 끝나도 증감된다.
		
		
	}

}
