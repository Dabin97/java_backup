package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() { //<<getInstance 왜 넣는지 까먹음
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller = null;
		//변수선언 null로 초기화, 보냈는데 일치하는게 없으면 비었다고 표기한다. 잘못보냈을때 메인에서 체크하고 실행하도록 하는 용도 
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
		}
		
		return controller;
	}
}








