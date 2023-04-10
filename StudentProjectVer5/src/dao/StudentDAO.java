package dao;
//DB 접근해서 처리하는 부분

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import config.DBManager;
import exception.StudentException;
import vo.StudentVO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {	
	
	}
	
	public static StudentDAO getInstance() { 
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public void insertStudent(StudentVO studentVO) throws StudentException {
		//받아온 StudentVO 객체를 DB에 저장
		Connection conn = DBManager.getInstance().getConn();
		PreparedStatement pstmt = null;
		String sql = String.format("insert into student values(?,?,?,?)");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentVO.getStudentNo()); 
			pstmt.setString(2, studentVO.getStudentName()); 
			pstmt.setDouble(3, studentVO.getScore()); 
			pstmt.setInt(4, studentVO.getMajorNo()); 
			
			pstmt.executeQuery();
			System.out.println("학생정보 등록 완료");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new StudentException("학생 정보 등록 실패");
		}finally {
			DBManager.getInstance().close(null, pstmt);
		}
	}

	public void deleteStudent(String studentNo) throws StudentException {
		Connection conn = DBManager.getInstance().getConn();

		String sql = "delete from student where student_no = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentNo);

			if(pstmt.executeUpdate()==0)
				throw new StudentException("학생정보 삭제 실패");
			System.out.println("학생정보 삭제 완료");
			//ExecuteUpdate : 수행결과로 Int 타입의 값을 반환합니다. ExecuteUpdate --> insert update delete 할때
			//ExecuteQuery : 수행결과로 ResultSet 객체의 값을 반환합니다. ExecuteQuery ---> select 할때
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new StudentException("학생정보 삭제 실패");
		} finally {
			DBManager.getInstance().close(null, pstmt);
		}
	}

	public StudentVO searchStudent(String studentNo) {
		String sql 
		= String.format("select s.student_no, s.student_name, m.major_name, s.score "
		+ "from student s, major m "
		+ "where s.major_no = m.major_no and student_no = ?");
		PreparedStatement pstmt = null;//close를 위해 밖에서 초기화하는것
		ResultSet rs = null; //조회 받는 용 << 이걸로 보낸다
		StudentVO vo = null;
		
		try {
			pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo); 
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new StudentVO(rs.getString(1), rs.getString(2), 
								   rs.getString(3), rs.getDouble(4));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			DBManager.getInstance().close(rs, pstmt);
		}
		return vo;
	}

	public ArrayList<StudentVO> selectAllStudent() {
		String sql 
		="select s.student_no, s.student_name, m.major_name, s.score "
		+ "from student s, major m "
		+ "where s.major_no = m.major_no";
		PreparedStatement pstmt = null;//close를 위해 밖에서 초기화하는것
		ResultSet rs = null; //조회 받는 용 << 이걸로 보낸다
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();

		try {
			pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
		
			while(rs.next()) {
				list.add(new StudentVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getDouble(4)));
			} 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			DBManager.getInstance().close(rs, pstmt);
		}
		return list;
	}
	//return부분이 어려웠는데, public ArrayList<StudentVO>로 만든 함수이기 때문에 return list;로 해주면 된다.
	//그러려면 ArrayList<StudentVO> list = new ArrayList<StudentVO>();를 하나 만들어서
	// 출력할 값을 list.add 리스트에 넣기만 하면 된다.

	public void updateStudent(StudentVO vo) throws StudentException{
		Connection conn = DBManager.getInstance().getConn();
		PreparedStatement pstmt = null;
		String sql = "update student set student_name = ?, major_no = ?, "
				+ "score = ? where student_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getStudentName()); 
			pstmt.setInt(2, vo.getMajorNo()); 
			pstmt.setDouble(3, vo.getScore()); 
			pstmt.setString(4, vo.getStudentNo()); 
			
			if(pstmt.executeUpdate()==0)
				throw new StudentException("학생정보 수정 실패");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new StudentException("학생 정보 수정 실패");
		}finally {
			DBManager.getInstance().close(null, pstmt);
		}
	}

	
	//평점 Top3 출력
	public ArrayList<StudentVO> selectRankStudent() {
		String sql 
		="select * from (select RANK() over(order by s.score DESC) as rank_no, "
				+ "s.student_no, s.student_name, m.major_name, s.score "
				+ "from student s,  major m where s.major_no = m.major_no) "
				+ "where rank_no <= 3";
		Statement stmt = null;
		ResultSet rs = null; 
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();

		try {
			stmt = DBManager.getInstance().getConn().prepareStatement(sql);
			rs = stmt.executeQuery(sql);
		
			while(rs.next()) {
				list.add(new StudentVO(rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getDouble(5)));
			} 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			DBManager.getInstance().close(rs, stmt);
		}
		return list;
	}
	
	
	
	
}//class
