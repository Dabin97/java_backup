package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class MyChatingServerMain {
	private static class ServerWorker extends Thread{
		private Socket client;
		
		public ServerWorker(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))){ //이것도 전역변수로 빼서 없어도됨. 일단 람다식이 아님
				while(true) {
					String str = br.readLine();
					if(str.equals("exit")) break;
					System.out.println(str); //이건 없어도됨
					//모든 호스트에게 메세지를 보내는 것을 만듦 - broadCastMessage : 호스트의 아이피랑 메세지를 출력
				}
			} catch (IOException e) {
				e.printStackTrace();
			} //<< finally를 만들어서 리스트에서 현재 work를 제거하고, 접속종료 메세지와 몇명 접속해있는지 출력한다. (몇명인지는 String.format을 활용한다.)
		}	
		//상대방에게 메세지를 받아서 출력만 하면 되니까 상대방이 메세지 보낸거를 받을때는 BufferedReader만 있으면 된다
		
		
		public void message() { 
			//<< 모르겟음, 추가메소드 (string str) 매개변수넣기 - 위의 broadCastMessage 메소드가 여기에 작성하는것임
			//for문을 돌면서 list.get(i).sendMessage(string);로 보낸다. 
			//sendMessage 라는 추가 메소드가 또 있다. 이건 받은 메소드 출력하는 기능
			BufferedReader br = null; //이것 2개를 아예 메소드말고 ServerWorker의 전역변수로 빼냄
			PrintWriter pw = null;

			try {
				pw = new PrintWriter(client.getOutputStream());
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				pw.println(client);
				pw.flush();
			
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
	}
	
	public static void main(String[] args) {
		ServerSocket server = null;
		//ServerSocket은 서버에서, Socket은 상대방 접속정보를 저장하기 위해서 씁니다
		try {
			
			ArrayList<ServerWorker> list = new ArrayList<ServerWorker>(); //<< 아예 private static으로 만들어야함
			//현재 접속중이 사람들의 정보를 다 가지고 있다. 
			
			server = new ServerSocket(1234);
			System.out.println("서버 오픈 완료"); //서버오픈과 포트번호 묶기
			
			while(true) {	//여러명의 클라이언트를 받을거니까 while안에 넣는다. 
			Socket client = server.accept(); // 클라이언트가 접속할때까지 대기했다가 접속을 받음
			System.out.println(client.getInetAddress() + "에서 접속했습니다.");// 접속한 사람 아이피를 출력
			ServerWorker worker = new ServerWorker(client); //스레드 실행(메세지 리턴 스레드)
			worker.start();
			list.add(worker);
			} //여러명 접속 받기 while문
			
//			try(Scanner sc = new Scanner(System.in);
//					PrintWriter pw = new PrintWriter(client.getOutputStream())){ //<<여기 오류
//				while(true) {
//					System.out.print("메세지 입력 : ");
//					String str = sc.nextLine();
//					pw.println(str);
//					pw.flush();
//					if(str.equals("exit"))break;
//					}
//				}catch (IOException e) {
//					e.printStackTrace();
//				} //양쪽에서 입출력이 이번엔 필요하지않다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}






