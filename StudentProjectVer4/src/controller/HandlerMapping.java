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
		
		switch(no) {
		case 1:
			controller = new StudentAppendController(); 
			break;
		case 2:
			controller = new StudentPrintAllController();
			break;
		case 3:
			controller = new StudentSearchController(); 
			break;
		case 4:
			controller = new StudentDeleteController(); 
			break;
		case 5:
			controller = new StudentUpdateController(); 
			break;
		case 6:
			controller = new ExportController(); 
			break;
		}
		return controller;
	}
	
	
	
}
