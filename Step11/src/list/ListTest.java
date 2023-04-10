package list;
//ArrayList와 LinkedList의 성능 측정
 
import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>(); // ArratList와 사용법은 같다.
		long start, end;

		start = System.nanoTime(); // 나노초세기

		for (int i = 0; i < 10000000; i++) {
			aList.add(i);//추가하기
		}

		end = System.nanoTime();

		System.out.println("ArrayList : " + (end - start)); //성능테스트 식
		// ---------------------------------------------------

		start = System.nanoTime();

		for (int i = 0; i < 10000000; i++) {
			lList.add(i); 
		} 

		end = System.nanoTime();

		System.out.println("LinkedList : " + (end - start));
		// ArrayList가 더 빠름. 빈번한 추가삭제는 LinkedList가 더 수월함.

		// -----------------------------------------------------
		/*
		start = System.nanoTime(); // 나노초세기

		for (int i = 0; i < 10000000; i++) {
			aList.get(i);  //꺼내기
		}

		end = System.nanoTime();

		System.out.println("ArrayList : " + (end - start));
		// ---------------------------------------------------

		start = System.nanoTime();

		for (int i = 0; i < 10000000; i++) {
			lList.get(i);
		}

		end = System.nanoTime();

		System.out.println("LinkedList : " + (end - start));
		// 데이터 탐색은 압도적으로 ArrayList가 더 빠름
		//LinkedList 확실히 탐색용으로는 사용하지않음
		*/
		start = System.nanoTime(); // 나노초세기

		aList.add(7544350, 100);//중간에 끼어넣기
		aList.remove(3544350); //삭제

		end = System.nanoTime();

		System.out.println("ArrayList : " + (end - start));
		// ---------------------------------------------------

		start = System.nanoTime();

		lList.add(7544350, 100); 
		lList.remove(3544350);

		end = System.nanoTime();

		System.out.println("LinkedList : " + (end - start));
		//탐색할때처럼 확 크게 차이가 나지않음. ArrayList 더 빠름
	}

}
