
public class WhileEx1 {
	/*
	 *  While(조건식){
	 *  	반복할 코드1
	 *  	반복할 코드2
	 *  	반복할 코드3
	 *  	...
	 *  }
	 * 
	 * 	 while문은 조건식이 true이면 {실행한 영역} 코드를 반복한다.
	 * 	 조건식이 false면 반복을 멈춘다. 
	 * 
	 */
	public static void main(String[] args) {
		int i = 0; //초기값
		
		while(i<5) { //조건식
			System.out.println("Hello world");
			i++; //증감식
			}
		
		/* int i = 5;
		 * while(i>0) { //(i!=0) 조건식도 가능
			System.out.println("Hello world");
			i--; 
			}
		 * 
		 */
	}

}
