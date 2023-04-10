package jdbc;
//학생정보이름의 일부를 입력해서
//학생정보 출력시 학번, 이름, 학과명, 평점을 조회
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest3 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 이름을 입력하세요 : ");
			String str = sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe","romi","123456");
			String sql 
					= "select s.student_no, s.student_name, m.major_name, s.score "
					+ "from student s, major m "
					+ "where s.major_no = m.major_no and student_name like '%"+str+"%'";
			//str을 어떻게 넣어야하나 고민했는데, sql문 사이에 + +로 자리를 만들어서 str을 넣으면 된다.
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(String.format("%s %s %s %.2f",
						rs.getString(1),rs.getString(2), 
						rs.getString(3),rs.getDouble(4)) );
			}
			rs.close();
			stmt.close();
			conn.close(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
//		-------------------------------------------------------------------------
		
/*		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 이름을 입력하세요 : ");
			String str = sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe","romi","123456");
			String sql 
					= "select s.student_no, s.student_name, m.major_name, s.score "
					+ "from student s, major m "
					+ "where s.major_no = m.major_no and student_name like '%%%s%%'";
			//+str+대신 String.format을 사용한 경우 %를 더 추가해야 작동한다.
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(String.format("%s %s %s %.2f",
						rs.getString(1),rs.getString(2), 
						rs.getString(3),rs.getDouble(4)) );
			}
			rs.close();
			stmt.close();
			conn.close(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
*/		
		
	}//main

}
