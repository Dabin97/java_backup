
public class WhileInWhile {

	public static void main(String[] args) { //(매개변수) 해당 영역이 끝나면 사라진다. 
		//구구단 2단부터 9단까지 출력
		
		int dan = 2;
		
		while(dan < 10) {
			System.out.println("------"+dan+"단------");
			int i = 1; //지역변수(local variable): 해당 영역이 끝나면 사라짐
			while(i<10) {
				System.out.println(dan + " * " + i + " = " + dan*i);
				i++;
			}
			dan++; // 안쪽 while문이 실행되고 나서야 dan이 추가된다. 
		}
//		System.out.println(i); 지역변수 i는 while의 {중괄호}안에서만 기능하고, 해당 영역 끝나면 메모리가 없어진다. 
//		전역변수, 끝날때까지 메모리를 계속 차지함. 
		
	}

}
