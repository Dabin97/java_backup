package employee;
/*
 * 직원 클래스는 사번, 이름, 기본급을 가지고 있습니다.
 * 기능으로는 사원정보 출력, 급여 계산하는 기능을 가지고 있습니다.
 * 사원정보 출력시 나타낼 내용은 사번 - 이름 - 급여 출력.
 * 생성자는 모든 필드를 초기화하는 기능으로 작성
 * 급여 = 기본급
 */
public class Employee {	
	private String employeeNo;
	private String employeeName;
	private int salary;
	
	

	public Employee(String employeeNo, String employeeName, int salary) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
		
	}
	//필드 : 클래스에서 데이터 저장하기 위한 변수 선언한 것
	//기본 생성자 안에서 간단하게 필드를 초기화해도 된다. 
	

	//급여계산
	public int calcSalary() {
		return salary;
	}
	
	public void printEmployeeInfo() {
		System.out.println(employeeNo + " " + employeeName + " " + calcSalary());
	}


	//getter setter

	public String getEmployeeNo() {
		return employeeNo;
	}



	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;  //필요한 setter getter만 만들어도 된다. 
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	
}//class
