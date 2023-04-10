import java.util.Arrays;

public class ArrayQuest4 {
	
	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();	
		//arr에 저장된 문자열이 알파벳인 경우 전부 대문자로 변경후 출력
		//HELLO WORLD
		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]>96 && arr[i]<123) {
//				arr[i] = (char)(arr[i]-32);
//			}
//		} 아스키코드값으로 바꿨을때, (char)로 형변환시켜줘야한다. 
//		처음엔 i = i-32;라고 했는데 이러면 적용이 안된다. arr[i-32]도 인덱스번호만 바뀌는 것이기때문에
//		arr[i]에 -32를 해줘야 적용된다. 
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i]<='z') {
				arr[i] -= 32;
			}
		}//'a'로 하면 형변환없이 사용가능
		System.out.println(Arrays.toString(arr));
		
		
	}//main

}

//32
