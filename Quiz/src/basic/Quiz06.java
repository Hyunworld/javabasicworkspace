package basic;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		/*
		 * 스캐너를 이용해서 정수하나를 입력받습니다.
		 * 입력받은 정수가 음수, 0, 홀수 짝수인지 구분하는 조건문
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = scan.nextInt();
		
		if (num == 0) {
			System.out.println("0 입니다");
		} else if (num < 0) {
			System.out.println("음수 입니다");
		} else 
			if (num % 2 == 0) {
				System.out.println("짝수입니다");
			} else
				System.out.println("홀수입니다");
		
		
		
		
	}
}
