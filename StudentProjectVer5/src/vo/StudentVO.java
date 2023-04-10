package vo;

import java.util.Objects;

public class StudentVO {
	private String studentNo;
	private String studentName;
	private int majorNo;
	private String majorName;
	private double score;
	
	//데이터 조회용 생성자 - int majorNo
	public StudentVO(String studentNo, String studentName, int majorNo, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorNo = majorNo;
		this.score = score;
	}
	
	
	
	//데이터 추가용 생성자 - String majorName
	public StudentVO(String studentNo, String studentName, String majorName, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}
	
	//학생정보 출력 메서드 - 학번, 이름, 학과명 - null일때는 학과번호, 평점
	public void printStudentInfo() {
		System.out.println(String.format("%s %s %s %.2f",studentNo, studentName, 
				(majorName==null ? String.valueOf(majorNo) : majorName),score));
	}
	//String.valueOf(majorNo) : 숫자->문자
	
	

	//setter/getter	
	public String getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getMajorName() {
		return majorName;
	}


	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}

	
	
	public int getMajorNo() {
		return majorNo;
	}



	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
	}



	//equals를 이용해서 비교, 학번만 일치하면 일치한 것으로 비교하는 메서드를 재정의
	@Override   //shift+alt+s - hashcode
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		return Objects.equals(studentNo, other.studentNo);
	}

	
	@Override
	public String toString() {
		return "StudentVO [studentNo=" + studentNo + ", studentName=" + studentName + ", majorNo=" + majorNo
				+ ", majorName=" + majorName + ", score=" + score + "]";
	}
	
	
	
	
	
}//class
