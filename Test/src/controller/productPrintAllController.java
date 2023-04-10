package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class productPrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<ProductVO> list = ProductService.getInstance().getlist();
		
		if(list.isEmpty())
			System.out.println("출력할 데이터가 하나도 없습니다.");
		else {
			for(ProductVO vo : list) {
				System.out.println(vo);
			} 
		}
	}

}
