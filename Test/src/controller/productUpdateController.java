package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class productUpdateController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품 정보 수정을 시작합니다.....");
		System.out.print("수정할 제품번호 : ");
		String productNo = sc.nextLine();
		ProductVO vo = ProductService.getInstance().searchProductVO(productNo);
		if(vo == null) {
			System.out.println("수정할 제품 정보가 존재하지 않습니다.");
			return;
		}
		System.out.print("수정할 제품명 : ");
		vo.setProductName(sc.nextLine()); 
		System.out.print("수정할 제조사 : ");
		vo.setProductName(sc.nextLine()); 
		System.out.print("수정할 재고 : ");
		vo.setStock(sc.nextInt()); sc.nextLine(); 
		System.out.print("수정할 가격 : ");
		vo.setPrice(sc.nextInt()); sc.nextLine(); 
		System.out.println("제품 정보 수정이 완료되었습니다.");
		
	}

}
