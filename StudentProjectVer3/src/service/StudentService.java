package service;

import java.util.ArrayList;

import exception.StudentException;
import vo.StudentVO;

//싱클톤 패턴
public class StudentService {
	//static 형태의 자기자신 타입으로 객체생성
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list; //리스트 추가 
	
	//private 생성자
	private StudentService() {
		list = new ArrayList<StudentVO>();
		list.add (new StudentVO("1111", "김철수", "경제학과", 3.14));
		list.add (new StudentVO("2222", "이영희", "경영학과", 2.44));
		list.add (new StudentVO("3333", "박영수", "컴퓨터공과", 4.24));
	}
	
	//getter
	public static StudentService getInstance() {
		if(instance == null) //객체생성이 안되어있을때 (static 할당이 밀려서)
			instance = new StudentService(); //강제로 new로 메모리 할당을 해주겠다. 
		return instance;
	}

	//학생정보 추가 메서드 Exception을 이용해서 void문으로 변경
	public void appendStudentVO(StudentVO studentVO) {
		list.add(studentVO);//받아온 학생 객체를 리스트에 추가
	}
	
	//학생정보 전부 출력
	public ArrayList<StudentVO> getlist() {
		return list;
	}
	
	//학생정보 검색
	// Exception적용 검색결과가 없으면 throws를 이용해서 StudentException을 던지게끔 처리
	public StudentVO searchStudentVO(String studentNo) throws StudentException {
		int i = list.indexOf(new StudentVO(studentNo, null, null, 0)); 
		
		if(i == -1)
			throw new StudentException("검색 결과가 없습니다.");
		return list.get(i); //return list.get(i);를 해야 값이 들어감
		//void문으로 변경하지않고 throws를 할수있으며, Controller 인스턴스값도 바뀌지않는다.
		/*if(i != -1) 
			return list.get(i);
		return null; 
		 */
		//위가 본래 있던 식인데, i가 -1이 아닐때 list.get(i);을 리턴하므로 
		//if(i == -1) throw new StudentException("검색 결과가 없습니다."); 으로 Exception을 만들었으면 
		//아래에 값을 다시 넣어주는 return list.get(i);을 넣어야 검색결과가 나온다.
	}


	//학생정보 삭제
	public boolean deleteStudentVO(StudentVO studentVO) { //boolean 데이터타입에 유의하기
		return list.remove(studentVO);
	}
	
	
	
	
	
	
}//class


