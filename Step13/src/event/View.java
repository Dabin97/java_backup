package event;

public class View { 
	protected String name;
	private OnClickListener onClickListener;
	
	public View(String name) { //생성자
		super();
		this.name = name;
	}
	
	public void setOnClickListener(OnClickListener onClickListener) { //setter만 만든다.
		this.onClickListener = onClickListener;
	}
	
	public void onClick() { 
		if(onClickListener!=null)//무조건 실행이라서 오류가 뜰수있다. 따라서 조건문을 넣음
			onClickListener.onClick(this);//온클릭을 실행하겠다. 실행할 대상은 나 자신(this)
	}
	
	public static interface OnClickListener{ //클래스 안에 인터페이스 만들기 - 클릭에 관한 기능을 넣는다.
		public void onClick(View view); //클릭이벤트를 할때 view를 받는다. 위의 필드 대상들에게 접근하기 위해서, 접근할수있는 권한을 줌
	}									//view에서 name에 접근할 권한이 있다 = 같은 클래스이기 때문에(외부에선 X)
	

	
	
}//class
