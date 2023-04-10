package date;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//클래스명이 똑같으면 패키지를 체크해야한다. 지금은 util 패키지로 사용
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime()); //날짜를 숫자로 카운트해서 기록하고있었음
		
		Date start = new Date(1);
		System.out.println(start); //1970년도 1월 1일이 나옴
		
		Date date = new Date(22, 5, 14);
		System.out.println(date); //5를 넣었는 6월이 나옴. 순번이 0부터 나오기때문이다. 4라고 써야 5월이 나옴
		
		date = new Date(122, 4, 14); //date에 줄이 그어져있는 것은 '더이상의 업데이트가 없다.'는 뜻
		System.out.println(date); 
	}

}
