package inner;

import inner.Outter.Inner;
import inner.OutterStaticClass.InnerStaticClass;

public class OutterMain {

	public static void main(String[] args) {
		Outter outClass = new Outter(200);
		//Outter 클래스가 생성이 되야 Inner 클래스를 생성할수있음
		Inner inClass = outClass.new Inner(100);
		System.out.println(inClass.sum());
		inClass = outClass.new Inner(40);
		System.out.println(inClass.sum());
		
		//메모리를 할당하려면 new Outter를 해야하는데, 이걸 안하면 Inner도 만들어지지 않는다. 겉을 감싸고 있는 클래스부터 메모리를 할당해주어야한다.
		//따라서 Outter 먼저 new해주고 outClass.new Inner(100); 이런식으로 만든다.
		//껍데기가 만들어져도 Inner을 기반으로 객체를 만들지않기때문에 Outter입장에선 뭐가 있는지 몰라서 inner에 접근할수없다. 
		
//		OutterStaticClass out = new OutterStaticClass(100);
		OutterStaticClass.InnerStaticClass in = new OutterStaticClass.InnerStaticClass(200); 
		System.out.println(in.sum());
		//Inner에 static이 들어가서 별도의 클래스가 되어서 out.new InnerStaticClass이 오류가 뜬다.
		
		//Inner클래스가 Outter클래스의 private에 접근해서 작업해야할때 자주 쓰는 구조이다. 소켓 스레드 작업
		
		
	}//main

}
