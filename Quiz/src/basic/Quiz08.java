package basic;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 귤, 포도]");
		System.out.print(">");
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();  
		
		switch (a) {
		
		case "수박" :
			System.out.println("수박을 구입합니다");
			break;
		case "사과" :
			System.out.println("사과를 구입합니다");
		case "멜론" :
			System.out.println("멜론을 구입합니다");
			break;
		case "귤" :
			System.out.println("귤을 구입합니다");
			break;
		case "포도" :
			System.out.println("포도를 구입합니다");
			break;
		default :
			System.out.println(a + "는 없습니다");
			
		
		
		
		
		
		
		
		}
		}
	}
