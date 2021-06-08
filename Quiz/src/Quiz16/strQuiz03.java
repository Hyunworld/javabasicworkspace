package Quiz16;

public class strQuiz03 {
	public static void main(String[] args) {
		/*
		 * 자연수의 자리수 합 구하기
		 * 자연수 n이 주어지면 n의 각 자리수의 합을 구해서 return하는
		 * 메서드를 작성해 주세요.
		 * 
		 * 조건
		 * n은 1억 이하의 자연수
		 * n을 자료형 변환해서 연산하지 말것.
		 * (스트링을이용해서 test01메서드, 스트링을 이용하지 않고 test02)
		 */
		System.out.println(test02(123));
		System.out.println(test01(156));

		}
		
	public static int test01(int b) {
		int sum = 0;
		String a = String.valueOf(b);
		for (int i = 0 ; i < a.length() ; i++) {
		sum += Integer.parseInt(a.charAt(i)+"");
		}
		return sum;
	}

	
	public static long test02(long a) {
		long sum = 0;
		
		while(a>0) {
			sum += a%10 ;
			a /= 10;
		}
		return sum;
	}
	
	
	
	
	
	
	
	
}
