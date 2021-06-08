package basic;

public class Quiz17 {
	public static void main(String[] args) {
		//for문으로 해결
		//1. 7~100까지 정수중에 7의 배수를 가로로 출력
		for (int i = 7; i<=100 ; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
		}
		}
		System.out.println();
		
		//2. 1~100까지 12의 배수를 가로로 출력
		
		for (int i = 1; i<=100; i++) {
			if (i % 12 == 0) {
				System.out.print(i + " ");
			}
		}
			System.out.println();
		//3. 1~200까지 정수중의 9의 배수의 개수
		int count = 0;
		for (int i = 1; i<=200; i++) {
			if (i % 9 == 0) {
				count++;
			}
		} System.out.println(count + "개");
		
		//4. 50~100까지 두 수 사이의 합.
		int sum = 0;
		for (int i=50; i<=100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//5. A~Z까지 가로로 출력 (A의 유니코드 65, Z유니코드90)
		for (char i = 65;i<=90;i++) {
			System.out.print(i + " ");
		}
		
	}
}
