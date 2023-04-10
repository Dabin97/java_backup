package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			// 1. Server Connect - IP Address, port
			server = new Socket("127.0.0.1", 1234); // 127.0.0.1 = 내 아이피주소를 쓰겠다는 뜻
			// 2. Stream init
			pw = new PrintWriter(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			// 3. Data Send/Receive
			pw.println("Hello World");
			pw.flush();
			System.out.println(br.readLine());// 서버가 보낸거 읽어들이기

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//4.close
				if (pw != null) pw.close(); //서버닫기전에 pw,br부터 닫는다.
				if (br != null) br.close();
				if(server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}//main

}
