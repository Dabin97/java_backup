package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentUpdateController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다.....");
		System.out.print("수정할 학번을 입력 : ");
		String studentNo = sc.nextLine();	

		StudentVO vo = StudentService.getInstance().searchStudentVO(studentNo);
		if(vo == null) {
			System.out.println("수정할 데이터가 없습니다.");
			return; //return을 하면 아래 else를 쓰지않고 질문+입력을 바로 넣어도 된다.
		}
		
			System.out.print("수정할 이름 : "); //StudentAppendController에 있는 코드 복사
			vo.setStudentName(sc.nextLine());
			System.out.print("수정할 학과명 : ");
			vo.setMajorName(sc.nextLine());
			System.out.print("수정할 평점 : ");
			vo.setScore(sc.nextDouble());sc.nextLine();
			System.out.println("학생정보 수정이 완료되었습니다.");
		
	}

}
/*
 * 학생정보 수정 
 * 1. 컨트롤러에서 수정할 학번을 받음 
 * 2. 서비스 클래스로 검색 기능 실행해서 학생객체를 받음 
 * 3. 받은 결과가 null이면, 수정할 데이터가 없다고 판단하고 결과 메세지 출력 
 * 4. null이 아니면 나머지 데이터(이름, 학과명, 평점 받아서 수정)
 * 
 * //입력된 학번을 기준으로 검색 결과를 받아옴 
 * //vo가 null이면 수정할 데이터가 없다.
 * 
 * 수정은 검색과 등록 코드를 복사해서 사용한다. 
 */