package test;

public class TestMain {

	public static void main(String[] args) {
		System.out.println((int)'\r' + " " + (int)'\n');
		IOTest io = new IOTest();
		System.out.println(io.readline());
//		io.println("안녕하세요");
	}

}

//System.out.println('\r' + " " + '\n'); \r = 13 , \n = 10
//따라서 IOTest 중 message = String.copyValueOf(buffer, 0, idx-2); 여기서 idx-2를 했다.