package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriteTest {

	public static void main(String[] args) {
		FileOutputStream fos = null; //OutputStream은 write나 read계열은 받을수없다.
		DataOutputStream dos = null;
			
		try {
			fos = new FileOutputStream("data.dat"); //노드스트림 프로세스스트림 모두 바이트단위로 만듦 (노드:byte,프로세스:char은 가능, 그 반대는 X)
			dos = new DataOutputStream(fos);
			
			int n = 100;
			double po = 3.1415;
			char ch = 'A';
			boolean flaf = true;
			
			dos.writeInt(n);
			dos.writeDouble(po);
			dos.writeChar(ch);
			dos.writeBoolean(flaf);
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(dos!=null)dos.close(); //close
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
	
	}//main

}
//실행하면 data.dat 파일이 나오는데 안에 이상한 글자만 있다.
