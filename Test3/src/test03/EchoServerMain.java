package test03;

/*
 * 서버

    - 서버는 포트번호 5000을 지정하여 서버를 오픈한다.

    - 클라이언트로 부터 숫자 하나를 받아서 해당 숫자 만큼 로또 번호 셋트를 생성한다.

    - 생성한 로또번호를 클라이언트에게 전송한다.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class EchoServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			// 1.Server Open
			server = new ServerSocket(5000);
			// 2.Client Accept
			System.out.println("서버 오픈 완료... 사용자 접속 대기중...");
			Socket client = server.accept(); // 클라이언트가 접속할때까지 대기했다가 접속을 받음
			System.out.println(client.getInetAddress() + "에서 접속했습니다.");// 접속한 사람 아이피를 출력

			// 3. Stream init - 스트림 초기화
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			// 4.Data Send/Receive
			String str = br.readLine();
			for (int i = Integer.parseInt(str); i >= 1; i--){
				//로또번호 생성
				ArrayList<Integer> list = new ArrayList<Integer>();
				int n = Integer.parseInt(str);
				while (list.size() < 6) {
					n = (int) (Math.floor(Math.random() * 45) + 1); 
					if (list.contains(n))
						continue;
					list.add(n); 
				}
				System.out.println(i+"set : "+list); //확인용
				
				pw.println(i+"set : "+list);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			try {
				if (pw != null) pw.close(); 
				if (br != null) br.close();
				if (server != null) server.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}// main
}
