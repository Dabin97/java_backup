package method;
// 학생 정보 학번, 이름, 학과명, 평점
public class Student {
	String Sname; //컨트롤 스페이스하면 알아서 자동완성이 되기때문에 이름을 최대한 알아보기쉽게 길게 지어도된다.
	String Sno;
	String Smajor;
	double Sscore;
	
	//학생정보 초기화하는 메서드
	void init(String n, String sn, String sm, double sc) {
		Sname = n;
		Sno = sn;
		Smajor = sm;
		Sscore = sc; //위의 변수와 매개변수명이 같으면 안된다. 
	}
	//학생정보 출력하는 메서드
	//출력형태 213465646 김철수 경영학과 3.6
	void printStudentInfo(){
		System.out.println(Sno + " " + Sname + " " + Smajor + " " + Sscore);
	}
}
