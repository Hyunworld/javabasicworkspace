package quiz14;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MelonMusic m = new MelonMusic();
		while(true) {
		System.out.println("[메뉴]1.추가, 2.재생, 3.현재음악개수, 4.종료");
		String menu = scan.next();
		if(menu.equals("1") || menu.equals("추가")) {
			m.insertList(scan.next());
		} else if(menu.equals("2")) {
			m.playList();
		} else if(menu.equals("3")) {
			m.playLength();
		} else if(menu.equals("4")) {
			System.out.println("시스템을 종료합니다");
			break;
		} else {
			System.out.println("똑바로입력해");
		}
		}

	}
}
