package test03;
/*
클라이언트

    - 클라이언트는 서버에 접속을 한다.

    - 서버에 접속 후 사용자로 부터 필요한 로또 번호 셋트 개수를 입력 받음

    - 받은 개수를 서버로 전송함

    - 서버로 전송 후 받은 로또번호를 출력할 것.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			// 1. Server Connect - IP Address, port
			server = new Socket("127.0.0.1", 5000); // 127.0.0.1 = 내 아이피주소를 쓰겠다는 뜻
			// 2. Stream init
			pw = new PrintWriter(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));

			// 3. Data Send/Receive
			System.out.print("구매할 로또 번호 개수 입력 : ");
			String str = sc.nextLine();
			pw.println(str); //(ea가 int일때)ea + "" 하면 문자열이 된다. 
			pw.flush();
			
			for (int i = 0; i < Integer.parseInt(str); i++) {
				System.out.println(br.readLine());
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4.close
				if (pw != null) pw.close(); // 서버닫기전에 pw,br부터 닫는다.
				if (br != null) br.close();
				if (server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// main
}
