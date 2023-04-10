package method;

public class StudentMain {

	public static void main(String[] args) {
		Student p1 = new Student();
		p1.init("홍길동", "123456789", "국어국문학과", 3.8);
		p1.printStudentInfo();
		
		Student p2 = new Student();
		p2.init("김철수", "987654321", "경영학과", 3.6);
		p2.printStudentInfo();
		
	}

}
