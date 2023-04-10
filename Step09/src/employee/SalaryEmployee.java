package employee;
/*
 * 영업직 직원은 사번, 이름, 기본급, 인센티브를 가지고 있음
 * 사원정보 출력과 급여를 계산하는 기능을 가지고 있음
 * 영업직 급여 계산 방법은 : 기본급 + 인센티브 
 * 사원정보 출력시 사번, 이름, 급여 계산한 결과를 출력
 */
public class SalaryEmployee extends Employee{

	private int incentive;//부모클래스에게 모두 알아서 받기때문에 추가만 한다. 
	

	public SalaryEmployee(String employeeNo, String employeeName, int salary, int incentive) {
		super(employeeNo, employeeName, salary);
		this.incentive = incentive;
	}

	//영업직 급여 계산
	@Override
	public int calcSalary() {
		//super가 부모를 지칭하기 때문에 부모가 가지고 있는 calcSalary를 실행
		return super.calcSalary() + incentive;
	}
	//출력문을 넣지않아도 main에서 알아서 salary의 +인센티브가 들어간 값으로 출력된다. 오버라이딩으로 인해 

	
	//getter setter
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	

	
	
	
	
}
