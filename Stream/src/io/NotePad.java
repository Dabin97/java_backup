package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotePad {

	/*
	 *	파일명을 사용자로부터 입력받아서 파일을 생성한 후
	 *	사용자로부터 문자열을 입력받아서 입력받은 내용을
	 *	생성한 파일에 출력.
	 *	단 exit라는 단어를 입력하면 사용자로부터 입력 종료
	 *	오픈한 파일 역시 close 작업을 수행 
	 * 
	 * FileWriter, PrintWriter, Scanner
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null; 
		PrintWriter pw = null;
		
		System.out.print("파일명을 입력하세요 : ");
		String fileName = sc.nextLine(); //파일명 받기
		
		try {
			//1. 노드스트림 초기화 
			fw = new FileWriter(fileName +".txt");//받은 파일명 넣기, 뒤에 자동을 .txt가 붙도록 함
			pw = new PrintWriter(fw); //프로세스 스트림 초기화(선택)
			
			while(true) { //null이 아닐때만 돌린다.
			String str = sc.nextLine();
			if(str.equals("exit")) break; //exit가 나오면 종료 키워드를 while 안에 넣음
			pw.println(str);			  //입력받고
			pw.flush(); 				  //출력까지 while문 안에
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			pw.close(); //밑에 fw.close()를 하지않아도 이미 닫힘
		}
		System.out.println("프로그램이 종료되었습니다.");//finally 이후에 종료안내문 추가
		
		
	}//main

}

//				for (int i = 0; i < args.length; i++) {
//					if(fw.equals("exit"));
//				}

//			fw = new FileWriter("NotePad.txt",true);
//			if(fw.append("exit") != null) {
//				fw.close();
//			}
//if(fw.equals("exit")); fw.close(); 
//if(pw.equals("exit")) pw.close();//close 조건식을 어디에 넣어야하는지?
//				if(pw != null) pw.close(); 
//				if(fw != null) fw.close();