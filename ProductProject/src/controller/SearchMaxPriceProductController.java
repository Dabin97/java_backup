package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class SearchMaxPriceProductController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제일 비싼 제품 목록을 조회합니다............");
		ArrayList<ProductVO> list = ProductService.getInstance().maxPriceProductList();
		//.maxPriceProductList();라고 새로만든 메소드명을 넣어야한다. 내꺼에선 .getList();넣었다가 모두 출력됐다.
		
		if(list.isEmpty()) {
			System.out.println("현재 등록된 제품들이 없습니다.");
			return; //비었으면 없다고 리턴
		}
		//foreach문으로 list의 값을 vo로 하나씩 넣는 반복문
		for(ProductVO vo : list) 
			System.out.println(vo);
		System.out.println();
	} //만들어둔 rList는 어디에 쓰이는지? rList는 new ArrayList<ProductVO>(); list의 값을 가지고있다.

}








