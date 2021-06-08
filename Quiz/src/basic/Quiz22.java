package basic;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		
		//과제
		//소수 -? 나누어 떨어지는 수가 1과 자기자신인 수
		//정수를 입력받아서 입력받은 정수까지 수 중에 소수들만 합계.
		//ex) 입력10, 소수(2,3,5,7) 17을 구하면 됩니다.
		
			Scanner scan = new Scanner(System.in);
			
			int a = scan.nextInt();
			int sum = 0;
			
			for(int i = 2 ; i<=a ; i++) {
				int count = 0;
				for (int j = 1; j<=i ; j++) {
					if (i % j == 0) {
						count++;
						}
					}
				if (count ==2) {
					sum += i;
					}
			}
			System.out.println(sum);
				}
			}
		
				
			

