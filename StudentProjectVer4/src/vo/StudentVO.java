package vo;

import java.io.Serializable;
import java.util.Objects;

public class StudentVO implements Serializable{
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;
	private String data;
	
	
	//생성자 - 전체 필드 초기화
	public StudentVO(String studentNo, String studentName, String majorName, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}


	public String getData() {
		return String.format("%s,%s,%s,%f", studentNo,studentName,majorName,score); //%s=String, %f=float , printf와 동일함
//		return studentNo + "," + studentName + "," + majorName + "," + score;
	}


	public void setData(String data) {
		this.data = data;
	}


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

	
	//toString
	@Override
	public String toString() {
		return "StudentVO [studentNo=" + studentNo + ", studentName=" + studentName + ", majorName=" + majorName
				+ ", score=" + score + "]";
	}
	
	
}//class
