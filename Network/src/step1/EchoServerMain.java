package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			// 1.Server Open
			server = new ServerSocket(1234);
			// 2.Client Accept
			System.out.println("서버 오픈 완료... 사용자 접속 대기중...");
			Socket client = server.accept(); // 클라이언트가 접속할때까지 대기했다가 접속을 받음
			System.out.println(client.getInetAddress() + "에서 접속했습니다.");// 접속한 사람 아이피를 출력

			// 3. Stream init - 스트림 초기화

			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			// 4.Data Send/Receive
			while (true) {
				String str = br.readLine();
				if (str.equals("exit"))
					break;
				pw.println(str);
				pw.flush();
			} //선생님 답안

		} catch (IOException e) {
			e.printStackTrace();
			try {
				if (pw != null) pw.close(); //서버닫기전에 pw,br부터 닫는다.
				if (br != null) br.close();
				if (server != null)server.close(); 
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}//main

}
//			while (true) {
//				String str = br.readLine(); // br받는법- 한줄씩 입력받기
//				System.out.println("클라이언트가 보낸 메세지 : " + str);
//				pw.println(str);
//				pw.flush();
//				if (str.equals("exit")) {
//					System.out.println("서버 종료");
//					break;
//					}
//				}
//
//} catch (NullPointerException e) {
//	e.printStackTrace();
//} finally {