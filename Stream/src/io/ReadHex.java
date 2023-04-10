package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadHex {
//바이트단위로 읽어오기, 하나씩 출력해서 16개 넘으면 줄바꿈
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("data.dat");) {
			int data = 0;
			
			while (true) {
				data = fis.read();
				if(data == -1) break; //정수까지만
//				System.out.println(data+ " "); //본래식
				System.out.println(Integer.toHexString(data)+ " "); 
				//Integer.toHexString(data) 한 자리. 지정된 정수의 문자열 표현을 기수 16의 "부호 없는" 정수로 반환
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//main

}
