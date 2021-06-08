import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {
		
		//10번 숫자를 입력받고, 입력받은 값들의 합.
		Scanner scan = new Scanner(System.in);
		int sum = 0; //합계를 누적할 변수
		
		int i = 1;
		while(i <= 10) {
			System.out.println("정수입력>");
			int num = scan.nextInt();			
			
			sum += num; 
			i++;
		}
		System.out.println("입력받은 수들의 합 : " + sum);
		
		scan.close();
	}
}
