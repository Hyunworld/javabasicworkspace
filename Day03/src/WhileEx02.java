import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		
		//입력받은 값까지의 짝수의 개수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		
		int count = 0; //개수를 누적할 변수
		int i = 1;
		while(i <= num) {
			
			if (i % 2 == 0 ) { //짝수
			count++; //짝수일 경우에 개수를 누적
		}
		i++;
	}
		System.out.println(num + "까지 짝수의 개수 : " + count);
	}
}