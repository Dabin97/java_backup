package io;
//파일 쓰기
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteMain {

	public static void main(String[] args) {
		FileWriter fw = null; //전역변수로 밖에 꺼낸다.
		PrintWriter pw = null;
		try {
			//1. 노드스트림 초기화 (물리적인 연결)
			//저장할 파일경로, 추가모드
			fw = new FileWriter("hello.txt",true);//Stream 파일을 새로고침하면 Hello.txt라는 파일이 생성된다.
			//2. 프로세스 스트림 초기화(입출력에 관련된 부가기능,노드스트림+)
			pw = new PrintWriter(fw);
			//3. 출력
			pw.println("Hello World");
			pw.println("안녕하세요");
			pw.flush(); //출력하는 방법
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//fw를 try안에 선언하면 close가 활성화 되지않는다. 
			try {
				//4. close
				if(pw != null) pw.close(); //pw먼저 하고 fw를 한다. 생성 순서 역순으로 close
				if(fw != null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}//finally
		
	}//main

} 
