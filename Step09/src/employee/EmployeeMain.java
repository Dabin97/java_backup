package employee;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		
		while(true) { //계속 돌리기. break 또는 return으로 강종
			System.out.println("---- 사원 관리 프로그램 ----");
			System.out.println("   1. 사원정보 등록");
			System.out.println("   2. 사원정보 전체출력");
			System.out.println("   3. 사원정보 검색");
			System.out.println("   4. 사원정보 삭제");
			System.out.println("   5. 사원정보 수정");
			System.out.println("   0. 프로그램 종료");
			System.out.print("   원하시는 번호를 입력하세요 : ");
			int n = sc.nextInt(); sc.nextLine();
			
		switch(n) {
		case 1: 
			service.appendEmployee(sc); 
			break;
		case 2: 
			service.printAllEmployee();
			break;
		case 3: 
			service.searchEmployee(sc);
			break;
		case 4: 
			service.deleteEmployee(sc);
		case 5: 
			service.updateEmployee(sc);
			break;
		case 0: 
			System.out.println("프로그램을 종료합니다."); 
			return; 
			}
		}//while
		
	}//main

}//class
