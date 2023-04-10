package method;

public class Calcurator {
	int n1;
	int n2;
	
	void init(int a, int b) {
		n1 = a;
		n2 = b;
	}
	
	int plus() {
		int result = n1 + n2;
		return result;
	} // n1 + n2한 값이 리턴하여 int plus()안으로 들어간다. 
	  // return 변수; 리턴 옆의 변수타입과 int plus() 이곳의 변수타입이 언제나 동일해야한다. 
 	
	
	//뺄셈 결과 리턴하는 메서드
	int minus() {
		return n1 - n2;  //return 하고 바로 식을 써도된다. 
	} 					 // 변수타입이 void가 아니면 반드시 return이 나와야한다. 
	
	//곱셈 결과 리턴하는 메서드
	int multiple() {
		return n1 * n2;
	}
	//나눗셈 결과 리턴하는 메서드
	int divisor() {
		return n1 / n2;
	}
	
	
	//숫자 두개를 매개변수로 받아서 두 숫자 중 큰 숫자를 리턴하는 메서드
	
	int max(int a,int b) { //바로 매개변수를 넣기
		if(a>b) {
			return a;
		}else {return b;}  //리턴은 2개이상도 가능 단,실행이 안되면 오류로 뜬다.
	}
	
	//숫자 두개를 매개변수로 받아서 두 숫자 중 작은 숫자를 리턴하는 메서드
	int min(int a,int b) {
		if(a<b) {
			return a;
		}else {return b;}
		 
	}
	
	
	
}//class

/*
 변수타입 매서드명(매개변수){
	해야될 일;
	return 변수;
}

Void 변수타입 : 직접적으로 저장못함. 나는 저장할수있는 형태가 없다 라는 뜻. byte 0
return : 일을 시킨 사람에게 결과값을 되돌려주는 것, 리턴 옆의 변수값을 보낸다. 

*/