package controller;
/*
 * 학생정보 수정시
 * 수정할 학생정보가 없다면 Exception 처리
 * 수정할 학생정보가 있다면 테이터 입력 받아서 수정
 * 평점을 입력받을때 잘못된 데이터가 들어오면 이것도 Exception 처리
 */
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentUpdateController implements Controller {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("학생정보 수정을 시작합니다.....");
		try {
			System.out.print("수정할 학번 : ");
			String studentNo = sc.nextLine();
	
			StudentVO vo = StudentService.getInstance().searchStudentVO(studentNo);
	
				if(vo == null)
					throw new StudentException("수정할 학생 정보가 존재하지 않습니다.");
				
			System.out.print("수정할 이름 : ");
			vo.setStudentName(sc.nextLine()); 
			System.out.print("수정할 학과명 : ");
			vo.setMajorName(sc.nextLine()); 
			System.out.print("수정할 평점 : ");
			String score = sc.nextLine(); 
			vo.setScore(Double.parseDouble(score));
			
			
			StudentService.getInstance().fileSave(); 
			System.out.println("학생 정보 수정이 완료되었습니다.");
		} catch(StudentException e) {
			System.out.println(e.getMessage()); 
			StudentService.getInstance().printLog(e.getMessage());
		}catch(NumberFormatException e) { 
			System.out.println("잘못된 데이터를 입력했습니다.");
		}
		
	}//execute

}//class
