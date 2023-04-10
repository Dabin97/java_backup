package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadTest {

	public static void main(String[] args) {
		try(
			FileInputStream fis = new FileInputStream("data.dat");
			DataInputStream dis = new DataInputStream(fis);	
			){
				int n = dis.readInt();
				double d = dis.readDouble();
				char ch = dis.readChar();
				boolean b = dis.readBoolean(); //DataWriteTest에서 쓴 순서대로 써야한다. 순서가 다르면 터진다
				
				System.out.println(n + " " + d + " " + ch + " " + b);//아까 DataWriteTest에서 저장된게 나옴
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//다른 형식의 try catch 구조-자바8부터 지원함, 특징 : finally해서 close하지않아도 된다.
	}//main

}

// 위의 값들을 '레코드'라고 하고 이걸 묶은것이 파일이다. 레코드=행, 한줄단위로 묶인 한 건.
//이렇게 이진파일로 저장하는 이유는 데이터를 읽어오기 위해서이다.
