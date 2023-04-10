package employee;
/*
 * 사원정보 등록시 해야될 일
 * 1. 등록할 사원 종류를 선탣(일반, 영업, 파견)
 * 2. 사번, 이름, 기본급 입력 후
 * 	  사원 종류에 따른 데이터 입력
 * 	  영업직은 인센티브 입력, 파견직은 파견지 등급 입력
 * 3. 입력이 완료되면 배열에 추가
 * 
 * 전체 사원 정보 출력
 * 생성자에서 일반, 영업직, 파견직 하나씩 미리 저장
 * 전체 사원 정보 출력 작성 후 테스트
 */
import java.util.Scanner;

public class EmployeeService{
	private Employee[] arr;
	private int idx;
	
	public EmployeeService() {
		arr = new Employee[5];
		arr[idx++] = new Employee("2222", "이영희", 300);
		arr[idx++] = new SalaryEmployee("3333", "박영수", 200, 90); 
		arr[idx++] = new DispartchEmployee("3333", "홍길동", 400, 'A');
	}
	
	
	//학생정보 등록
	public void appendEmployee(Scanner sc) {
		System.out.println("사원정보 등록을 시작합니다...");
		
		if(idx == arr.length) { 
			System.out.println("더 이상 등록할 공간이 없습니다.");
			return;
		} 
		
		System.out.print("등록할 사원 종류를 선택하세요. (1 - 일반사원, 2 - 영업직, 3 - 파견직) : ");
		int no = sc.nextInt(); sc.nextLine();
		
		System.out.print("등록할 사원번호 : ");
		String EmployeeNo = sc.nextLine();
		System.out.print("등록할 사원이름 : ");
		String EmployeeName = sc.nextLine();
		System.out.print("등록할 기본금: ");
		int salary = sc.nextInt(); sc.nextLine();
		//공통적으로 받을 스캐너를 먼저 위로 올리고 아래에 switch문을 쓰기
		
		switch(no) {
		case 1:
			arr[idx++] = new Employee(EmployeeNo, EmployeeName, salary);
			break;
		case 2:
			System.out.print("인센티브 입력 : ");
			int incentive = sc.nextInt(); 
			arr[idx++] = new SalaryEmployee(EmployeeNo, EmployeeName, salary, incentive);
			break;			//위의 자식클래스 이름 주의하기 
		case 3:
			System.out.print("파견지 등급 입력(A,B,C) : ");
			char grade = sc.nextLine().charAt(0); //문자 읽어오는 방법, str이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환한다는 의미
			arr[idx++] = new DispartchEmployee(EmployeeNo, EmployeeName, salary, grade);
			break;
		}
//		idx++; : arr[idx]일때, 위에 넣으면 3개나 넣어야하니까 아래로 빼서 중복없앰.
		System.out.println("사원정보 등록이 완료되었습니다.");
	}
	

	
	//전체사원정보 출력
	public void printAllEmployee() {
		System.out.println("전체 사원 정보를 출력합니다....");
		if(idx==0) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		for(int i=0;i<idx;i++) { 
			arr[i].printEmployeeInfo(); //Employee에서 만들었던 printEmployeeInfo을 가져온다.
		}
		System.out.println();
	}
	
	
	
