package static_ex;

public class CountMain {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		Count c5 = new Count();
		
		//static 변수나 메서드에 접근을 할때는 해당클래스명.변수명 / 해당클래스명.메더드명()
		//생성한객체.변수명 / 생성한객체.메서드명()
		System.out.println(Count.total_count); //똑같다
		System.out.println(c1.total_count);
		
	}

}
