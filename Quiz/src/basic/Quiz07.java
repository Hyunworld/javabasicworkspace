package basic;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 입력받습니다.
		 * 순서상관없이 가장 큰값, 중간값, 가장 작은값을 구분해서 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int Fir = 0;
		int Sec = 0;
		int Thr = 0;
		
		if (a>b) {
			if (a>c) {
				Fir = a;
					if (b>c) {
						Sec = b;
						Thr = c;
					}else {
						Sec = c;
						Thr = b;
					}
			} else {
				Fir = c;
				Sec = a;
				Thr = b;
			}
		} else {  // b>a 
			if (b>c) {
				Fir = b;
					if (a>c) {
						Sec = a;
						Thr = c;
					}else {
						Sec = c;
						Thr = a;
					}
			} else {
				Fir = c;
				Sec = b;
				Thr = a;
			}
		}
		
		System.out.println(Fir + ">" + Sec + ">" + Thr);
		
		
		// -----------------------또 다른 방법 --------------------------------
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int max;
		int mid;
		int min;
		
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
			if (num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		}else if (num2 > num1 && num2 > num3){
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			}else {
				mid = num3;
				min = num1;
			}		
		} else {
			max = num3;
			if (num1 > num2) {
				mid = num1;
				min = num2;
			}else {
				mid = num2;
				min = num1;
			}
		}
			
		System.out.println("최대값" + max + "중간값" + mid + "최소값" + min);
		
		}
	
	
		
		
		
	}
