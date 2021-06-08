package exception.trycatch;

public class TryCatchEx02 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int i = 0;
		while(i < 6) {
			try {
			System.out.println(arr[i]);
		
		}	catch (Exception e) {
			System.out.println("배열 참조의 범위를 벗어났습니다.");	
		} finally {
			System.out.println("이문장은 예외없이 실행");
		}
			i++;
		

		}
}
}
