package date;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //Calendar는 추상클래스라서 new를 할수없다.
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.YEAR)); 
		//.get을 하면 int타입만 뜨는데, 그걸 선택하고 그 안에 Calendar.하면 상수로 지정된 필드들이 보인다. 필요한것을 취사선택
		System.out.println(calendar.get(Calendar.MONTH)); 
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); 
		System.out.println(calendar.get(Calendar.AM_PM)); 
		System.out.println(calendar.get(Calendar.HOUR)); 
		System.out.println(calendar.get(Calendar.MINUTE)); 
		System.out.println(calendar.get(Calendar.SECOND)); 
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); 
		//요일은 1부터 들어간다. (월은 0부터 시작)(다만 언어마다 다르기 때문에 체크가 필요)
		
		//day는 일 하나만 뽑을때, 다같이 출력할때는 date를 주로 사용
		calendar.set(Calendar.YEAR, 2023); //여기서 연도를 쓸때는 2023년 이렇게 정확하게 쓴다.
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DATE, 40); //날짜가 31을 벗어나면 자동으로 다음 연도로 넘어간다. 
		System.out.println(calendar.getTime());
		calendar.set(Calendar.MONTH, 40); //월도 허용치를 넘어가면 자동으로 그만큼 날짜를 올려준다. 
		System.out.println(calendar.getTime());
		
		
		
	}

}
