package Quiz16;

import java.util.Scanner;

public class strQuiz02 {
	public static void main(String[] args) {
		/*
		 * 주민번호 13자리를 입력받습니다
		 * 주만번호는 - 포함해서 받을 수도 있습니다
		 * 13자리가 아니라면 다시 입력받습니다.
		 * 남자 or 여자인지 구분해서 출력해주면 됩니다.
		 */
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		System.out.println(a);
		a = a.replace("-", "");
		
		if(a.length() != 13) {
			System.out.println("주민번호는 13자리입니다.");
		} else {
		if (a.charAt(6) == '1' || a.charAt(6) == 3) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
	}
		
		
		
		
	}
}
