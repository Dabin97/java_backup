package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;
//제일 비싼 제품 조회(max 기능 넣기)

public class productSearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제일 비싼 제품정보 조회를 시작합니다..");
		ArrayList<ProductVO> list = ProductService.getInstance().searchPriceVO(); //.searchPriceVO(); 주의하기
		
		
		if(list.isEmpty()) {
			System.out.println("현재 등록된 제품들이 없습니다.");
			return;
		}
		
		for(ProductVO vo : list)
			System.out.println(vo);
		System.out.println();
	
//		int min = Integer.MAX_VALUE;
//		int max =0;
//
//		int price = sc.nextInt();
//		ProductVO vo = ProductService.getInstance().searchPriceVO(price);
//		if (vo == null)
//			System.out.println("조회 결과가 없습니다.");
//		else {		
//			if(price<min) {
//				price=max;
//				System.out.println(max);
//			}
//		}
//		//max비교를 ProductService에서만 진행함, 거기서 계산한 값을 리턴
	
		/*
		 * 
		검색을 위해서 equals 비교 부분을 하나만 선택해서 비교를 해야 검색이 정상적으로 됩니다.
		다시 작업후 검색 관련된 것도 처리해보세요
		
		제품정보 수정할때 제품번호로 검색을 하는데, EmployeeVO에서 equals메서드 보면 
		제품번호 이외에 값들도 같은지 비교하는 부분이 추가되있어서 제품번호로만은 검색이 안됩니다.
		그래서 EmployeeVO에서 equals 메서드에서는 제품번호로만 비교하게끔 수정하셔야 됩니다. 
		그리고 비싼 제품 검색할때는 indexOf가 아니라 하나씩 뽑으면서 금액 기준으로 큰값을 찾는 방법으로 해야합니다.
		 */

	}// execute

}// class
