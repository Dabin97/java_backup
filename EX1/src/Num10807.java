
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10807 {
	//Exception 발생 시에 따로 해야할 작업이 없으므로
	//입력에 대한 모든 예외(IOException을 main에 throws 해준다.
	public static void main(String[] args) throws IOException {
		
		//node stream을 system으로 잡아 사용자에게 입력을 받고, 그 값을 바로 읽는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//첫 줄에 입력되는 정수의 개수를 받기 위한 변수. //Integer.parseInt : String타입의 숫자를 int타입으로 변환
		//StringTokenizer 또는 String.split()을 사용해도 전혀 쓸 일이 없다.
		int num = Integer.parseInt(br.readLine());
		
		//split()과 기능은 비슷하나, 자동으로 positioning을 해주기 때문에
		//제어변수를 따로 더 선언하지 않아도 된다. while문으로 쓰기에 용이
		//현재 주어지는 숫자를 문자열로 읽고, 공백으로 문자열을 나누며, 나눈 문자열은 포함하지 않는다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
		
		
		//찾아야 할 정수를 입력받기 위한 변수
		int find = Integer.parseInt(br.readLine());
		//find와 같은 숫자가 등장하는 횟수를 count 해줄 변수
		int count = 0;
		
		//인스턴스 st에 토큰(잘려진 문자열)이 더 존재하는지를 통해 while문 반복
		while (st.hasMoreTokens()) {
			//찾아야 하는 정수와 잘려진 문자열을 정수로 형변환 한 값이 같을 때 count 증가.
			if (find == Integer.parseInt(st.nextToken())) {
				count++;
			}
		}
		//출력
		System.out.println(count);
	}
}
