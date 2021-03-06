package jdbc.example.step2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//모델객체생성
		IMembersDAO dao = new MembersDAO();
				
		
		while(true) {
			
			System.out.println("=========메뉴선택=========");
			System.out.println("[1.회원조회 2.회원추가 3.회원수정 4.회원삭제]");
			
			System.out.print("선택>");
			String menu = scan.next();
			
			switch (menu) {
			case "1":
				System.out.print("조회할ID>");
				String id = scan.next(); 
				
				Members vo = dao.select(id);
				
				if(vo == null) { //데이터가 없는경우
					System.out.println("존재하지 않는 아이디입니다");
				} else {
					System.out.println("아이디:" + vo.getId());
					System.out.println("비밀번호:" + vo.getPw());
					System.out.println("이름:" + vo.getName());
					System.out.println("이메일:" + vo.getEmail());
				}

				break;
			case "2":
				//인터페이스에 insert메서드는 선언하고 model클래스에서
				//데이터베이스에 insert하는 메서드를 오버라이딩 해서 작성.
				//해당 메서드가 1을 반환한다면, "정상적으로 추가되었스빈다"를 출력
				//0을 반환하면 "다시입력하세요" 출력
				System.out.println("회원을 추가합니다");
				System.out.print("아이디 > ");
				String ids = scan.next();
				System.out.print("비밀번호 > ");
				String pw = scan.next();
				System.out.println("이름 > ");
				String name = scan.next();
				System.out.print("이메일 > ");
				String email = scan.next();
				
				int result = dao.insert(ids, pw, name, email);
				
				if(result ==1) {
					System.out.println("정상적으로 추가되었습니다");
				} else {
					System.out.println("다시 입력하세요");
				}

				break;
			case "3":
				//아이디, 비밀번호, 이름, 이메일을 받아서 DB에 update작업을 수행합니다.
				//인터페이스에 update메서드를 선언하고 model에서는 오벌아ㅣ딩 해서 작성하면 됩니다.
				//성공기 "정상 처리되었습니다", 실패시 "존재하지 않는 아이디 입니다."
				System.out.println("업데이트를 실행합니다");
				System.out.print("바꿀 아이디");
				String wid = scan.next();
				System.out.print("아이디 > ");
				String uds = scan.next();
				System.out.print("비밀번호 > ");
				String upw = scan.next();
				System.out.print("이름 > ");
				String uname = scan.next();
				System.out.print("이메일 > ");
				String uemail = scan.next();
				
				int uresult = dao.update(uds, upw, uname, uemail, wid);
				
				if(uresult ==1) {
					System.out.println("정상적으로 업데이트되었습니다");
				} else {
					System.out.println("다시 입력하세요");
				}
				
				break;
			case "4":
				//....
				break;


			default:
				break;
			}
			
			
			
			
		}
		
		
		
	}
}
