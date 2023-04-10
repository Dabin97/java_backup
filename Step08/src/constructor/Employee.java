package constructor;

public class Employee {
	//사번
	private String employeeNo;
	//이름
	private String employeeName;
	//부서명
	private String department;
	//직급명
	private String positionName;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String employeeNo, String employeeName, String department, String positionName) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.department = department;
		this.positionName = positionName;
	}
	//매개변수명이 필드와 동일하다. this. --> 자기자신 객체를 나타낸다. 현재 메모리가 형성된 객체명, 밖에서 쓰는 변수명
	//여기서는 emp1.employeeNo 를 의미한다. 그러므로 this.employeeNo는 필드명 색깔이 된다. 

	public String getEmployeeNo() {
		return employeeNo;
	} //기본생성장


	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	} // 생성자 + 초기화 : 필수로 넣어야하는 것


	//setter , getter - 선택사항
	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getPositionName() {
		return positionName;
	}


	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	
	//toString - 선택사항
	//오버라이딩 : 상위 클래스의 메소드를 하위 클래스에서 똑같은 이름으로 재정의하는 것을 말한다.
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", department=" + department
				+ ", positionName=" + positionName + "]";
	}
	
	
	//알트+쉬프트+S = source 창 여는 단축키 / 이후엔 밑줄 그어져있는 키워드 알파벳을 누르기 (C, O, R)
	
}//class
