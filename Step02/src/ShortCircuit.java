
public class ShortCircuit {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		
//							F	 and  21  == 10(F)
		boolean result = n1 != 10 && ++n2 == 10;
		System.out.println(result); //F+F=F false
		System.out.println(n2); // 21(예상) 20(결과값)
		// 이미 n1 != 10 && 조건식1이 F라고 판명이 났기 때문에 조건식2를 읽지않고 바로 F처리해버린다.
		//이런 문제때문에 조건식에 증감연산자를 잘 쓰지않는다.
		// 만약 조건식1&&조건식2에서 조건식1이 T이면 뒤의 증감연산자를 계산한다. 
		
//					T	  or   21 == 10(F)
		result = n1 == 10 || ++n2 == 10;
		System.out.println(result); //T or F = T
		System.out.println(n2); // 20(결과값) 연산자 뒤의 조건식2가 먹히지않았다. 
		
	}

}
