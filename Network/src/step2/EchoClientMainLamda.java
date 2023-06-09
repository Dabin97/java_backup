package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoClientMainLamda{

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(1234);
			while(true) {
				System.out.println("클라이언트 접속 대기중........");
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "에서 접속했습니다.");
				
				Thread thread = new Thread(()->{	//람다식
					try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
						PrintWriter pw = new PrintWriter(client.getOutputStream())){
						while(true) {
							String str = br.readLine();
							if(str.equals("exit")) break;
							pw.println(str);
							pw.flush();
						}//따로 위에 만들었던 스레드를 람다식으로 안에 적용한다.
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("클라이언트 접속 종료");
				});
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}//main
}
