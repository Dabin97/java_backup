package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentAppendController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 등록 작업을 시작합니다...");

		System.out.print("등록할 학생이름 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학생번호 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		//받은 값을 객체로 보내고 결과를 논리값으로 표현함. 아래와 같은 형식으로 객체로 만들어서 송신하고 appendStudentVO라는 메서드를 여기서 만들어서 서비스에서 역행으로 메소드를 짠다.
		boolean result = StudentService.getInstance().appendStudentVO(
				new StudentVO(studentNo, studentName, majorName, score));
				
	}

}
