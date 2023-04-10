package method;

public class CalcMain {

	public static void main(String[] args) {
		Calcurator cal = new Calcurator();
		
		cal.init(10, 7);
		
		int r = cal.plus();// cal.pl까지만 치고 퀵픽스를 보면 int형인게 보인다.
		int n = cal.minus();
		int m = cal.multiple();
		int v = cal.divisor();
		System.out.println(r +" "+n+" "+m+" "+v);
		
//		-------------------------------
		
		System.out.println("max는 : " + cal.max(10,50));
		System.out.println("min은 : " + cal.min(11,10));
	}

}
