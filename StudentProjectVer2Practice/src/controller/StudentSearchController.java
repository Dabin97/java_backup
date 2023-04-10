package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentSearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 검색을 시작합니다....");
		System.out.print("검색할 학번을 입력 : ");
		String studentNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudentVO(studentNo); 
		//서비스 클래스로 검색할 학번을 보냄. searchStudentVO라는 메서드를 만들고 그 안에는 입력받은 값을 넣어서 보냄.
		
		if(studentNo == null)
			System.out.println("검색 결과가 없습니다.");
		else
			System.out.println(vo);
		
		
	}

}
/*
 *  학생정보 검색
 * 1. 컨트롤러에서 검색할 학번을 받음
 * 2. 서비스 클래스로 학번을 보내서 일치하는 학생 객체를 리턴,
 * 	  만약에 일치하는 학생이 없으면 null 리턴
 * 3. 받은 결과를 이용해서 컨트롤러에서 결과를 출력
 * indexOf
 * 
//1. 검색할 학번 입력
//2. 서비스 클래스로 검색할 학번을 보냄
//3. 검색 결과가 null이면 검색한 결과가 없습니다 라고 출력, null이 아니면 검색 결과를 출력
 * 
 * 
 */
