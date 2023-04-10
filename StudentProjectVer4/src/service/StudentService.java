package service;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.ArrayList;

import vo.StudentVO;

//싱클톤 패턴
public class StudentService {
	// static 형태의 자기자신 타입으로 객체생성
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list; // 리스트 추가

	// private 생성자
	private StudentService() {
		fileLoad();
	}

	// 파일 읽어오기
	private void fileLoad() {
		list = new ArrayList<StudentVO>();
		
		try(FileInputStream fis = new FileInputStream("student.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);){
			while(true) {
				StudentVO vo = (StudentVO) ois.readObject();
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("학생 데이터 파일이 없습니다.");
		}catch (EOFException e) {
			System.out.println("학생 데이터 파일 로드 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}//fileLoad
		

	// getter
	public static StudentService getInstance() {
		if (instance == null) // 객체생성이 안되어있을때 (static 할당이 밀려서)
			instance = new StudentService(); // 강제로 new로 메모리 할당을 해주겠다.
		return instance;
	}

	
	// 학생정보 추가 메서드 Exception을 이용해서 void문으로 변경
	public void appendStudentVO(StudentVO studentVO) {
		list.add(studentVO);// 받아온 학생 객체를 리스트에 추가
		// 파일에 내용 추가
		fileSave();
//		try (FileOutputStream fos = new FileOutputStream("student.dat", true);
//				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
//
//			oos.writeObject(studentVO); // 간단하게 값 받기
//			oos.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}오류때문에 주석처리
		
	}// appendStudentVO

	
	// 학생정보 전부 출력
	public ArrayList<StudentVO> getlist() {
		return list;
	}

	
	// 학생정보 검색
	// Exception적용 검색결과가 없으면 throws를 이용해서 StudentException을 던지게끔 처리
	public StudentVO searchStudentVO(String studentNo) {
		int i = list.indexOf(new StudentVO(studentNo, null, null, 0));

		if (i == -1)
			return null;
		return list.get(i);
	}

	
	//수정한거 리스트에 넣기
	public void  fileSave() {
		try (FileOutputStream fos = new FileOutputStream("student.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			} //리스트에 수정한거 다시 넣는걸 for문으로 돌린다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// 학생정보 삭제
	public boolean deleteStudentVO(StudentVO studentVO) { // boolean 데이터타입에 유의하기
		return list.remove(studentVO);
	}

	//csv로 학생 정보 내용 저장(text 출력)
	public void exportCSV() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String fileName = sdf.format(Calendar.getInstance().getTime()) + "_student.csv"; //Calendar.getInstance().getTime() 현재시간 가져오기
		
		String content = new String();
		for (int i = 0; i < list.size(); i++) {
			content += list.get(i).getData() + "\n"; //csv는 줄바꿈을 하면 데이터가 입력된다.데이터를 쓸떄는 콤마로 구분
		}
		
		try(FileWriter fw = new FileWriter(fileName,Charset.forName("EUC-KR"));
				PrintWriter pw = new PrintWriter(fw);){
			pw.print(content);
			pw.flush(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 받은 학생정보 전부(list)를 '년도_월_일_시_분_초_student.csv'라는 파일명으로 파일을 만들어서 넣는다. 
		//그리고 main에 6. 학생 CSV로 내보내기 라는 기능을 하나 더 만들어서 적용한다. 다하면 실제로 엑셀파일이 만들어짐.
		// getDate()를 만들어서 그안에 내용을 csv안에 넣는다. 
	}
	
	//로그를 찍는 메서드를 구현
	public void printLog(String message) {
		SimpleDateFormat logName = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fileName = logName.format(Calendar.getInstance().getTime());
		String log = String.format("%s\t%s",fileName, message);
		
		try (FileWriter fw = new FileWriter("log.txt", true); //.txt 파일을 만드는거니까 FileWriter 사용
				PrintWriter pw = new PrintWriter(fw);) {
			pw.println(log); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//
	
	
}// class


//로그를 찍는 메서드를 구현
//로그를 찍는 메서드는 매개변수로 Exception 메세지를 받음
//현재 날짜 시간 정보를 받아서 log.txt에 Exception 메세지와 같이 출력
//출력 형태 : 2022-12-24 13:34:12 Exception
//서비스에 만들기
