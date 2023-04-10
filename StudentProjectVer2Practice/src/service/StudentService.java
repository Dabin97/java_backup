package service;

//싱글톤
import java.util.ArrayList;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	// 학생정보를 추가
	// 받아온 학생 객체를 리스트에 추가.
	// 단, 학번이 중복되면 리스트에 추가하지 못하게끔 처리
	// 등록이 되면 true 리턴, 등록 실패하면 false를 리턴
	public boolean appendStudentVO(StudentVO studentVO) {
		// 1. 중복 체크 list.contains
		if (list.contains(studentVO)) {
			return false;
		} else {
			// 2. 리스트에 데이터 추가 list.add
			return list.add(studentVO);
		}
	}

	// 전체학생정보 출력 메서드
	public ArrayList<StudentVO> getlist() {
		return list; // return null;을 return list;로 변경
	}
	//학생데이터 검색
	public StudentVO searchStudentVO(String studentNo) {
		int i = list.indexOf(new StudentVO(studentNo, null, null, 0)); //indexof는 리스트에서 검색하는 키워드
		if (i != -1) //인덱스에 없는 값 -1
			return list.get(i); //이쪽은 잘 이해가 가지않음.
		return null;
		//int i = list.indexOf(studentNo) 를 바로 쓰지않는 이유는, 들어오는값 학번 String을 가지고 찾기때문에 문제가 생긴다.
		//StudentVO에서 찾아야하는데 String으로 찾으니 데이터타입이 달라서 오류, 따라서 new StudentVO(studentNo, null, null, 0)로 찾는다.
	}
	//학생데이터 삭제
	public boolean deleteStudentVO(StudentVO studentVO) {
		return list.remove(studentVO);
	}
	
	//학생정보 수정은 검색과 등록 기능을 사용한것이라서 따로 메서드가 없다. 

}
