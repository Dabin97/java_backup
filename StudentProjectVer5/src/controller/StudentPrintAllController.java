package controller;
/*
 * 학생정보 전체출력시
 * 학생정보가 하나도 없으면 Exception
 * 있으면 전체출력
 */
import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentPrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().selectAllStudentVO();
		
	try {
		if(list.size() == 0)
			throw new StudentException("출력할 데이터가 하나도 없습니다.");
			
			for(StudentVO vo : list) {
				vo.printStudentInfo();
			}
			
		}catch(StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}//execute

}//class
