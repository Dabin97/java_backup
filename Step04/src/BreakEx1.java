
public class BreakEx1 {
	/*
	 * break
	 * 		break를 직접 감싸고 있는 반복문 하나만 종료
	 */
	public static void main(String[] args) {
		int i=1,sum=0;
		
		while(true) {
			sum += i;
			i++;
			if(sum>5000)
				break;  //break를 감싼 반복문 '하나'만 멈춘다. 그리고 if문과 함께 나온다. 
		}
		System.out.println(sum);
	}

}
