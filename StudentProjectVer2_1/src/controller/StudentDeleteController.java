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
		if(StudentService.getInstance().deleteStudentVO(new StudentVO(studentNo, null, null, 0)))
			System.out.println("학생 정보 삭제 성공");
		else
			System.out.println("학생 정보 삭제 실패");
		//여기서 아예 기능을 만들어서 객체로 보내고, StudentService.deleteStudentVO 에선 boolean으로 값이 나오게 함.
		
	}

}
