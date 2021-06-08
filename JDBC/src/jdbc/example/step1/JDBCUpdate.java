package jdbc.example.step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpdate {
	
	public static void main(String[] args) {
		
		/* 스캐너를 이용해서
		 * emps에서 수정할 id를 받아서 이름, 이메일, 급여를 수정하는 JDBC프로그램을 작성.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 아이디>");
		String id = scan.next();
		
		System.out.print("수정할 이름>");
		String name =scan.next();
		System.out.print("수정할 이메일>");
		String email = scan.next();
		System.out.print("수정할 급여>");
		int salary = scan.nextInt();
		
		//DB필요한 변수
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; //18c
		String uid = "hr"; //계정명
		String upw = "hr"; //비밀번호
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update emps set last_name = ?, email = ?, salary = ? where employee_id = ?";
		
		try {
			//드라이버로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션생성
			conn = DriverManager.getConnection(url, uid, upw);
			//pstmt생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, salary);
			pstmt.setString(4, id);
			
			//실행
			int result = pstmt.executeUpdate();
			
			if(result == 1) { //성공
				System.out.println("정상 처리되었습니다");
			} else { //실패
				System.out.println("아이디를 확인하세요");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
