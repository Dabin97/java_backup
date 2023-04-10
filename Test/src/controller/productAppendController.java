package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class productAppendController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 등록을 시작합니다.....");
		//학생정보 한건 입력 받기
		System.out.print("제품 번호 : ");
		String productNo = sc.nextLine();
		System.out.print("제품명 : ");
		String productName = sc.nextLine();
		System.out.print("제조사 : ");
		String productCompany = sc.nextLine();
		System.out.print("재고 : ");
		int stock = sc.nextInt(); sc.nextLine(); //<<
		System.out.print("소비자 가격 : ");
		int price = sc.nextInt(); sc.nextLine();
		
		boolean result = ProductService.getInstance().appendProductVO(
				new ProductVO(productNo, productName, productCompany, stock, price));
		
		if(result)
			System.out.println("제품을 등록하였습니다.");
		else
			System.out.println("제품 등록이 실패하였습니다. 입력하신 데이터를 확인 하세요");
	}

}
