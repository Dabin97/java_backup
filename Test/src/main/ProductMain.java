package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.ProductService;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("----제품관리 프로그램----");
			System.out.println("1. 제품정보 등록");
			System.out.println("2. 제일 비싼 제품정보 조회");
			System.out.println("3. 제품정보 수정");
			System.out.println("4. 전체 제품정보 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
			int no = sc.nextInt();
			sc.nextLine();//엔터를 메모리에서 비움
			if(no == 0) break;
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null)
				controller.execute(sc);
		}		
	}

}

//검색을 위해서 equals 비교 부분을 하나만 선택해서 비교를 해야 검색이 정상적으로 됩니다.
//다시 작업후 검색 관련된 것도 처리해보세요
