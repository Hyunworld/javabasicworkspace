package exception.trycatch;

public class TryCatchEx01 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i + j);
		try {
			System.out.println(i / j);
			//catch뒤에는 해당 예외를 처리할 수 있는 예외 종류가 들어갑니다.
			//Excepion은 모든 예외를 처리할 수 있습니다.
		} catch(Exception i1) {
			System.out.println("0으로 나눌 수 없습니다");
		} finally {

			System.out.println("이 문장은 실행 되나요?");
		}
		
		System.out.println(i * j);
	}
}
