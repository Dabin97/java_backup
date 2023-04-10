package field;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee el = new Employee();
		el.employeeNo = "123456789";
		el.employeeName = "홍길동";
		el.departmentCode = "0010";
		el.salary = 3000000;
		el.rank = "사원";
		
		System.out.println(el.employeeNo + "," + el.employeeName + "," + 
						   el.departmentCode + "," + el.salary + "," + el.rank);
	} //main

}
//객체지향언어 : 일을 하는 대상을(객체) 코드로 표현한 것. 그 결과물이 class.
//class에는 데이터(대상이 가지고있는 값) / 필드(멤버변수) : 데이터를 나타낸것 /메서드(함수) 객체에게 명령을 내려 수행하게 하는 것
//데이터 만들기 -> 기능(메서드) 만들기