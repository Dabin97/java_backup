package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = 0;
		do {
			System.out.println("--- 학생관리 프로그램 ---");
			System.out.println("   1. 학생정보 등록");
			System.out.println("   2. 학생정보 전체출력");
			System.out.println("   3. 학생정보 검색");
			System.out.println("   4. 학생정보 삭제");
			System.out.println("   5. 학생정보 수정");
			System.out.println("   0. 프로그램 종료");
			System.out.print("   원하시는 번호를 입력하세요 : ");
			no = sc.nextInt(); sc.nextLine();
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null)
				controller.execute(sc);
		}while(no != 0);
	}

}

/*
 * 학생정보 전체출력
 * 1. 컨트롤러에서 서비스 클래스 list를 받아서
 * 2. 리스트에 데이터 개수가 0이면 데이터가 없습니다.
 * 3. 리스트에 데이터가 있으면 반복문 이용해서 전체출력
 * 
 * 
 * 학생정보 검색
 * 1. 컨트롤러에서 검색할 학번을 받음
 * 2. 서비스 클래스로 학번을 보내서 일치하는 학생 객체를 리턴,
 * 	  만약에 일치하는 학생이 없으면 null 리턴
 * 3. 받은 결과를 이용해서 컨트롤러에서 결과를 출력
 * indexOf
 * 
 * 학생정보 삭제
 * 1. 컨트롤러에서 삭제할 학번을 받음
 * 2. 서비스 클래스로 학번을 보내서 일치하는 학생 객체를 삭제,
 * 	  삭제 결과는 boolean으로 리턴
 * 3. 받은 결과를 이용해서 컨트롤러에서 결과를 출력
 * remove
 * 
 * 학생정보 수정
 * 1. 컨트롤러에서 수정할 학번을 받음
 * 2. 서비스 클래스로 검색 기능 실행해서 학생객체를 받음
 * 3. 받은 결과가 null 수정할 데이터가 없다고 판단하고 결과 메세지 출력
 * 4. null이 아니면 나머지 데이터(이름, 학과명, 평점 받아서 수정)
 * 
 */





