package controller;

//싱글톤
public class HandlerMapping {
	//static 형태의 자기자신 타입으로 객체생성
	private static HandlerMapping instance = new HandlerMapping();
	
	//private 생성자
	private HandlerMapping() {
	}
	
	//getter
	public static HandlerMapping getInstance() {
		if(instance == null) 
			instance = new HandlerMapping(); 
		return instance;
	}
	
	public Controller creatController(int no) {
		Controller controller = null; 
		//변수선언 null로 초기화, 보냈는데 일치하는게 없으면 비었다고 표기한다. 잘못보냈을때 메인에서 체크하고 실행하도록 하는 용도 
		
		switch(no) {
		case 1:
			controller = new StudentAppendController(); //학생정보 등록 작업하는 클래스 하나 만듦
			break;
		case 2:
			controller = new StudentPrintAllController();//학생정보를 전체출력하는 클래스를 하나 만듦
			break;
		case 3:
			controller = new StudentSearchController(); //학생정보를 검색하는 클래스를 하나 만듦
			break;
		case 4:
			controller = new StudentDeleteController(); //학생정보를 삭제하는 클래스를 하나 만듦
			break;
		case 5:
			controller = new StudentUpdateController(); //학생정보를 수정하는 클래스를 하나 만듦
			break;
		}
		return controller;
	}
	
	
	
}
