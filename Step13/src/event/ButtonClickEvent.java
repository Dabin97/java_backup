package event;

public class ButtonClickEvent implements View.OnClickListener{ //implements를 하고 클래스명에 퀵픽스로 추상메서드 오버라이딩

	@Override
	public void onClick(View view) {
		System.out.println(view.name + " 클릭 이벤트 발생");
	}

	
}//class
