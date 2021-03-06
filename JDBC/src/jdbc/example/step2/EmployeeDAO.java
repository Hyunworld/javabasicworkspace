package jdbc.example.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO implements IMembersDAO{
	

	String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; //18c
	String uid = "hr"; //계쩡명
	String upw = "hr"; //비밀번호
	
		public Members select (String id) {

			//DB관련변수선언

			Members vo = null; //값을 저장해서 반환할 함수 
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "select * from members where id = ?";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 커넥션 생성
				conn = DriverManager.getConnection(url, uid,upw);
				//pstmt생성
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) { //결과가 있는 경우
					
				} else { //결과가 없는경우
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
				} catch(Exception e2) {
				}
			}
			
			
			return vo; //반환 
		} //end select

		@Override
		public int insert(String id, String pw, String name, String email) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int update(String id, String pw, String name, String email, String rid) {

			return 0;
		}

		


}