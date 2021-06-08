package exception.thorw_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		/* 처리할 작업
		 * 1.입력한 값이 숫자가 아니라면 "반드시 숫자만 입력하세요"를 출력한 뒤에 다시 입력받으면 되빈다.(단, 카운트는 증가되지 않음)
		 * 2. 입력한 값이 1에서 100까즈이 값이 아니라면 예외처리구문으로 이동하고 다시 입력받도록 처리합니다.(단, 카운트는 증가)
		 * 3
		 */
		
	Scanner scan = new Scanner(System.in);
	int a = (int)(Math.random() * 100) + 1;
	int count = 0;
		

		while (true) {
			try {
			System.out.print("1과 100사이의 값을 입력하세요>");
			int b = scan.nextInt();
			if (b >100 || b < 1) {
				throw new Exception();
			}
			
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
			 catch(InputMismatchException e) {
		System.out.println("정수로만 입력하세요");
		scan.nextLine();

	} catch (Exception e) {
		System.out.println("1에서 100까지");
	}
	}
	}
}
