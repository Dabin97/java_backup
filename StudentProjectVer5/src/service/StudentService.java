package service;

import java.util.ArrayList;

import dao.StudentDAO;
import exception.StudentException;
import vo.StudentVO;

//싱클톤 패턴
public class StudentService {
	//static 형태의 자기자신 타입으로 객체생성
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list; //리스트 추가 
	
	//private 생성자
	private StudentService() {	}
	
	//getter
	public static StudentService getInstance() {
		if(instance == null) //객체생성이 안되어있을때 (static 할당이 밀려서)
			instance = new StudentService(); //강제로 new로 메모리 할당을 해주겠다. 
		return instance;
	}

	//학생정보 추가 메서드 
	public void insertStudentVO(StudentVO studentVO) throws StudentException {
		//DAO에 받아온 학생 객체를 보냄(리스트에 보내지않음. 리스트는 마지막에 지울예정)
		StudentDAO.getInstance().insertStudent(studentVO);
	}
	
	//학생정보 전부 출력
	public ArrayList<StudentVO> getlist() {
		return list;
	}
	
	//학생정보 검색
	public StudentVO searchStudentVO(String studentNo){
		//받아온 학번을 DAO에 보내서 학번 기준으로 조회한 결과를 받음
		return StudentDAO.getInstance().searchStudent(studentNo);
	}


	//학생정보 삭제
	public void deleteStudentVO(String studentNo) throws StudentException {
		StudentDAO.getInstance().deleteStudent(studentNo);
	}
	
	//학생정보 전부 출력 - sql
	public ArrayList<StudentVO> selectAllStudentVO() {
		return StudentDAO.getInstance().selectAllStudent();
	}

	//학생정보 수정 -sql
	public void updateStudentVO(StudentVO vo) throws StudentException {
		StudentDAO.getInstance().updateStudent(vo);
	}

	//평점 Top3 출력
	public ArrayList<StudentVO> selectRankStudentVO() {
		return StudentDAO.getInstance().selectRankStudent();
	}

	
	
	
	
	
	
	
}//class


