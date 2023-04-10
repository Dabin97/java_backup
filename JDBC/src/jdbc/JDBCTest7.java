package jdbc;
//JDBCTest3에 적용된 statement 대신에 PreparedStatement 바꾸어서 적용
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest7 {

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
					+ "where s.major_no = m.major_no and student_name like ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+str+"%"); 
			
			/* 권장하는 방법(sql에서 수정)
			String sql 
			= "select s.student_no, s.student_name, m.major_name, s.score "
			+ "from student s, major m "
			+ "where s.major_no = m.major_no and student_name like '%' || ? || '%'"; //--> ||: 문자열붙이기
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, str); 
			*/
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(String.format("%s %s %s %.2f",
						rs.getString(1),rs.getString(2), 
						rs.getString(3),rs.getDouble(4)) );
			}
			rs.close();
			pstmt.close();
			conn.close(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}//main

}
