
public class WhileEx2 {
	/*
	 *	1~100까지 숫자를 더한 결과를 출력 
	 * 	5050
	 * 
	 */
	public static void main(String[] args) {
		int i = 1;
		int total = 0;
		
		while(i<101) {
			total += i;
			i++;
		}
		System.out.println(total);
		
		/* int i = 0일때는
		 * 조건식이 while(i<100)이 된다.
		 */
	}

}
