package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentSearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 검색을 시작합니다..");
		System.out.print("검색할 학번 : ");
		String studentNo = sc.nextLine();
		StudentVO vo = StudentService.getInstance().searchStudentVO(studentNo);
		
		if(vo == null)
			System.out.println("검색 결과가 없습니다.");
		else
			System.out.println(vo);
	}

}//class
