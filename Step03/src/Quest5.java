
public class Quest5 {
	/*
	 * 	1부터 100까지의 숫자들 중
	 *  7과 9의 배수를 출력
	 *  단, 7과 9의 공배수는 한번만 출력되게끔 처리
	 */
	
	public static void main(String[] args) {
		int i = 1;
		
		while(i<101) {
			i++;
			if(i%7==0) { // if(i%7==0 || i%9==0)으로 한번에 or로 묶을 수 있다.
				System.out.println(i);
			}else if(i%9==0) {
				System.out.println(i);
			}
		}
//		System.out.println(i++);도 가능하다. 
		
//		for(int i=1;i<101;i++) {
//			if(i%7==0 || i%9==0) {
//				System.out.print(i + " ");
//			}
//		}
//		
	
		System.out.println("----------------");
		
//1. 1~100까지의 정수들 중 4와 7의 배수를 출력하시오. 단 4와 7의 공배수는 한번만 출력하시오.		
		for (int j = 1; j < 101; j++) {
			if(j%4==0 || j%7==0) System.out.println(j);
		}
		
		
		
		
	}//main

}





