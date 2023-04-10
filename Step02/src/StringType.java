
public class StringType {

	public static void main(String[] args) {
		String str  = "Hello World";
		System.out.println(str);

		String str1 = "Exit";
		String str2 = new String("Exit");
		String str3 = str1;
		
		//문자열이 저장되어있는 메모리 주소로 비교, 내용으로 비교하지 X
		System.out.println(str1 == str2); //false
		System.out.println(str1 == str3); //true
		System.out.println(str2 == str3); //false
		//str1은 EXIT라는 값이 들어간 메모리 주소값을 저장하고있다. 
		//str2도 new String으로 EXIT가 들어갈 새로운 메모리 주소값을 저장했다.
		//str3은 str1의 동일한 메모리 주소값을 저장한다. 
		//메모리위치 주소값을 비교하는 것이므로 false가 나온다. 
		
		//문자열 내부 내용으로 비교할려면 equals를 사용
		System.out.println(str1.equals(str2)); 
		
	}
}
