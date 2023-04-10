package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServer{
	
	private static class ThreadEcho extends Thread{ //inner class
		private Socket client;  //Socket타입의 client변수를 만든다.

		private ThreadEcho(Socket client) {
			this.client = client;
		}

		@Override
		public void run(){ //run 오버라이딩
			BufferedReader br = null;
			PrintWriter pw = null;

			try {
				pw = new PrintWriter(client.getOutputStream());
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				while (true) {
					String str = br.readLine();
					if (str.equals("exit")) break;
					pw.println(str);
					pw.flush();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(client.getInetAddress() + "에서 접속을 종료했습니다.");
		}
	}

	public static void main(String[] args) { //스레드 아래 메인
		ServerSocket server = null;

		try {
			server = new ServerSocket(1234);
			
			while(true) {	//여러명의 클라이언트를 받을거니까 while안에 넣는다. 
				System.out.println("클라이언트 접속 대기중...");
			Socket client = server.accept(); // 클라이언트가 접속할때까지 대기했다가 접속을 받음
			System.out.println(client.getInetAddress() + "에서 접속했습니다.");// 접속한 사람 아이피를 출력
			ThreadEcho echo = new ThreadEcho(client); //스레드 적용
			echo.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				if (server != null) server.close(); 
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}//main
}

//스레드를 메인 위에다가 private static class로 만들고, 아래 메인에 필요없는것을 지우고 적용한다. 
