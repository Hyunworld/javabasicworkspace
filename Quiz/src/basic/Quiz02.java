package basic;

public class Quiz02 {
	public static void main(String[] args) {
		//1. 1~100까지의 랜덤수를 발생시키고 3의 배수인지 아닌지 확인
			int a = (int)(Math.random() * 100) + 1;
			System.out.print("정수" + a + " -> ");
			System.out.println(a % 3 == 0 ? "3의 배수입니다ㅣ":"3의 배수가 아닙니다");
			
			
		//2. -5~5의 랜덤수를 발생시키고 음수일 경우 절대값
			int b = (int)(Math.random() * 11) - 5;
			System.out.print("정수" + b + "의 절대값 : ");
			System.out.println(b <= 0 ? -b : b );
			
		//3. 1~200의 랜덤수를 발생시킵니다
		//   bucket은 사과를 담는 바구니(최대 10개)
		//   램덤수가 사과의 개수 일때 바구니의 수를 구하세요.
			
			int c = (int)(Math.random() * 200) + 1;
			System.out.print("사과의 개수 : " + c + "개 -> ");
			System.out.print(c % 10 == 0 ? c/10 : c/10 + 1 );
			System.out.println("개의 바구니");
	}
}
