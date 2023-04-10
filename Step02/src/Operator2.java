
public class Operator2 {
/*
 * 복합대입연산자 : 연산 견과를 왼쪽에 있는 변수에 연산 후 저장(누적)(데이터를 누적하는 용도)
 * 		+=  -=  *=  /=  %=
 *	  (더해서 저장, 빼서 저장, 곱해서 저장 등등) 
 */
	public static void main(String[] args) {
		int n1=10, n2=7;
		int result = n1 + n2;
		
		System.out.println(result);
		
		result += 5; //result = result + 5
		System.out.println(result);
		
		result -= 7; //result = result - 7
		System.out.println(result);
		
		result *= 2; //result = result * 2
		System.out.println(result);
		
		result /= 3; //result = result / 3
		System.out.println(result);
		
		result %= 3; //result = result % 3
		System.out.println(result);
		
		
	}

}
