package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller = null;
		
		switch(no) {
		case 1:
			controller = new AppendProductController();
			break;
		case 2:
			controller = new SearchMaxPriceProductController();
			break;
		case 3:
			controller = new UpdateProductController();
			break;
		case 4:
			controller = new PrintAllProductController();
			break;
		case 5:
			controller = new ExportController();
			break;
		}
		
		return controller;
	}
}

//오늘 과제는 평가문제로 풀었던 프로젝트에 파일 입출력 기능을 추가해보세요






