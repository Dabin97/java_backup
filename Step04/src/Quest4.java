
public class Quest4 {
	/*
	 *    ********* 9
	 * 	   *******  7
	 * 		*****	5
	 * 		 ***    3
	 * 		  *	    1
	 */
	public static void main(String[] args) {

//		//내 답안 
//		for(int i=0;i<5;i++) { 
//			for(int b=0;b<i;b++) {
//				System.out.print(" ");
//			}
//			for(int c=4;c>i;c--) {
//				System.out.print("*");
//			}
//			for(int a=5;a>i;a--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//선생님 답안
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) { //공백 증가
				System.out.print(" ");
			}
			for(int j=0;j<(5-i)*2 - 1;j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
			
		//j<(5-i)*2 - 1 홀수 만들기
		//(5-i)543210 * 2->10 8 6 4 여기에 -1씩 빼서 9 4 5 3 1 즉, 홀수로 별이 배치되도록 한다. 
	
	}

}
