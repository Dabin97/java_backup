package static_ex;

public class Count {
	private int count;//여기서는 선언만 하고 생성자에서 초기화 하는게 좋다.
	public static int total_count = 0;//바로 초기화하는게 좋다. 
	
	public Count() {
		count++;
		total_count++;
		System.out.println(count + " " + total_count);
	}
	
	public void addStaticCount() {
		total_count ++; //이미 만들어져있어서 접근가능
		//non-static은 static에 언제든지 접근이 가능
		//non-static이 실행되는 시점에는 static이 이미 메모리에 생성되어있다. 
	}
	
	public static void addFieldCount() {
//		count++; //필드 
		//static은 non-static에 접근할수없다.
		//static이 사용하는 시점에 non-static은 생성되지 않을 수도 있고
		//어떤 객체의 대상인지 구분이 불가능하다. 
	}
	
}//class
