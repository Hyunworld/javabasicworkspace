package jdbc.example.step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JDBCSelect {

	public static void main(String[] args) {
		
		//1. 데이터베이스 연결에 필요한 변수선언
		//연결주소형식: 정해진이름:아이피주소:포트번호:데이터베이스명
//		String url = "jdbc:oracle:thin:@localhost:1521:XE"; //11g
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; //18c
		String uid = "hr"; //계정명
		String upw = "hr"; //비밀번호
		
		String sql = "select employee_id, last_name, hire_date, salary, department_id from employees";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//데이터베이스 연결구문은 throws를 던지고 있기 때문에 try구문안에서 작성을 합니다.
		try {
			//2.드라이버 로드(호출)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//3. Connection객체 생성 - DriverManger클래스가 제공하는 getConnection(주소, 아이디, 비밀번호)를 이용해서 생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			//4. Statement객체 생성 - connection객체로 부터 생성
			//pstmt은 매개변수로 실행할 sql문을 받습니다.
			pstmt = conn.prepareStatement(sql);
			
			//5. sql문 쿼리 실행 - select문은 executeQuery()로 실행, i,u,d문은 executeUpdate()구문 실행
			rs = pstmt.executeQuery();
			
			//6. select문의 실행 결과가 하나라도 존재하면, ResultSet의 next()메서드는 true반환합니다.
			while(rs.next()) {
				//한 행에 대해서 처리할 작업
				//문자열 - getString
				//숫자 - getInt
				//날짜 - Date or TimeStamp
				String id = rs.getString("employee_id");
				String name = rs.getString("last_name");
				Timestamp hire_date = rs.getTimestamp("hire_date"); //날짜형
				int salary = rs.getInt("salary");
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(hire_date);
				System.out.println(salary);
				System.out.println("-------------------");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace(); //오류결과
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				
			}			
		}
		
		
		
		
		
	}
}
