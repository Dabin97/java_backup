
public class Quest3 {
	/*
	 * 					*   *		*
	 * 				   **	*	   *
	 * 				  *** < *     *
	 * 				 ****	*    *
	 * 				*****	*   *
 	 * 
	 */
	public static void main(String[] args) {
//		
//		for(int i=0;i<6;i++) {
//			for(int a=5;a>i;a--) {
//				System.out.print(" ");//a는 띄어쓰기 갯수, 맨 윗줄의 띄어쓰기가 최대 4개이므로 a=5, i줄이 늘어날수록 띄어쓰기가 줄어드는 구조
//			}
//			for(int b=0;b<i;b++) {//b는 *의 갯수, 0에서 5줄이 될때까지 *을 하나씩 늘리는 구조
//				System.out.print("*");
//			}
//			System.out.println();//줄바꿈
//		}
//		//맨 처음 띄어쓰기는 5개, a=5, i가 12345로 올라갈수록 a를 하나씩 감소시킨다.
//		//맨 처음 띄어쓰기만 5개이기 때문에(a=5) 맨 처음줄에 *은 0개이다. b=0; i에 따라 b도 하나씩 증가
//		
//		//case2
//		public static void main(String[] args) {
//			for(int a=0 ;a<6; a++) { //5회까지 반복 for문
//				for(int b=5 ;b>0; b--) { //b는 띄어쓰기도 *도 가능한 변수
//					if(a < b) { //가장 바깥의 for문이 돌수록 a가 커지기 때문에 최종적으로 *로 다 차게된다. 
//						System.out.print(" ");
//					}else
//						System.out.print("*");
//				}
//				System.out.println();
//			}
//			
	//선생님 답안
		for(int i=0;i<5;i++) { //i<5는 5줄이 나온다. 아마도 0을 포함해서 5까지 하면 6카운트이기때문인듯 결국 5줄이 나온다. 
			for(int j=i;j<4;j++) { //for(int j=0;j<4-1;j++)가능
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}//바깥 for
			
	}//main
}
