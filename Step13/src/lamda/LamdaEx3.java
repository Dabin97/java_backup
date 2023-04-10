package lamda;

public class LamdaEx3 {

	public static void main(String[] args) {
		Method<String> m1 = (a) -> System.out.println(a);
		m1.run("Hello");
		//아까 한줄짜리에는 리턴이 생략되어있다고 했는데, 이 식에는 리턴이 없다. 그 이유는 Method의 추상메소드에 리턴이 없기때문이다.
		
		//정수 - 제곱의 결과 출력
		Method<Integer> m2 = (n) -> System.out.println(n*n); //계산식을 바로 적는다.
		m2.run(100); //값 입력
		
		//실수 - 원넓이 결과 출력 (r*r*3.1415)
		Method<Double>m3 = (b) -> System.out.println(b*b*3.1415);
		m3.run(4.14); //값이 double이 아니면 오류가 난다.
	}

}
