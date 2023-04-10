package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionWriter {

	public static void main(String[] args) {
		try {
			throw new Exception("Exception 발생");
		} catch (Exception e) {
			try(FileWriter fw = new FileWriter("exception.txt");
				PrintWriter pw = new PrintWriter(fw);){
				e.printStackTrace(pw); 			//e.printStackTrace : 프린트스트림 오버라이딩. 알아서 연결
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
		}
		
		//화면에서 빨간 글씨로 보던것을 "exception.txt" 이라는 파일에 텍스트로 출력하는 기능
	}//main

}
//FileInputStream와 FileWriter의 차이 :
//Stream은 바이트 단위, Writer는 char 단위로 입출력
// 기능을 똑같은데 단위에 따라 달리 사용, .txt 파일을 만들때는 FileWriter 사용