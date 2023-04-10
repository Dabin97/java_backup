package io;
//파일 읽어오기
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("hello.txt"); //hello.txt를 읽어오겠다.
			br = new BufferedReader(fr); //Reader계열만 받는다(문자)
			
			while(true) {
				String str = br.readLine(); //readLine :한줄씩 읽을 때, 따라서 엔터를 만날때까지 돈다
				if(str == null)
					break;
				System.out.println(str);
			}
		} catch (FileNotFoundException e) { //파일을 읽어들이는 클래스이므로 파일이 있는지 없는지부터 익셉션을 확인한다.
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close(); 
				//null을 체크하지않아도 된다. 그러나 fr에서 터져서 문제가 생겼을때를 대비하여 null체크는 해주는것이 좋다. 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
	}//main

} 
//Buffer란, 데이터를 한곳에서 다른 한곳으로 전송하는동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역, 모았다가 한번에 보내는것이 더 효율적이다.
