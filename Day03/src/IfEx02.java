import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		
		//입력받은 점수를 A, B, C, D, F 등급으로 분리
		Scanner scan = new Scanner(System.in);
		int point = scan.nextInt();
		
		
		if(point>=90 ) {
			System.out.println("A학점 입니다");
				
			if(point>=95) {
				System.out.println("A+학점 입니다");
			} else {
				System.out.println("A학점 입니다");
			}
		} else if (point >= 80) {
			System.out.println("B학점 입니다");
		} else if (point >= 70) {
			System.out.println("C학점 입니다");
		} else if (point >= 60) {
			System.out.println("D학점 입니다");
		} else {
			System.out.println("F입니다");
		}
		
		scan.close();
		
		
		
	}
}
