
public class VariableEx {
/*
 * 데이터 형태
 * 		정수 : 양수 음수 0
 * 		실수 : 정수에 소수점이 추가된 형태
 * 		문자 : 한 글자
 * 		논리 : 참(True), 거짓(False)
 * 
 *  변수(Variable) : 데이터를 하나 저장할 공간
 *  
 *  변수 선언 방법
 *  	변수타입 변수명;
 *  
 *  변수명 짓는 규칙
 *  	1. 변수명은 대소문자를 구분
 *  	2. 변수명은 중복 X
 *  	3. 변수명으로 쓸수있는 문자는 알파벳 대소문자, 숫자, _ , $
 *  	4. 변수명은 키워드와 동일하게 할 수 없음 (자주색 글자)
 *  	5. 변수명 첫글자로는 숫자를 쓸수가 없음.
 *  	   첫글자는 반드시 알파벳, _ , $만 가능하다. 
 */
	public static void main(String[] args) {
		int num; //num이라는 이름으로 정수형 데이터를 하나 저장할 공간을 임대 받았다. 
		// 초기화(initialize) : 변수를 만든 후에 데이터를 저장하는 행위
		num = 100; //100을 변수 num에 저장하겠다. 
		num = 200; //데이터를 추가하면 마지막에 저장된 것만 보관한다. 콘솔창에 200만 뜸
		System.out.println(num);
		
		//변수를 선언하자마자 초기화
		int age = 10;
		System.out.println(age);
		
		//정수형 변수 3개를 선언한 뒤 데이터를 각각, 10, 20, 30으로 초기화
		int n1 = 10, n2 = 20, n3 = 30;
		System.out.println(n1 +","+ n2 +","+ n3);
		
	}

}



