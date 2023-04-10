
public class Quest9 {
/*
 * 대문자 A~Z 까지 출력
 * 출력하는 형식
 * A - 65
 * ....
 * Z - 90
 * 
 */
	public static void main(String[] args) {
		
		for(int i=65;i<91;i++) {
			System.out.println((char)i + " - " + i);
		}
		System.out.println("--------------------------");
		
		//char로 출력하기
		char ch = 'A';
		while(ch <= 'Z') {
			System.out.println(ch + " - " + (int)ch);
			ch++;
		}
	}

}
