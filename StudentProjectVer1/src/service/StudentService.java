package service;

import java.util.Arrays;
import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[] arr; //배열 선언
	private int index; 

	//생성자 + 초기화
	public StudentService() {
		arr = new StudentVO[10]; //배열 형성 , 클래스를 처음만들었을때 제일 처음 실행되는 생성자 안에 배열을 형성한다.(길이)
		arr[index] = new StudentVO("1111", "김철수", "경제학과", 3.14);
		index++;
		arr[index] = new StudentVO("2222", "이영희", "경영학과", 2.44);
		index++;
		arr[index] = new StudentVO("3333", "박영수", "컴퓨터공학과", 4.24);
		index++;
	}

	//학생 정보 추가(1)
	public void appendStudent(Scanner sc) {
		System.out.println("학생정보 등록 작업을 시작합니다...");
		
		if(arr.length == index) { //저장할 공간이 있는지 체크, arr.length는 10개 == index는 엔터까지 넘어가서 10개가 되면 멈춘다.
			System.out.println("더 이상 등록할 공간이 없습니다.");
			return;
		} 
		
		System.out.print("등록할 학생이름 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학생번호 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 평점 : ");
		double score = sc.nextDouble(); sc.nextLine();
		
		arr[index++] = new StudentVO(studentNo, studentName, majorName, score);
		System.out.println("학생정보 등록 작업이 완료되었습니다.");
	}
	
	//전체 학생정보 출력(2)
	public void printAllStudentInfo() {
		System.out.println("전체 학생 정보를 출력합니다....");
		if(index==0) {
			System.out.println("등록된 학생 정보가 하나도 없습니다.");
			return;
		}
		for(int i=0;i<index;i++) 
			System.out.println(arr[i]);
		
		System.out.println();
	}
	
	//학생정보 검색(3)
	public int searchStudentInfo(Scanner sc) {
		//검색할 학번을 입력
		System.out.println("학생정보 검색을 시작합니다.....");
		System.out.print("검색할 학번을 입력하세요 : ");
		String n = sc.nextLine();
		//배열에 등록된 학생 정보를 하나씩 읽어서 입력한 학번과 동일한지 체크
		
		for (int i = 0; i < index; i++) { 
			//일치하면 해당 정보를 출력
			if(arr[i].getStudentNo().equals(n)) { //일치하는 정보 찾는 코드식
				System.out.println("입력하신 학생정보를 찾았습니다.");
				System.out.println(arr[i]);
				return i; //void문이 아니고 int형 메소드이기때문에 return i를 반환해야 끝난다. 
				//return은 메소드의 결과 값을 돌려주는 명령어이다. 리턴 자료형이 void인 경우 return문 필요없다. 
			}
		}//for
		//검색된 정보가 없으면 검색결과가 없습니다. 출력
		System.out.println("입력하신 학생번호에 해당하는 학생은 없습니다.");
		return -1; //index에 없는 번호 -1을 넣는다. 
	}

	//학생정보 삭제(4)
	public void deleteStudentVO(Scanner sc) {
		System.out.println("학생 정보를 삭제를 시작합니다....");
		int r = searchStudentInfo(sc); //삭제할 학생 정보가 위치한 배열 인덱스 결과값을 받음, 위에 이미 만들어둔 것을 사용
		//검색할 결과가 없는 경우 -1을 받음
		if(r==-1) return; //삭제할 데이터가 없는 경우 리턴으로 강종
		
		//-1이 아니면 삭제할 데이터가 있다고 판단 후 삭제 작업을 수행
		for (int i = r; i < index-1; i++) {
			arr[i] = arr[i+1]; //앞으로 땡기기
		}
		//삭제 완료 후 인덱스값을 1 감소.
		index--;
		System.out.println("삭제 작업이 정상적으로 이루어졌습니다.");
	}
	//arr[5]까지 숫자가 채워져있다면 index는 엔터까지 합해서 6개이다. 
	//쭉 arr[i+1]하면서 앞으로 땡기다가 마지막 arr[11]에 당겨올 arr[12]의 값이 없으므로 오류가 뜬다.
	//따라서 오류를 없애기 위해서 i < index-1;  <--index를 -1해줘야한다. 
	
	
	//학생정보 수정(5) - 삭제와 등록 메서드를 섞어서 사용
	public void updateStudentVO(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다....");
		int r = searchStudentInfo(sc); //수정할 학생 정보를 검색
		if(r==-1) return; //수정할 정보가 없으면 메서드 종료
		
		System.out.print("수정할 학생이름 : ");
		String studentName = sc.nextLine();
		System.out.print("수정할 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("수정할 평점 : ");
		double score = sc.nextDouble(); sc.nextLine();
		
		//입력받은 데이터를 set 메서드 이용해서 수정
		arr[r].setStudentName(studentName);
		arr[r].setMajorName(majorName);
		arr[r].setScore(score);
		
		System.out.println("학생 데이터 수정 완료");
	}//addStudentVO
//입력 받은 데이터를 사용할때는 get메소드 사용, 받은 데이터를 다시 수정해서 넣을때는 set메서드 사용
	
}//class


