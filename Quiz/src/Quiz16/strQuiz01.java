package Quiz16;

import java.util.Scanner;

public class strQuiz01 {
	public static void main(String[] args) {
		/*
		 * 스캐너를 통해서 id를 입력받ㅅ습니다.
		 * 아이디는 공백을 포함해서 받을 수 있습니다.
		 * 다,ㄴ 공백을 제거한 아이디가 4글자 미만이면 다시
		 * 4글자 이상이라면 "id가 등록되었습니다" 출력하고 종료
 		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String str1 = scan.nextLine();
			int len = str1.replace(" ","").length();

			if(len >= 4 ) {
				System.out.println("id가 등록되었습니다");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		
		
		
		}

		
		
		
		
		
		
		
		
	}
}
