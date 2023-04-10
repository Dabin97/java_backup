package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 1. 텍스트 파일 작성
 * 2. 텍스트 파일 읽기
 * 
 * 1 입력하면 NotePad에 만든 기능이 실행되게끔.
 * 2 입력하면 ReadTectFile에 만든 기능을 실행되게끔
 * 
 * 만들어져있는 두개의 기능을 합치는 클래스 작성
 */
public class NotePadFin {

	public static void write(Scanner sc) { //write 메소드
		FileWriter fw = null;
		PrintWriter pw = null;
		
		System.out.print("파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		
		try {
			fw = new FileWriter(fileName + ".txt");
			pw = new PrintWriter(fw);
			
			while (true) { 
				String str = sc.nextLine();
				if (str.equals("exit"))
					break;
				pw.println(str);
				pw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (pw != null)
					pw.close();
			}
			System.out.println("--작성이 종료되었습니다.--");
		}
	
		public static void read(Scanner sc) {  //read 메소드
			FileReader fr = null;
			BufferedReader br = null;
			
			System.out.print("읽어들일 텍스트 파일명을 입력하세요 : ");
			String fName = sc.nextLine();
			
			try {
				fr = new FileReader(fName + ".txt"); 
				br = new BufferedReader(fr);
				String str = null; 
					
				while ((str = br.readLine()) != null) {
					System.out.println(str);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // finally
			System.out.println("--출력이 완료되었습니다.--");
		}//read
		
	
	public static void main(String[] args) {  //메인
		Scanner sc = new Scanner(System.in); //스캐너는 프로세스 스트림이다. System.in
		
		while(true) {
		System.out.println("1. 텍스트 파일 작성");
		System.out.println("2. 텍스트 파일 읽기");
		System.out.println("0. 프로그램 종료");
		System.out.print("원하시는 번호를 입력하세요 : ");
		int no = sc.nextInt(); sc.nextLine();
		
		if(no == 1) 
			write(sc);
		else if(no==2)
			read(sc);
		else if(no == 0)
			break;
		}	
	}// main

}

//Integer.parseInt : 입력받은것이 문자이기 때문에 숫자로 받고싶으면, 숫자로 변환하는 parse를 사용하면 된다.
//클래스 안에 public static void write(Scanner sc) / public static void read(Scanner sc)를 먼저 만들고 그 아래 메인을 둔다
//메인 안에 선택지를 두고, Write와 Read안에 만들어둔 코드를 붙여넣기
//메서드들을 만들기 전에, 메인 안에 if문을 만들때 Write와 Read를 쓰면 퀵픽스로 자동으로 메서드를 만들수있다. 다만 private라서 public으로 변경해야함
