import java.util.Scanner;

public class ContinueEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int count = 0;  //약수 개수를 count할 변수
		int sum = 0;  //소수의 합계
		
		ex : for(int i = 2 ; i<=a ; i++) { //검증할 숫자
			count = 0;
			for (int j = 1; j<=i ; j++) { //소수인지 판별
				if (i % j == 0) { // i의 약수인 경우에 count
					count++;
					}
				if(count > 2) {
					continue ex;
				}
				
				}
			if (count ==2) {
				sum += i;
				}
		}
		System.out.println(sum);
	}
}
