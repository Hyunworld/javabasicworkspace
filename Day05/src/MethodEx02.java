
public class MethodEx02 {
	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 메서드 호출시 실행한 필요한 값을 전달하는 매개체입니다.
		 * 2. 매게변수를 몇개 받을지는 메서드를 선언할 때 결정합니다.
		 */
		System.out.println("1~10까지 합:" + calSum(10));
		System.out.println("1~100까지 합 :" + calSum(100));
		
		int result = calSum2(10, 20);
		System.out.println(result);
		
		String result3 = calSum3(1, 3, "가");
		System.out.println(result3);
	}
	
	static int calSum(int end) {
		
		int sum = 0;
		for(int i = 1; i<=end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start ; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//정수 2개, 문자열 1개를 매배변수로 받는 calSum3()
	//기능 - 두 정수 사이의 차 만큼 문자열을 붙인결과를 반환
	
	static String calSum3(int a, int b, String c) {
		int max = 0;
		int min = 0;
		if(a>b ) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		String str = "";
		for(int i = min ; i<=max ; i ++) {
			str += c;
		}
		return str;
	}
	
	
	
}