package event;

import lamda.Method;

public class EventMain {

	public static void main(String[] args) {
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		
		btn1.onClick(); //NullPointerException이 떴었다. onClick 메소드에 !=null 조건문을 달아주자 오류가 사라짐
		btn1.setOnClickListener(new ButtonClickEvent()); //적용
		btn1.onClick(); //버튼123마다 모두 이렇게 만들기엔 복잡하다. 그래서 익명클래스를 쓴다.
		btn2.setOnClickListener(new View.OnClickListener() { 
			@Override
			public void onClick(View view) {
				System.out.println(view.name + " 버튼 클릭 이벤트 발생");
//				btn1.onClick(); 같은 영역에 선언해놓은 지역변수도 접근이 가능
			}
		});
		btn2.onClick(); //위에 익명클래스를 만든 후 필요할때마다 꺼내 쓰면 훨씬 편하다.
		
		//btn3 클릭이벤트 람다식을 이용해서 이벤트 처리
		Method<String> m1 = (a) -> System.out.println(a); //Method 인터페이스는 그대로 사용한다.
		m1.run(btn3.name + " 버튼 클릭 이벤트 발생"); //똑같은 형식이지만 버튼3의 이름을 추가한다.
		
		//선생님 예제
		btn3.setOnClickListener((v)->{  //만들어둔 setOnClickListener 사용
			System.out.println(v.name + " 버튼 이벤트");
		});
		btn3.onClick();
		
		//안드로이드로 구현가능함 
		
	}//main

}
