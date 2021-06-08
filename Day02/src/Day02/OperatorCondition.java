package Day02;

public class OperatorCondition {
	public static void main(String[] args) {
		/*
		 *프로그램에는, 어떤 수의 검증을 위해서 랜덤한 값
		 *
		 *Math.random() - double 형태의 0.0이상 ~ 1.0미만의 랜덤수
		 *
		 */
		// System.out.println(Math.random());
		
		
		double d = Math.random() * 10; //0.0 ~ 10.0
		int r = (int)d + 1;
		System.out.print(r);
		
		int o = (int)(Math.random() * 10) + 1;
		System.out.println("  " + o);
		
		//0.0 ~ 10.0
		String result = r % 2 == 0 ? "짝수~" : "홀수~";
		System.out.print(result);
		
		System.out.println(o % 2 == 0 ? "짝수~" : "홀수~");
	}
}
