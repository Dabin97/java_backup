package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentDeleteController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다..");
		// 1.삭제할 학번 입력받기
		System.out.print("삭제할 학번 : ");
		String studentNo = sc.nextLine();
		// 2. 서비스 클래스로 삭제할 학번을 보냄 - 삭제할 기능 실행
		if(StudentService.getInstance().deleteStudentVO(new StudentVO(studentNo, null, null, 0))) {
			StudentService.getInstance().fileSave(); //파일 삭제하고도 save하기
			System.out.println("학생 정보 삭제 성공");
		}else
			System.out.println("학생 정보 삭제 실패");
		
	}

}
