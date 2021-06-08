package quiz15;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 1.스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면, 단순히 정수의 합을 출력하고 반복문을 종료하면 됩니다.
		 * 3.만약 입력받은 값이 예외를 발생시키는 값이라면, "정수로만 입력하세요"를 출력한다음에 다시 처음부터 입력받습니다.
		 * 4.반복문을 탈출하면 프로그램 종료 구문을 띄워주세요!
		 * 
		 * ex)정확히 코드를 짜면 - 무한루프
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
		try {
			
		System.out.println(">");
		int a = scan.nextInt();
		System.out.println(">");
		int b = scan.nextInt();
		System.out.println("결과:" + (a+b));
		break;
		
		} catch (Exception e){
			System.out.println("정확히 숫자값을 입력하세요");
			scan.nextLine();//엔터값의제거
		}
		}
		
		
	}
}
