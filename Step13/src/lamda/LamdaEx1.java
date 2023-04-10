package lamda;

import java.util.Iterator;

public class LamdaEx1 {
	
	public static void main(String[] args) {
		//Calcurator 익명클래스로 만들어서 덧셈을 하는 기능을 작성
		Calcurator puls = new Calcurator() { //새로운 변수명
			
			@Override
			public int calc(int x, int y) {
				return x + y; 				//연산결과는 리턴에 넣기
			}
		};
		//실행 결과 출력
		System.out.println(puls.calc(10, 20));	
		//변수.calc()실행 /람다식은 이것이 한줄이 된다. 간단하고 편하지만 한개만 가능하다는 단점이 있다.
		
		//<람다식> - 1번째 유형
		Calcurator minus = (a,b) -> a-b; 
		System.out.println(minus.calc(5, 6)); 
		//(매개변수) -> 계산식; 계산식 앞에는 return이 생략됨
		//결과값을 받을 return이 없다.
		//(a,b)는 변수타입이 없는 매개변수이다. 위의 (int x, int y), 매개변수가 없으면 ()만 쓰면 됨
		//-> 본체 계산식, 한줄짜리이면 리턴이 자동으로 들어가있다.
		
		
		//<람다식> - 2번째 유형
		Calcurator total = (a,b) -> { //여러줄 이상이면 {중괄호}를 쓴다.
			int sum = 0;
			for (int i=0; i<=b; i++) 
				sum += i;
			return sum;		//여러줄은 return을 넣는다.
		};//중괄호끝에;주의
		System.out.println(total.calc(1, 100));
		
		
		
		
		
	}//main
}
