package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentDeleteController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번 입력 : ");
		String studentNo = sc.nextLine();
		
		if(StudentService.getInstance().deleteStudentVO(new StudentVO(studentNo, null, null, 0))) //순서대로 학번,이름,학과,평점이라서 나머지는 null과 0으로 처리
			System.out.println("학생 데이터 삭제 완료");
		else
			System.out.println("학생 데이터 삭제 실패");
		//여기서 아예 기능을 만들어서 객체로 보내고, StudentService.deleteStudentVO 에선 boolean으로 값이 나오게 함.
	}

}
/*  학생정보 삭제
 * 1. 컨트롤러에서 삭제할 학번을 받음
 * 2. 서비스 클래스로 학번을 보내서 일치하는 학생 객체를 삭제,
 * 	  삭제 결과는 boolean으로 리턴
 * 3. 받은 결과를 이용해서 컨트롤러에서 결과를 출력
 * remove
 * 
 * //1. 삭제할 학번 입력
 * //2. 삭제할 기능 실행 후 결과 출력
 * 
*/