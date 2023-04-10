package io;

//파일 읽어오기
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 금일 과제 파일명을 입력 받아서 해당 파일에 있는 내용을 전부 읽어와서 출력하는 코드를 작성하세요. (실행해보니까 문자열로 이루어진 txt파일만 출력됨)
public class ReadTextFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		BufferedReader br = null;
		
		System.out.print("읽어들일 텍스트 파일명을 입력하세요 : ");
		String fName = sc.nextLine(); 
		
		try {
			fr = new FileReader(fName + ".txt"); //".txt"를 붙이면 훨씬 편하다 
			br = new BufferedReader(fr);
			String str = null;  //str을 밖에 선언
			
			while(true) {  
				str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			} //ppt참고 그러나 위의 fName은 그냥 간단하게 fr = new FileReader(sc.nextInt());로 해도 될거같음 
			
	   /* 또다른 while문
		* while((str = br.readLine() != null)) {
		* 		System.out.println(str);
		* }
		*/
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
	}//main

}
