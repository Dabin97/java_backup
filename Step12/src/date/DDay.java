package date;

import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		/*
		 * 오늘 날짜 기준으로 연말까지 며칠 남았는지 출력
		 * getTime, 밀리초(1000이면 1초)
		 */
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime()); 
		Date date = new Date(122, 11, 31);
		long A = (date.getTime() - now.getTime())/1000;//12월 31일 - 12월 5일
		long DDay = A / (24*60*60);
		
		System.out.println("12월 31일부터 12월 5일까지 " + DDay +"일 남았습니다.");
		
		//선생님 예제
		Date today = new Date(122,11,5); //아예 오늘 날짜를 넣으면 정확하게 나온다. 26일로
		System.out.println(today.getTime());
		Date end = new Date(122,11,31);
		System.out.println(end.getTime());
		
		System.out.println((end.getTime() - today.getTime()) / (1000 * 60 * 60 *24));
		
		
		
	}//main

}