	//사원정보 검색
	public int searchEmployee(Scanner sc) {
		System.out.println("사원정보 검색을 시작합니다.....");
		System.out.print("검색할 사원번호를 입력하세요 : ");
		String n = sc.nextLine();
		
		for (int i = 0; i < idx; i++) { 
			if(arr[i].getEmployeeNo().equals(n)) {  //보이는 것은 getEmployeeNo()하나, Employee클래스에만 getter setter를 추가해도 잘 작동한다. 
				System.out.println("검색결과");
				arr[i].printEmployeeInfo();   //for문을 돌며 찾는것은 Employee의 속해있는 printEmployeeInfo 함수
				return i; //void문이 아니므로 return i를 해주어야 한다. 
			}
		}//for
		System.out.println("찾는 사원 정보가 없습니다.");
		return -1; //i에 없는 -1을 넣어 강제종료
	}
	
	
	public void deleteEmployee(Scanner sc) {
		System.out.println("사원 정보를 삭제를 시작합니다....");
		int r = searchEmployee(sc); 
		if(r==-1) {
			System.out.println("사원 정보 삭제 실패");
			return; 
		}
		
		for (int i = r; i < idx-1; i++) { //idx-1을 하지않으면 땡겨올게 없는 뒷부분에서 터진다.
			arr[i] = arr[i+1]; 
		}
		idx--;
		System.out.println("삭제 작업이 정상적으로 이루어졌습니다.");
	}
	
	
	  //사원데이터 수정
	  public void updateEmployee(Scanner sc) {
		System.out.println("사원 정보 수정을 시작합니다....");
		int r = searchEmployee(sc); 
		if(r==-1) {
			System.out.println("수정할 사원 정보가 없습니다.");
			return; 
		}
		
		System.out.print("수정할 사원이름 : ");
		arr[r].setEmployeeName(sc.nextLine());
		System.out.print("수정할 기본급 : ");
		arr[r].setSalary( sc.nextInt()); sc.nextLine(); //default로 물어볼 질문 2개 먼저 올림.
		
		
		/*
		//instanceof를 사용한 경우(형변환되는여부를 논리값으로 나타냄)
		if(arr[r] instanceof DispartchEmployee) {  //Employee가 부모클래스라서 무조건 true가 나오므로 위에서부터 내려와 비교할수없기때문에, 최하위 클래스부터 써야한다. 
			System.out.print("수정할 파견지 등급 입력(A,B,C) : ");
			((DispartchEmployee)arr[r]).setGrade(sc.nextLine().charAt(0)); 
		}else if(arr[r] instanceof SalaryEmployee) {
			System.out.print("수정할 인센티브 입력: ");
			((SalaryEmployee)arr[r]).setIncentive(sc.nextInt()); sc.nextLine();
		}
		//instanceof는 형변환되는지를 논리값으로 나타내는 것이므로, 받은값이 파견직으로 형변환이 되면 파견직 값을 수정
		//만약 아니라면 파견직이 아니라 영업직 정보를 수정하는 else if코드로 내려간다. arr[r] instanceof DispartchEmployee 여부 확인 조건식
		//맞다면 ((DispartchEmployee)arr[r])를 통해 형변환시켜서 값을 넣어준다.
		//만약 영업직 정보를 입력받았다면 DispartchEmployee로 형변환이 되지않으므로 아래 코드로 내려간다. 이유는 자식클래스끼리는 형변환이 되지않기때문이다.
		
		// set 메서드를 사용하는건 동일하지만, 이렇게 따로 아래에 빼지않고 아예 if안에 넣어서 입력과 데이터 넣기를 동시에 해결한다.
		arr[r].setEmployeeName(EmployeeName);
		arr[r].setEmployeeNo(EmployeeNo);
		arr[r].setIncentive(incentive); 
		arr[r].setGrade(grade); 
		*/
		
		
		//Class의 getName을 이용하는 방법
		if(arr[r].getClass().getName().equals(DispartchEmployee.class.getName())) {
			System.out.print("수정할 파견지 등급 입력(A,B,C) : ");
			((DispartchEmployee)arr[r]).setGrade(sc.nextLine().charAt(0));
		}else if(arr[r].getClass().getName().equals(SalaryEmployee.class.getName())){
			System.out.print("수정할 인센티브 입력 : ");
			((SalaryEmployee)arr[r]).setIncentive(sc.nextInt()); sc.nextLine();
		}
		
		//출력
		System.out.println("사원 데이터 수정 완료");
		
		//수정이 어려운 이유는 사번으로 사원의 직급종류를 알수없다. 
		//부모클래스가 자식클래스가 될수있다. 자식->부모 형변환가능. 자식->부모->자식으로 형변환,그러나 샐러리->employee->파견직은 불가능하다. 영업직과 파견직은 다르기 때문이다.
		//객체를 형변환할때는 데이터 손실이 일어나지않는다. 이유는 원본이 아니라 메모리주소를 사용하기때문이다.(레퍼런스 타입)
		//수정 방법 : 클래스명을 뽑는 방법(String) / 형변환 여부를 물어보기(boolean)(instance of 키워드)
		
	}//updateEmployee
	 
	
 }//class

