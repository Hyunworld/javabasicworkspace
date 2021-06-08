package basic;

import java.util.Scanner;

public class Quiz25 {
	public static void main(String[] args) {
		/*
		 * Scanner을 이용하여 금액을 입력 받으세요.
		 * 음료수를 선택하면 금액에서 차감하세요.(반복분)
		 * 금액이 부족하다면 "금액이 부족합니다"를 출력
		 * 4를 입력 받으면 반복문을 종료.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입해 주세요>");
		int i = scan.nextInt();
		ec : while(true) {
			System.out.println("남은금액 : " + i);
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원, [3]코카콜라: 600원, [4]잔돈받기");
			System.out.print("음료수 선택>");
			int c = scan.nextInt();
			
			switch (c) {
			case 1 :
				if (i>=400) {
				System.out.println("뎀이소다를 받았습니다.\n");
				i -= 400;
			  } else {
				  System.out.println("금액이 부족합니다 돈을 넣어주세요!\n");
			  } break;
			case 2 :
				if (i>=500) {
				System.out.println("밀킥스를 받았습니다.\n");
				i -= 500;
			  } else {
				  System.out.println("금액이 부족합니다 돈을 넣어주세요!\n");
			  } break;
			case 3 :
				if (i>=600) {
				System.out.println("뎀이소다를 받았습니다.\n");
				i -= 600;
			  } else {
				  System.out.println("금액이 부족합니다 돈을 넣어주세요!\n");
			  } break;
			case 4 :
				System.out.println("남은금액 " + i + "을 반환합니다.");
				if (c == 4) break ec;
		}
		
		
		
	}
	}
}
