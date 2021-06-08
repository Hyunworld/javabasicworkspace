package basic;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
	//키가 140 이상이고, 나이가 8세 이상이어야 놀이기구 탑승이 가능합니다.
	
	Scanner scan = new Scanner(System.in);
	System.out.print("키 : ");
	int sj = scan.nextInt();
	System.out.print("나이 : ");
	int age = scan.nextInt();
	
	if (sj>=140 && age >= 8) {
		System.out.println("탑승이 가능합니다");
	} else
		System.out.println("탑승이 불가능합니다");
	
	
	scan.close();
	}
}
