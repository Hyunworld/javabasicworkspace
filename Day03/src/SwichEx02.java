import java.util.Scanner;

public class SwichEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int point = scan.nextInt();
		
		switch(point/10) {
		case 9:
			System.out.println("A학점");
			break;
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		case 6 :
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;

		}
		
		
		
	}
}
