package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFomatMain {

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance(); //Calendar는 추상클래스라서 new를 할수없다.
//		cal.set(Calendar.MONTH, 4);
		//날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy"); //연도 4자리
		System.out.println(sdf.format(cal.getTime())); //현재 날짜+시간에서 yyyy 연도만 꺼낸다.
		sdf.applyPattern("yy"); //연도 2자리
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("MM"); //월 2자리, 위에서 set으로 5월을 넣어줬더니 05로 출력된다. 
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("M"); //월 1자리, 위에서 set으로 5월을 넣어줬더니 5로 출력된다. 
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("MMM"); //월 3자리, 로컬형식 월 : 5월로 출력(한글, 다른 나라에서는 영어로 나옴,3개가 약자, 4개가 풀네임) 
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("MMMM"); //로컬형식 월 , 다른 나라에서는 영어로 나옴, 3개가 약자, 4개가 풀네임 
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("dd"); //일 2자리, 일은 소문자d로 쓴다ㅏ.
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("d"); //일 1자리 
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("E"); //요일 1자리(로컬형식)
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("EEE"); //요일 약자 (영문으로 3자리) ---> 로컬 형식 한글X
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("EEEE"); //요일 4자리 풀네임 (영문이면 영문풀네임) ---> 로컬 형식 한글X
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("H"); //시간 1자리 : 24시 기준
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("HH"); //시간 2자리 : 24시 기준
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("m"); //분 1자리 , 소문자m
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("mm"); //분 2자리 
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("s"); //초 1자리 소문자s
		System.out.println(sdf.format(cal.getTime())); 
		sdf.applyPattern("ss"); //초 2자리 
		System.out.println(sdf.format(cal.getTime())); 
		
		//2022-12-05 12:35:55
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		//2022년 12월 05일 12시 35분 55초
		sdf.applyPattern("yyyy년 MMM dd일 HH시 mm분 ss초"); //MM월도 가능
		System.out.println(sdf.format(cal.getTime()));
		
		sdf.applyPattern("yyyy_MM_dd_HH_mm_ss"); //_로 쪼갬
		System.out.println(sdf.format(cal.getTime()));
		
		//문자열을 날짜로 바꾸는 부분
		Date c = sdf.parse("2022_05_05_12_48_16");
		System.out.println(c);  //main옆에 throws ParseException가 붙어야 오류가 나지않음
		
	}

}
