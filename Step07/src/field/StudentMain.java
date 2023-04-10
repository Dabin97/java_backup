package field;

public class StudentMain {

	public static void main(String[] args) {
		Student ps = new Student();
		System.out.println(ps);
		ps.Sno = "123456789";
		ps.Sname = "홍길동";
		ps.Smajor = "컴퓨터공학과";
		ps.Sscore = 3.8;
		
		System.out.println(ps.Sno + "," + ps.Sname + "," + ps.Smajor + "," + ps.Sscore);
	}

}
