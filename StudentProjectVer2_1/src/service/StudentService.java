package service;

import java.util.ArrayList;

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

	//학생정보 추가 메서드 (case 1)
	public boolean appendStudentVO(StudentVO studentVO) {
		//받아온 학생 객체를 리스트에 추가
		//단, 학번이 중복되면 리스트에 추가하지 못하게끔 처리
		//등록이 되면 true 리턴, 등록 실패하면 false를 리턴
		
		//1.중복체크
		if(list.contains(studentVO)) {
			return false;
		}else{
			//2. 리스트에 데이터 추가
			return list.add(studentVO);
		}
	}
	//학생정보 전부 출력
	public ArrayList<StudentVO> getlist() {
		return list;
	}
	
	//학생정보 검색
	public StudentVO searchStudentVO(String studentNo) {
		int i = list.indexOf(new StudentVO(studentNo, null, null, 0)); //indexOf 리스트에서 찾기
		//int i = list.indexOf(studentNo) 를 바로 쓰지않는 이유는, 들어오는값 학번 String을 가지고 찾기때문에 문제가 생긴다.
		//StudentVO에서 찾아야하는데 String으로 찾으니 데이터타입이 달라서 오류, 따라서 new StudentVO(studentNo, null, null, 0)로 찾는다.
		if(i != -1) 
			return list.get(i);
		return null; //i=-1이면 인덱스번호에 없는값이므로 null을 리턴한다. 
	}

	//학생정보 삭제
	public boolean deleteStudentVO(StudentVO studentVO) { //boolean 데이터타입에 유의하기
		return list.remove(studentVO);
	}
	
	
	
	
	
	
}//class


