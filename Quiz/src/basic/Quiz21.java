package basic;

import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {
		
		/*
		 * 가로, 세로를 스캐너를 통해 입력받습니다.
		 * 가로길이, 세로길이 만큼 사격형을 출력하면 됩니다.
		 * 단, 윤곽만 나타나면 됩니다.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int a = scan.nextInt();
		System.out.print("세로>");
		int b = scan.nextInt();
		
		for(int i = 1  ; i<=b ; i++) {
			if (i == 1 || i == b) {
				for (int j = 1 ; j<=a ; j++)
				System.out.print("*");
				
			}else {
					System.out.print("*");
					for (int j = 1 ; j<=a-2 ; j++) {
						System.out.print(" ");
				} System.out.print("*");
				
			}System.out.println(" ");
		}
	}
}
