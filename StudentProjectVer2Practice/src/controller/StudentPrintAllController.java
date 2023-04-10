package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentPrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().getlist(); //getlist()라는 메서드를 여기서 만들고 서비스에서 작성
		
		if(list.isEmpty()) //리스트에 데이터 개수가 0인것을 확인하는 코드
			System.out.println("출력할 데이터가 하나도 없습니다.");
		else {
			for(StudentVO vo: list) //for each문, list에 있는것을 for문을 돌아가며 하나씩 StudentVO의 vo라는 변수에다가 넣겠다.
				System.out.println(vo);
		}
	}

}

/*학생정보 전체출력
 * 1. 컨트롤러에서 서비스 클래스 list를 받아서
 * 2. 리스트에 데이터 개수가 0이면 데이터가 없습니다.
 * 3. 리스트에 데이터가 있으면 반복문 이용해서 전체출력
*/