package basic;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		
		
		/*
		int a = 1;
		
		while (a<=15) {
			
			System.out.println(a + "번의 학생의 출석을 체크");
			a++;	
		}
		*/
		
		//구구단수를 입력받아서, 입력받은 단수으 ㅣ구구단을 출력해주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int i = scan.nextInt();
		int j = 1;
		System.out.println("구구단 : " + i + "단");
		while (j<=9) {
			System.out.println(i + " x " + j + " = " + i*j);
			j++;
		}
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
