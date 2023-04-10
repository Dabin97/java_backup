package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentRankController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().selectRankStudentVO();
		
		try {
			if(list.isEmpty())
				throw new StudentException("출력할 학생 정보가 하나도 없습니다.");
				
				for(StudentVO vo : list) {
					vo.printStudentInfo();
				}
				
			}catch(StudentException e) {
				System.out.println(e.getMessage());
			}
	}

}
