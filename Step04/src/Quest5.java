
public class Quest5 {
	/*
	 *  구구단은 2단~9단까지 출력
	 *  단, 짝수단만 출력
	 *  출력할 구구단은 단까지만 곱한 결과를 출력
	 *  
	 *  2 * 1 = 2
	 *  2 * 2 = 4
	 *  4 * 1 = 4
	 *  4 * 2 = 8ㄴ
	 *  4 * 3 = 12
	 *  4 * 2 = 16
	 *  ...
	 *  8 * 8 = 64
	 *  
	 *  break와 continue 사용해서 구현
	 *  
	 */
	public static void main(String[] args) {
		
		for(int dan=2;dan<10;dan++) {
			if(dan % 2==1) //홀수는 넘기기
				continue;
			for(int i=1;i<10;i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
				if(dan==i) //2 * 2 = 4만 나오게 , 같으면 끝내도록 하는 if문
					break;}
		}
	} //구구단은 단부터 반복문을 돌리고, 그 안에서 곱할 i의 for문을 돌린다.
	  //i를 하기전에 if문을 넣어서 짝수단만 나오도록 하고, 
	  //i의 for문을 돌리는데, 조건문 아래는 실행할 문장->그리고 if문과 break
}
