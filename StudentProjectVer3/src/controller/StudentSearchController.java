package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentSearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 검색을 시작합니다..");
		try {
		System.out.print("검색할 학번 : ");
		String studentNo = sc.nextLine();
		StudentVO vo;
			vo = StudentService.getInstance().searchStudentVO(studentNo);
			
			System.out.println(vo); //검색결과가 없으면 searchStudentVO의 Exception으로 넘어가므로 if문은 지워도 된다.
			
		} catch (StudentException e) {
			e.printStackTrace();
		}
		
	}

}//class
