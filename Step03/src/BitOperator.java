
public class BitOperator {

	public static void main(String[] args) {
		int n1 =13, n2 = 7;
		//n1 = 0000 0000 0000 0000 0000 0000 0000 0000 1101
		//n2 = 0000 0000 0000 0000 0000 0000 0000 0000 0111
		
		//bit and operator : &  둘다 1일때만 1
		System.out.println(n1 & n2); //0101 -> 5(1101 + 0111)
		//비트연산자는 논리연산자와 구분하기 위해 &가 하나만
		
		//bit or operator : |  둘 중에 하나라도 1이면 1
		System.out.println(n1 | n2); //1111 -> 15
		
		//bit xor operator : ^ 서로 다른때만 1
		System.out.println(n1 ^ n2); //1010-> 10
		
		//bit not operator : ~  1과 0을 뒤집음
		System.out.println(~n1); //-14
		
		
		
		//l-shift operator
		System.out.println(n1 << 1);
		System.out.println(n1 << 2);
		System.out.println(n1 << 3);
		// 땡겨서 자리가 없어진 맨왼쪽은 없앤다. 왼쪽으로 밀어서 자리가 난 맨 오른쪽은 0을 넣는다.
		// 왼쪽으로 1칸씩 밀때마다 2씩 곱한다. 
		
		System.out.println(n1 >> 1);
		System.out.println(n1 >> 2);
		System.out.println(n1 >> 3);
		// 오른쪽으로 1칸씩 밀때마다 2씩 나눈다. 이 둘은 부호비트는 밀지 않는다. 부호비트를 밀려면 >>> 3개씩 쓴다. 
				
	}
}
