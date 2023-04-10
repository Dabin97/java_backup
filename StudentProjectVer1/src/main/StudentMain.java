package main;

import java.util.Arrays;
import java.util.Scanner;

import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너는 딱 1개만 만들어야한다. 
		StudentService service = new StudentService();
		
		while(true) { //계속 돌리기. break 또는 return으로 강종
			System.out.println("---- 학생 관리 프로그램 ----");
			System.out.println("   1. 학생정보 등록");
			System.out.println("   2. 학생정보 전체출력");
			System.out.println("   3. 학생정보 검색");
			System.out.println("   4. 학생정보 삭제");
			System.out.println("   5. 학생정보 수정");
			System.out.println("   0. 프로그램 종료");
			System.out.print("   원하시는 번호를 입력하세요 : ");
			int no = sc.nextInt(); sc.nextLine(); //숫자니까 뒤에 엔터가 남는다. 엔터를 없앨 줄바꿈 추가
			
			switch(no) {
			case 1: 
				service.appendStudent(sc); //프로그램 시작할때 받은걸 넣는다. 
				break;
			case 2: 
				service.printAllStudentInfo();
				break;
			case 3: 
				service.searchStudentInfo(sc);
				break;
			case 4: 
				service.deleteStudentVO(sc);
				break;
			case 5: 
				service.updateStudentVO(sc);
				break;
			case 0: 
				System.out.println("프로그램을 종료합니다."); 
				return; //강종=리턴
			}
			
		}//while
		
		
	}//main

}
