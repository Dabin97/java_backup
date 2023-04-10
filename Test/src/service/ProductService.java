package service;
//2. 제품을 하나를 입력받아 등록하는 기능을 만드시오.(15점)
import java.util.ArrayList;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();
	private ArrayList<ProductVO> list;
	
	private ProductService() {
		list = new ArrayList<ProductVO>();
		list.add (new ProductVO("1111", "와인", "프랑스", 3, 150));
		list.add (new ProductVO("2222", "사무용품", "사무용품회사", 2, 100));
		list.add (new ProductVO("3333", "식품", "식품제조회사", 4, 50));
	}

	public static ProductService getInstance() {
		if(instance == null)
			instance = new ProductService();
		return instance;
	}
	
	//제품 등록
	public boolean appendProductVO(ProductVO productVO) {
		if(list.contains(productVO)) {
			return false;
		}else{
			return list.add(productVO);
		}
	}


	
	//제일 비싼 제품 조회
	public ArrayList<ProductVO> searchPriceVO() { //public ArrayList<ProductVO>로 변경해주어야 오류가 없어짐. 이유는?
		ArrayList<ProductVO> rList = new ArrayList<ProductVO>();
		int max = 0;
		for(ProductVO vo : list) { 
			if(max < vo.getPrice())
				max = vo.getPrice();
		}
		for(ProductVO vo : list) {
			if(max == vo.getPrice())
				rList.add(vo); 		
		}
		return rList;
	} //선생님 예제
		
	
//	int min = Integer.MIN_VALUE;를 넣으려고 했지만 별로 의미가 없다. 
//  for문을 돌면 알아서 가장큰게 max에 들어갈때까지 반복한다.
	
	
//		int i = list.indexOf(new ProductVO(null, null, null, 0, price)); 
//		if(i != -1) 
//			return list.get(i);
//		return null; 
//		내가 한것 왜틀렸는지 확인, 일단 indexOf로 비교해서는 안됨
	

	
	//전체출력
	public ArrayList<ProductVO> getlist() {
		return list;
	}
	


	//제품정보 수정용 메소드
	public ProductVO searchProductVO(String productNo) {
		int i = list.indexOf(new ProductVO(productNo, null, null, 0, 0)); 
		if(i == -1) 
			return null; 
		return list.get(i);
	}





	
	
	
}
