package String;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello world");
		System.out.println(str);
		str.append(100); //뒤에 붙이기
		System.out.println(str);
		str.append("JAVA"); 
		System.out.println(str);
		//start 포함, end를 포함하지않음.
		str.replace(0, 8, "TEST");	//0부터 8까지 인덱스 내용을 바꾼다. 8번 인덱스는 바꾸지않는다. 7번 인덱스까지만 변경
		System.out.println(str);
		str.delete(5, 10); //5번 인덱스부터 10번 인덱스까지 지우겠다. 
		System.out.println(str);
	}
}
