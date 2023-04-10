package array;

	public class Student {
		private String Sname; 
		private String Sno;
		private String Smajor;
		private double Sscore;
	
	
	//생성자 - 이름, 학번, 학과명, 평점
	public Student(String name, String no, String major, double score) {
		Sname = name;
		Sno = no;
		Smajor = major;
		if(score>=0.0 && score<4.6) {
			Sscore = score; }
	}
	
		
		//setter
		public void setName(String name) { 
			Sname = name;
		}
		public void setNo(String no) { 
			Sno = no;
		}
		public void setMajor(String major) { 
			Smajor = major;
		}
		public void setScore(double score) { 
			if(score>=0.0 && score<4.6)
				Sscore = score;
		}
		
		//getter
		public String getName() { 
			return Sname;
		}
		public String getNo() { 
			return Sno;
		}
		public String getmajor() { 
			return Smajor;
		}
		public double getscore() { 
			return Sscore;
		}
		
		//출력
		public void printStudentInfo() {
			System.out.println("이름 : " + Sname + ", 학번 : " + Sno + ", 학과명 : " + Smajor + ", 평점 : " + Sscore + getGrade());
		}

		private String getGrade() {
			if(Sscore == 4.5) 	   return "(A+)";
			else if(Sscore >= 4.0) return "(A)";
			else if(Sscore >= 3.5) return "(B+)";
			else if(Sscore >= 3.0) return "(B)";
			else if(Sscore >= 2.5) return "(C+)";
			else if(Sscore >= 2.0) return "(C)";
			else if(Sscore >= 1.5) return "(D+)";
			else if(Sscore >= 1.0) return "(D)";
			else return "(F)";
		}
		
		
	
	
	
}//class
