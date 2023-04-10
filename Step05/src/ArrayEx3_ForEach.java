import java.util.Arrays;

public class ArrayEx3_ForEach {
	//새로운 for문 형태 
	//for each문
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int n : arr) {
			System.out.println(n);
			n++;
		}
		//arr로부터 데이터를 하나씩 뽑아서 n에 넣는다. 뽑을게 없으면 반복문이 끝남.
		// 다만, arr에서 복사해온 값이기 때문에 원본값에 영향을 미치지않는다. 
		
		System.out.println(Arrays.toString(arr));
		//자바 내에서 배열을 문자열로 쉽게 뽑는 방법
	}

}
