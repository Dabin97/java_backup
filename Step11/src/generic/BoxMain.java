package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj(200);
		System.out.println(box.getObj());
		
		box.setObj(new Apple()); //box에 사과저장
		Apple a = (Apple) box.getObj(); 
		//사과를 꺼내려니까 오류, Apple()이 Object로 형변환됨. 근데 이것을 Apple(작은개념)으로 꺼내려니까 형변환안됨. casting을 해줘야함.
		a.printApple();
		if(box.getObj() instanceof Orange) {
		Orange o = (Orange) box.getObj();
		o.pirntOrange(); 
		//저장하는건 문제가 없지만 가지고오는 과정에서 오류가 난다. 
		//box.setObj(new Apple());라서 Orange가 아니기 때문에 형변환이 안되서 오류가 난다. 
		}
	}

}
