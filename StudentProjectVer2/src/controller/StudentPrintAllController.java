package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentPrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().getlist();
		
		if(list.isEmpty())
			System.out.println("출력할 데이터가 하나도 없습니다.");
		else {
			for(StudentVO vo : list) {
				System.out.println(vo);
			}
				
//				//Iterator로 처리
//				Iterator<StudentVO> it = list.iterator();
//				
//				while(it.hasNext()) { 
//					System.out.println(it.next());
		}	

	}
	

}
