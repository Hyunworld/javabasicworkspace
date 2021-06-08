package basic;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//1. 1~입력받은 수까지 3의 배수이거나, 4의 배수일 경우에 (가로로) 출력합니다.
		int a = 1;
		System.out.println("정수를 입력하세요");
		int i = scan.nextInt();
		System.out.println("1부터" + i + "까지 중 3의배수이거나 4의 배수");
		
		while (a <= i) {
			if (a % 3 == 0 || a % 4 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
			
		System.out.println();
		//2. 1~입력받은 수까지의 6의 배수의 합계
		System.out.println();
		int b = 1;
		System.out.println("정수를 입력하세요");
		int c = scan.nextInt();
		int sum = 0;
		while (b <= c) {
			if (b % 6 == 0) {
				sum = sum + b;
			}
			b++;
		}
		System.out.print("1부터" + c + "까지 6의 배수의 합계 : ");
		System.out.println(sum);
		
		//3. 1~1000까지 정수 중의 4배수이면서, 8의배수가 아닌 수의 개수(ex: 3,4, 12, 20....)
		System.out.println();
		int d = 1;
		int count = 0;
		
		while (d <= 1000) {
			if (d % 4 == 0 && d % 8 != 0) {
				count++;
			}
			d++;
		}
		 System.out.println("1~1000까지의 정수중 4의 배수이면서 8의 배수가 아닌수 : " + count + "개");
		
		
		//4. 1000의 약수의 개수
		 int y = 1;
		 int count2 = 0;
		 
		 while (y <= 1000) {
			 if (1000 % y == 0) {
				 count2++;
			 }
			 y++;
		 }
		 System.out.print("1000의 약수 개수 : ");
		 System.out.println(count2 + "개");
		
		
	}
}
