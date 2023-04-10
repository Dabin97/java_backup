
public class Final {
	/*
	 * 변수명 지을 때 이름 규칙
	 * 		1. 첫글자는 소문자로 시작
	 * 		2. 변수명은 알아보기 쉽게 짓기
	 * 		3. 합성어라면 두번째 단어부터는 첫글자를 대문자로 작성
	 * 			- 학생번호 ----> studentNumber
	 * 
	 * 상수명 지을 때 이름 규칙
	 * 		1. 모두 대문자로 작성
	 * 		2. 합성어일 경우 각 단어들 사이에 _로 연결
	 * 			STUDENT_MAX_COUNT
	 */
	public static void main(String[] args) {
		final double PI = 3.1415; //상수 선언 final
		System.out.println(3 * 3 * PI);
//		PI += 100; 상수로 선언이 되면 값을 바꿀수없다. 
		
		final int a; //값이 없을때는 설정이 불가능하다.
		a = 100;
//		a = 200; 최초에 한번만 저장할 수 있다. 
		System.out.println(a);
	}

}


//위키독스 기준으로 문자열까지의 수업분량 3-4