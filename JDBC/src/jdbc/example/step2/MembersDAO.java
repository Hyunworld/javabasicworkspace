package jdbc.example.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembersDAO implements IMembersDAO {

	//DB관련변수 멤버변수선언
	private String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; //18c
	private String uid = "HR"; //계정명
	private String upw = "HR"; //비밀번호
		
	//조회기능(id를 받아서 조회)
	public Members select(String id) {
				
		Members vo = null; //값을 저장해서 반환할 변수

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from members where id = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션생성
			conn = DriverManager.getConnection(url, uid, upw);
			//pstmt생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			//sql문실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //결과가 있는 경우
				
				String ids = rs.getString("id");
				String pw = rs.getString("pw"); 
				String name = rs.getString("name");
				String email = rs.getString("email");
				
				vo = new Members(ids, pw, name, email);
												
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		
		return vo; //반환
				
	} //end select

	
	
	public int insert(String id, String pw, String name, String email) {
		
		int result = 0; 
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into members values(?, ?, ?, ?)";
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			result = pstmt.executeUpdate();

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e) {
			}
			
		}
		
		return result;
	}



	
	
	@Override
	public int update(String id, String pw, String name, String email, String rid) {
		int result = 0; 
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update members set id = ?, pw = ?, name = ?, email = ? where id = ?";
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setString(5, rid);
			
			result = pstmt.executeUpdate();

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e) {
			}
			
		}
		
		return result;
	}
		
}
