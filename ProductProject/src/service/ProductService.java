package service;

import java.util.ArrayList;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();
	private ArrayList<ProductVO> list;
	private ProductService() {
		list = new ArrayList<ProductVO>();
		list.add(new ProductVO("1111", "갤럭시", "삼성", 100, 2000)); //임시로 데이터 등록
		list.add(new ProductVO("2222", "아이폰", "애플", 200, 3000));
		list.add(new ProductVO("3333", "아이패드", "애플", 100, 3000));
	}

	public static ProductService getInstance() {
		if(instance == null)
			instance = new ProductService();
		return instance;
	}

	public boolean appendProduct(ProductVO productVO) {
		if(list.contains(productVO)) { //중복없애기
			return false;
		}
		return list.add(productVO); //ㅣlist에 값을 추가
	}
	
	//전체출력
	public ArrayList<ProductVO> getList() {
		return list;
	}

	public ArrayList<ProductVO> maxPriceProductList(){
		ArrayList<ProductVO> rList = new ArrayList<ProductVO>(); //rList라는 새로운 리스트 변수를 선언	
		
		//1. 제품 가격 중 최대값
		int max = 0; //max값 선언
		for(ProductVO vo : list) { //list값을 vo에 하나씩 넣으면서 반복 비교
			if(max < vo.getPrice()) //만들어뒀던 getter 활용
				max = vo.getPrice(); //가장 큰값을 찾을때까지 max안에다 넣기
		}
		//2. 제품가격 최대값과 같은 제품을 리스트에 저장
		for(ProductVO vo : list) { //list값을 vo에 하나씩 넣으면서 반복 비교
			if(max == vo.getPrice()) //위의 for문에서 max를 찾아서 값을 넣어둠.
				rList.add(vo); //일치하면 rList안에 vo값을 저장
		//근데 rList는 new ArrayList<ProductVO>(); list의 값을 가지고있다. 따라서 max는 list에 들어간다.
		}
		
		return rList; //그리고 rList를 리턴해서 값을 넣음
	}
	//rList를 따로 만든 이유 : 
	//동일한 금액인 제품들은 여러개일수 있으니까 같은 최대값을 가지는 제품을
	//한번에 리턴하기 위해서 리스트로 결과 값을 다 저장한 후에 리턴한 것이라고 보면 됩니다.
	
	
	//수정
	public ProductVO searchProduct(String productNo) {
		int i = list.indexOf(new ProductVO(productNo, null, null, 0, 0)); //제품수정은 indexof를 쓴다.
		//int i = list.indexOf(studentNo) 를 바로 쓰지않는 이유는, 들어오는값 학번 String을 가지고 찾기때문에 문제가 생긴다.
		if(i == -1) //-1은 없는 인덱스번호
			return null;
		return list.get(i);
	}
	
}










