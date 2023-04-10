package exception;
//사용자 정의 Exception

public class UserException extends Exception{ //Exception을 상속받고

	public UserException(String message) {	  //기본생성자는 String만 만든다.
		super(message);						  //에러메세지만 받는것
	}

	
}//class
