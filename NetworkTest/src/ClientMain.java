import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);
		try {
			server = new Socket("127.0.0.1", 5000);

			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			pw = new PrintWriter(server.getOutputStream());

			System.out.print("구매할 로또번호 개수 입력 : ");
			int ea = sc.nextInt();

			pw.println(String.valueOf(ea)); //int를 String으로 바꾸는 식 String.valueOf
			pw.flush();

			String result = br.readLine();
			
//			String[] arr = result.split("\t"); //배열로 .split 사용, \t를 기준으로 자르겠다.
//			for(String r : arr)
//				System.out.println(r);
			System.out.println(result.replaceAll("\t", "\n")); //문자열 바꾸기 .replaceAll (step11-string), 탭을 줄바꿈으로 바꾸겠다

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (pw != null) pw.close();
				if (server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}