package generic;

public class BoxGenericMain {

	public static void main(String[] args) {
		//제네릭을 사용하면 저장할 수 있는 타입을 객체 생성시 정해줌
		BoxGneric<Apple> box1 = new BoxGneric<Apple>();
		
		box1.setObj(new Apple());
		box1.getObj().printApple();
//		box1.setObj(new Orange()); 사과로 정해놨기때문에 오렌지 타입은 못넣는다.
		BoxGneric<Orange> box2 = new BoxGneric<Orange>();
		box2.setObj(new Orange());
		Orange o = box2.getObj();
		o.pirntOrange();
//		이렇게 하면 BoxMain에서 썼던 if문을 쓰지않아도 된다.
		
		//제네릭에 데이터타입을 여러개 저장할수있다. 콤마찍고 <T, V> 이런식
		
	}

}
