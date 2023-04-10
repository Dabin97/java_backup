package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {
	private static class ServerWorker extends Thread{
		private Socket client;
		
		public ServerWorker(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))){
				while(true) {
					String str = br.readLine();
					if(str.equals("exit")) break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		//상대방에게 메세지를 받아서 출력만 하면 되니까 상대방이 메세지 보낸거를 받을때는 BufferedReader만 있으면 된다
	}
	
	public static void main(String[] args) {
		ServerSocket server = null;
		//ServerSocket은 서버에서, Socket은 상대방 접속정보를 저장하기 위해서 씁니다
		try {
			server = new ServerSocket(1234);
			System.out.println("서버 오픈 완료");
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "에서 접속을 하였습니다.");
			
			ServerWorker worker = new ServerWorker(client); //스레드 실행(메세지 리턴 스레드)
			worker.start();
			
			try(Scanner sc = new Scanner(System.in);
					PrintWriter pw = new PrintWriter(client.getOutputStream())){
				while(true) {
					System.out.print("메세지 입력 : ");
					String str = sc.nextLine();
					pw.println(str);
					pw.flush();
					if(str.equals("exit"))break;
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}






