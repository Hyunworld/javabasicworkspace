import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		int count = 0; //카운트 변수
		
		for(int i = 1; i<= num ; i++) {
			
			if (num % i == 0) { //num에 대한 약수
				count++;
			}
		}
		System.out.println(num + "에 약수의 개수 : " + count);
		System.out.println(count == 2 ? num + "은 소수" : num + "은 소수가 아닙니다");
		
		
	}
	
}
