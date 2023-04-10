package singletone;

public class NumberMain {

	public static void main(String[] args) {
		//private 생성자는 외부에서 생성을 전부 차단
		//Number n1 = new Number();
		
		Number n1 = Number.getInstance();
		Number n2 = Number.getInstance();
		Number n3 = Number.getInstance();
		Number n4 = Number.getInstance();
		Number n5 = Number.getInstance();
		
		System.out.println(n1.getCount());
		System.out.println(n2.getCount());
		System.out.println(n3.getCount());
		System.out.println(n4.getCount());
		System.out.println(n5.getCount());
		//한개만 만들어져서 11111만 나온다. 
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
	}

}

//상속(Inheritance) : 주로 부모자식관계를 만들어주는 용도로 사용 (다형성)


