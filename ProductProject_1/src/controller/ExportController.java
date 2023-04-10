package controller;

import java.util.Scanner;

import service.ProductService;

public class ExportController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ProductService.getInstance().exportCSV();
		System.out.println("파일 내보내기 완료");
	}

}
