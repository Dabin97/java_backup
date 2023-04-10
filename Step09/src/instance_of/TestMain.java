package instance_of;

public class TestMain {

	public static void main(String[] args) {
		/*
		Person p = new Person();
		Animal animal = p;
		animal.eat();
		Person s = (Person)animal; //위에서 아래로 형변환
		s.eat();
		System.out.println(p);
		System.out.println(s);
		System.out.println(animal); //animal로 형변환해도 원래 이름이 나온다. 맨 처음 생성했던 타입이 나온다. 
		
		Dog d = (Dog)animal; //작은개념으로 들어가는거니까 강제형변환
		d.eat(); //문법상 문제는 없지만 실행하면 오류가 뜬다. 이유 : Person과 Dog는 다르기때문이다. Person은 Dog로 형변환될수없다.
		*/
		
		Person p = new Person();
		Animal a = p;
				
		//instanceof - 결과는 논리값으로 나온다. if로 이용
		System.out.println(p instanceof Person);
		System.out.println(a instanceof Dog); //오류, p->Dog 형변환이 안된다. 그러나 p를 Animal로 바꿔서 체크하면 된다. 
		System.out.println(p instanceof Animal);
		//p->Person , p->Animal은 형변환이 가능하지만(true), p->Dog나 a->Dog는 형변환이 불가능하다.(false) a로 바꿔도 결국 Person이기 때문이다.
		
		
		//클래스 이름 뽑아서 처리 .getClass().뒤에 나오는 get은 꺼낼것으로 
		System.out.println(p.getClass().getName());//패키지명까지 모두 나오는 .getName()으로 사용해야 정확하게 찾을수있다.
		System.out.println(a.getClass().getName());//a로 바꾸어도 똑같은 결과값이 나온다.(Animal a = p;)
		System.out.println(p.getClass().getTypeName());
		System.out.println(p.getClass().getSimpleName()); //Person
		System.out.println(Person.class.getName()); //<-- 이런식으로도 사용가능.
		//차이
		System.out.println(p.getClass().getName()); //만들어진 객체의 타입명을 뽑는 거, 여기서는 p
		System.out.println(Person.class.getName()); //클래스 타입으로 이름을 뽑는거, 여기서는 Person
		
		
	}//main

}
