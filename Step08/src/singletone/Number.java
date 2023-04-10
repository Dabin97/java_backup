package singletone;

public class Number {
	//최초에 한번만 객체 생성
	private static Number instance = new Number(); //private static으로 자기자신 객체 할당
	private int count;
	
	//private 생성자는 외부에서 생성을 못하게 막음
	private Number() { 
		System.out.println("Number 객체 생성");
		count++;
	}
	
	// 누구나 get메서드를 사용해서 인스턴스를 빌려서도 된다. 
	public static Number getInstance() {
		if(instance == null) //객체생성이 안되어있을때 (static 할당이 밀려서)
			instance = new Number(); //강제로 new로 메모리 할당을 해주겠다. 
		return instance;
	}

	public int getCount() {
		return count;
	}
	
	
}//class
