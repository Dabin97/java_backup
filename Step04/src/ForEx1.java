
public class ForEx1 {
	/*
	 * 		for(초기화;조건식;증감식){
	 * 			반복할 코드
	 * 		}
	 * 
	 */
	public static void main(String[] args) {
		int i;
		for(i=0;i<5;i++) { //초기값,조건식,증감식이 (괄호)안에 한번에 들어감. 세미콜론;으로 구분.
			System.out.println("Hello world");
		}
		//for->초기화 true->조건식->반복할 코드->증감식->다시 조건식->...
		// 증감식이 필요없으면 안써도 되지만, (초기화;증감식;) 세미콜론; 2개는 반드시 넣어야한다. 
	}

}
