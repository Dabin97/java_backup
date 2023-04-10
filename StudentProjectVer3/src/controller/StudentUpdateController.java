package controller;
import java.util.InputMismatchException;
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
			String score = sc.nextLine(); //먼저 String버전 score을 만들어서 입력을 받고 set을 값을 넣는다
			vo.setScore(Double.parseDouble(score));
			//Step12 -date-DateFomatMain 맨아래 parse 참고, Step11-Wrapper 참고
			//문자열에서 double형 객체로 바꾸는 방법은 Double 클래스의 parseDouble 메서드를 사용
			
			System.out.println("학생 정보 수정이 완료되었습니다.");
			
		} catch(StudentException e) {
			System.out.println(e.getMessage()); //syso안에 e.getMessage()를 넣어줘야한다.
		}catch(NumberFormatException e) { //NumberFormatException 숫자형식오류
			System.out.println("잘못된 데이터를 입력했습니다.");
		}
		//실수로 변환하는 과정에서 넣은 문자열이 숫자 형식이 아니면 변환이 안되기 때문에 (문자열->실수로 변하는 parseDouble)
		//이때 NumberFormatException이 발생해서 그렇습니다. (숫자가 아니면 숫자형식오류가 뜬다.)
		//catch(InputMismatchException e)로 하면 밑의 글이 출력되지만 강제종료된다. 그 이유는 throws가 없어서 호출대상에게 던져주는 것이 없기때문이다.
		//catch(NumberFormatException e)로 하면 글이 나오지않지만 강제종료되지않는다. parseDoule에는 throws NumberFormatException가 있기때문
		
	}//execute

}//class
