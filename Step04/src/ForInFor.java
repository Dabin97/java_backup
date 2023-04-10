
public class ForInFor {
	/*
	 * 숫자 하나를 입력받은후
	 * 입력한 숫자에 해당하는 구구단을 출력
	 * 
	 * 숫자 입력 : 2
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * ...
	 * 2 * 9 = 18
	 */
	public static void main(String[] args) {
			for(int dan=2;dan<10;dan++) {
				System.out.println("------"+dan+"단------");
				for(int i=1;i<10;i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
				} 
			}
	
	}

}
