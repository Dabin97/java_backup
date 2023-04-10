package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5/1);
			System.out.println(2);
			int[] arr = {1,2,3};
			arr[3]++;
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); //무엇에 에러가 났는지 알려주는 키워드
			System.out.println(4); //오류가 났을때 출력되는 부분
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); //어느 과정에서 오류가 났는지 빨간 글씨로 알려줌. 실행했던 과정을 스택에 쌓아놓고 하나씩 뽑아서 뿌려줌
			System.out.println(5); //오류가 났을때 출력되는 부분
		}catch (Exception e) {
			//모든 종류의 Exception을 처리하는 영역 (최후의 수단)
		}
		System.out.println(6);
		//if문처럼 맨 위에 있는 식부터 처리되기 때문에 먼저 처리해야하는 것을 젤위에 놓아야한다.
		
	}//main

}
