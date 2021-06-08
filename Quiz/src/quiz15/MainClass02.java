package quiz15;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int a = (int)(Math.random() * 100) + 1;
	int count = 0;
		
		while (true) {
			try {
			System.out.print("1과 100사이의 값을 입력하세요>");
			int b = scan.nextInt();
			if (a == b) {
				System.out.println("정답입니다! 프로그램 종료합니다");
				count++;
				System.out.println("시도횟수:" + count);
				break;
			} else if(a>b){
				System.out.println("더 큰수를 입력하세요");
				count++;
				continue;
			} else {
				System.out.println("더 작은 수를 입력하세요");
				count++;
				continue;
			}
		}
			 catch(Exception e) {
		System.out.println("잘못입력했습니다");
		count++;
		scan.nextLine();
	}
	
	
	
		
	}
	}
}
