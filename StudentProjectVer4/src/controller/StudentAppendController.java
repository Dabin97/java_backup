package controller;
import java.util.InputMismatchException;
/*
 * 학생정보추가시
 * 학번을 입력받았을때 중복된 학생이 있으면
 * 작업을 더이상 진행하지않게끔 처리
 * 이때 StudentException을 이용해서 처리
 * 
 */
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class StudentAppendController implements Controller { 
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 등록을 시작합니다.....");
		try { //main안에 try
		System.out.print("등록할 학번 : ");
		String studentNo = sc.nextLine();
		//중복된 데이터가 있는지 체크
		if(StudentService.getInstance().searchStudentVO(studentNo) != null)
			throw new StudentException("학생 정보 등록을 실패하였습니다. 입력하신 데이터를 확인 하세요");
		
		System.out.print("등록할 이름 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 평점 : ");
		double score = sc.nextDouble(); sc.nextLine();
		StudentService.getInstance().appendStudentVO(
				new StudentVO(studentNo, studentName, majorName, score));
		
		System.out.println("학생 정보 등록을 성공하였습니다.");
	
		} catch(StudentException e) {
			System.out.println(e.getMessage());
			StudentService.getInstance().printLog(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			StudentService.getInstance().printLog(e.getMessage());
		}
	}//main

}


