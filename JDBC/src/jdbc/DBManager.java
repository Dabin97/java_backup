package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	private static DBManager instance = new DBManager();
	private Connection conn;
	
	private DBManager() { 
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속 정보 conn에 저장
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe","romi","123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//close 메서드 --> 외부에서 ResultSet, Statement 객체를 받아서 close
	public void close(ResultSet rs, Statement stmt){
		try {
			if(rs != null) rs.close();
			if(stmt != null)stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}
	
	public static DBManager getInstance() { 
		if(instance == null)
			instance = new DBManager();
		return instance;
	}
	
	

}//class
