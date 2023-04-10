package lamda;

public class LamdaEx2 {
	public static void calc(int n1, int n2, Calcurator cal) { // 실행할 값과 기능을 넘겨주는 것
		System.out.println(cal.calc(n1, n2));
	}

	public static void main(String[] args) {
		calc(10, 20, new Calcurator() {

			@Override
			public int calc(int x, int y) {
				return x - y;
			}
		});
		
		// 곱해서 출력하는 기능을 람다식을 표현
		calc(4, 2, (a,b)->a*b);
//		Calcurator total = (a, b) -> a*b;		원래 2줄이었던 것을 위처럼 더 간단하게 한줄로 줄임
//		System.out.println(total.calc(10, 20)); 
		
		//calc(10, 20, new Calcurator() 익명클래스
		//calc(4, 2, (a,b)->a*b);		람다식
		
		
		
		//단점은 변수타입이 고정되어있다는 것. 지원이 필요함 -> 제네릭 
		//근데 추상메서드에 제네릭을 적용하는것이므로 인터페이스에 적용해둔것을 만들때 알려주면 된다.
		
		

	}// main

}
