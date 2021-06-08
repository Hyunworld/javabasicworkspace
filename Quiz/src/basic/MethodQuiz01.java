package basic;

public class MethodQuiz01 {
	public static void main(String[] args) {
	method1();
	System.out.println(method2("마음아"));
	System.out.println(method3(2, 3, 4.2));
	System.out.println(method4(3));
	method5("가",3);
	System.out.println("\n" + maxNum(2,3));
	System.out.println(abs(2));

} //main 종료
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String i) {
		return i ;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int a) {
		if (a % 2 == 0 ) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	static void method5(String a, int b) {
		
		for(int i = 1; i <= b; i++) {
			System.out.print(a);
		}
	}
	
	static int maxNum(int a, int b) {
		
		if (a>b) {
			return a;
		} else {
			return b;
		}
		}
	
	static int abs(int a) {
		if (a<0) {
			return -a;
		} else {
			return a;
		}
	}
	

		
		
	}
	

