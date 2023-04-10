package jdbc;
//데이터 끼워넣기 '?' 사용 <PreparedStatement>
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest6 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("학번을 입력하세요 : ");
			String no = sc.nextLine();
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("평점을 입력하세요 : ");
			Double score = sc.nextDouble();
			System.out.print("학과번호를 입력하세요(1~14) : ");
			int mno = sc.nextInt(); sc.nextLine(); 
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","romi","123456");
			String sql = "insert into student values(?,?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//?에 데이터를 셋팅
			pstmt.setString(1, no); //1번째 ?에 no값을 넣겠다.
			pstmt.setString(2, name); 
			pstmt.setDouble(3, score); 
			pstmt.setInt(4, mno); //set 데이터 타입도 맞춰준다.
			
			int count = pstmt.executeUpdate();//executeUpdate(괄호)안에 전처럼 sql이 들어가면 초기화되므로 꼭 비워준다!
			
			System.out.println(count +"건 적용되었습니다.");
			
			pstmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//main

}
