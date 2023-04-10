package employee;
/*
 * 파견직 직원은 사번, 이름, 기본급, 파견지 등급을 가지고 있음
 * 파견직의 급여 계산 방법 : 기본급 + 기본급 * 파견지 등급에 따른 퍼센테이지
 * 	
 * 		파견지 등급 : A - 30% , B - 15%, C - 8%
 * 
 * 급여계산 결과는 소수점을 전부 제거
 */
public class DispartchEmployee extends Employee{
	private char grade;
	
	public DispartchEmployee(String employeeNo, String employeeName, int salary, char grade) {
		super(employeeNo, employeeName, salary);
		this.grade = grade;
	}

	//파견직 급여 계산 - 오버라이딩으로 가져와서 안에 if문을 만들어서 계산한다. 
	@Override
	public int calcSalary() {
		double ratio = 0.08; //C등급은 8%	
		if(grade == 'A') ratio = 0.3;
		if(grade == 'B') ratio = 0.15;
		return super.calcSalary() + (int)(super.calcSalary() * ratio);
//		return (int)(super.calcSalary() * (1 + ratio)); 같은 식
	}

	
	//getter setter
	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}


	
	
}//class


