package jdbc;
//학생정보를 한건 입력받아서 입력한 학생 정보를 DB에 작성
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest5 {

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
			int mno = sc.nextInt(); sc.nextLine(); //숫자를 마지막으로 받을땐 sc.nextLine(); 해야함
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","romi","123456");
			String sql = "insert into student values('"+no+"','"+name+"',"+score+","+mno+")";
//			String sql = String.format("insert into student values('%s','%s',%f,%d)",no,name,score,mno);
			
			Statement stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);//insert,update,delete
			System.out.println(sql); //확인용
			
			System.out.println(count +"건 적용되었습니다.");
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//main

}
