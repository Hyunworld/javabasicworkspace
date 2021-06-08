package basic;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		
		/*
		 * 사용자가 0을 입력할 때 까지 값을 입력 받습니다.
		 * 0을 입력하면 그 전까지 입력한 값들의 합을 출력하고, 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //합계를 누적할 변수
		int i = 1;
		
		while(i != 0) {
			System.out.print("정수입력>");
			int num = scan.nextInt();			
			sum += num; 
			
			if (num == 0) {
				i = 0;
			}
		}
		System.out.println("입력받은 수들의 합 : " + sum);
		
		//----------------------또 다른 방법----------------------------
		
		sum = 0;
		i = 1;
		
		while(i != 0) {
			System.out.print("정수입력>");
			i = scan.nextInt();	
			sum += i;
		}
		System.out.println("입력받은 수들의 합 : " + sum);
		
		
	
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
