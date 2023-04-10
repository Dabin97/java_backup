package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB Connect
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe","romi","123456");
			//3. SQL Generate
			String sql = "select * from student";
			//4. State Create
			Statement stmt = conn.createStatement();
			//5. SQL Excute
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)
				+ " " + rs.getDouble(3) + " " + rs.getInt(4));
			} 
			//(1)학번 (2)이름 (3)평점 (4)학과번호 - 가져오기, 자료형타입 맞춰주기  <--순번으로 뽑기
			//숫자 대신 컬럼명으로 써도 된다. rs.getString("student_no")		<--컬럼명으로 뽑기
			//6. Close
			rs.close();
			stmt.close();
			conn.close(); //close는 역순으로
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//main

}
