package method;

import java.util.Arrays;

public class MethodParameter {
	public static int[] addArray(int[] arr) { //배열을 매개변수로 선언,껍데기만 넣는다. 값이나 길이가 아니라 메모리주소만 받는다. 
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}
		return arr; //int[]로 바꿈.
	}//addArray = Call by Reference
	
	public static int totalNumber(int...arr) {  //'...'은 매개변수를 써서 데이터를 받아오는데 몇개 받아올지 모를때 사용.
		int sum = 0;							// 상대방이 넣은 여러개의 값을 배열로 받겠다.라는 뜻. 단, 값을 배열로 보내면 안된다. 
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;								
	}//totalNumber
	
	public static void addNumber(int n) {
		n += 1;   //값을 복사해서 가져왔기때문에 여기서 끝나면 값이 사라진다. 
	}//addNumber = Call by Value
	
	
	public static void main(String[] args) {
		int[] arr =  {1,2,3,4,5};
		System.err.println(arr);
		System.out.println(Arrays.toString(arr));
		int[] temp = addArray(arr); //배열로 받기 
		System.out.println(temp); //temp = arr 같은거(콜바이레퍼런스)
		System.out.println(Arrays.toString(arr)); //addArray(arr)을 하고 출력하면 모든 배열의 값들이 +1씩 증가하였다. 
		
		int n = 10;
		System.out.println(n);
		addNumber(n);
		System.out.println(n); //똑같이 함수를 만들고 적용했지만 값이 바뀌지않는다. 
		
		int r = totalNumber(1,2,3,4,5,6);
		System.out.println(r);
//		r = totalNumber(arr,1,3,5); 배열을 보내면 배열만 보내야함
//		System.out.println(r);
		
		
		//그 이유는 두 함수가 받는 방식이 다르기 때문이다.
		// Call by Value(값) & Call by Reference(메모리주소) - 일을 시키는 방식
		// 레퍼런스 = 메모리주소, 참조 / 밸류 = 값
		//addArray에서는 메모리주소를 보냄. addNumber는 값을 복사해서 보낸다. 복사해서 보냈기때문에 원본은 그대로이다. 
		// 레퍼런스형 타입들을 매개변수로 보내면 복사해서 넘어가는것이 아니라, 저장된곳의 위치(메모리주소)를 보낸다.
		// 주소를 알면 연결된 값을 변경할 수 있기 때문에 i++이 된 것이다. 장점이지만 바꾸면 원본도 바뀐다는 단점도 있다. 
		//new가 들어가면 무조건 레퍼런스 타입이다. 메모리할당됨. 
		// 하나로 묶고 return - 랩핑- 클래스 하나에 변수를 다 묶어두고 다른쪽으로 보내는 형식
		// 작업하고 바로 데이터를 넘길때 - 콜바이레퍼런스
		// 원본은 해치지않고 복사한 데이터를 받아서 후 처리 해야할 때 -  콜바이밸류
		
	}//main

}
