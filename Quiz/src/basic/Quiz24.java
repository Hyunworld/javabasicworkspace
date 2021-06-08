package basic;

import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		int Ok = 0;
//		int fall = 0;
//		
//		while (true) {
//			int a = (int)(Math.random() * 100) + 1;
//			int b = (int)(Math.random() * 100) + 1;
//		System.out.println(a + "+" + b + "=" + "?");
//		System.out.println("[문제를 그만 푸시려면 0을 입력하세요].");
//		System.out.print("> ");
//		
//		int i = scan.nextInt();
//		
//		if (i == a+b) {
//			System.out.println("정답입니다!!");
//			Ok++;
//			
//		} else if (i == 0) {
//			System.out.println("프로그램을 종료합니다.");
//			System.out.println("--------------------------------");
//			System.out.println("정답 횟수 : " + Ok + "회");
//			System.out.println("틀린 횟수 : " + fall + "회");
//			break;
//			
//		} else {
//			System.out.println("틀렸는데요??");
//			fall++;
//			
//		}
//		
		
			//음수도 나오게 변경
		Scanner scan = new Scanner(System.in);
		int Ok = 0;
		int oper = 0;
		
		while (true) {
			int a = (int)(Math.random() * 100) + 1;
			int b = (int)(Math.random() * 100) + 1;
			int c = (int)(Math.random() * 2);
			
		if(c == 0) {	
		System.out.println(a + "+" + b + "=" + "?");
		System.out.println("[문제를 그만 푸시려면 0을 입력하세요].");
		System.out.print("> ");
		
		int i = scan.nextInt();
		
		if (i == a+b) {
			System.out.println("정답입니다!!");
			Ok++;
			
		} else if (i == 0) {
			System.out.println("프로그램을 종료합니다.");
			System.out.println("--------------------------------");
			System.out.println("정답 횟수 : " + Ok + "회");
			System.out.println("틀린 횟수 : " + oper + "회");
			break;
			
		} else {
			System.out.println("틀렸는데요??");
			oper++;
		}
			
		}
		
		if (c==1) {
			
			System.out.println(a + "-" + b + "=" + "?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요].");
			System.out.print("> ");
			
			int i = scan.nextInt();
			
			if (i == a-b) {
				System.out.println("정답입니다!!");
				Ok++;
				
			} else if (i == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("--------------------------------");
				System.out.println("정답 횟수 : " + Ok + "회");
				System.out.println("틀린 횟수 : " + oper + "회");
				break;
				
			} else {
				System.out.println("틀렸는데요??");
				oper++;
		}
		
		
		
		
		
		
		}
		}
		
		
	}
}
		

