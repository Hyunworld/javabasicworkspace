package basic;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		
		/*
		 * 두 정수를 입력 받습니다.
		 * 두 수의 크기는 정해지지 않았습니다.
		 * 두 수의 사이의 합을 구하는 프로그램을 작성.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요>");

		int i = scan.nextInt();
		int j = scan.nextInt();
		int sum = 0;
		
		if (i == j) {
			sum = i; 
		} else if(i > j) {
			for(j = j ; j<=i ; j++) {
				sum += j;
			} 
		}else {
			for(i = i ; i <= j ; i++) {
				sum += i;
				}
			}
		System.out.println(sum);
		
		System.out.println("-------------또다른방법----------");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum1 = 0;
		for (int k = (a==b ? 0 : a>b ? b : a) ; k<=(a==b ? 0 : a>b ? a : b); k++) {
			sum += k;
		}
		System.out.println(sum1);
		} 
	
		}
