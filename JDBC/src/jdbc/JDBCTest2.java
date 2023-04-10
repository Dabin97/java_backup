package jdbc;
//학생정보 출력시 학번, 이름, 학과명, 평점,
//학과명이 공학이 포함된 정보만 조회
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {

	public static void main(String[] args) {
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB Connect
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe","romi","123456");
			//3. SQL Generate
			String sql 
					= "select s.student_no, s.student_name, m.major_name, s.score "
					+ "from student s, major m"
					+ " where s.major_no = m.major_no and major_name like '%공학%'";
			// sql문으로는 잘 출력되는데 자바로 치면 출력이 잘 안된 이유 :
			// sql문에서 친것을 가져올때 " " + " " 형식으로 바뀌는데, 여기서 코드 사이에 띄워쓰기가 제대로 안들어가면 작동하지않는다.
			// s.score와 from사이의 띄워쓰기 / major m과 where 사이에 띄워쓰기가 빠져있었다. syso(sql)을 하면 문제가 보인다.
		
			//4. State Create
			Statement stmt = conn.createStatement();
			//5. SQL Excute
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(String.format("%s %s %s %.2f",
						rs.getString(1),rs.getString(2), 
						rs.getString(3),rs.getDouble(4)) );
			}
			//6. Close
			rs.close();
			stmt.close();
			conn.close(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//main

}
