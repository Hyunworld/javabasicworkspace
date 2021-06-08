package basic;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		//정수 2개를 입력받아서 어떤 값이 큰수인지 출력, 만약 같은수라면 "같은 수 입니다"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int a = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int b = scan.nextInt();
		
		if (a>b) {
			System.out.println(a + "가 큰 수 입니다");
		} else if(a<b) {
			System.out.print(b + "가 큰 수 입니다");
		} else {
			System.out.println("같은수 입니다");
		}
		
	}
}
