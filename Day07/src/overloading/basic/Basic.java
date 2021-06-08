package overloading.basic;

public class Basic {
	/*
	 * 오버로딩 - 같은 이름의 메서드, 생성자를 여러개 생성하는 것
	 * 규칙
	 * 1. 이름이 같다
	 * 2. 반환유형은 오버로딩에 영향을 미치지 않는다.
	 * 3.매개변수의 타입 or 종류 or 순서가 다르면 됩니다.
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력");
	}
	
	//반환유형은 영향을 미치지 않음.
//	int input(int a) {
//		
//	}
	
	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력");
	}
	
	void input(double b, int a) {
		
	}
	
	void input(char c, int b, double a) {
		System.out.println("문자, 정수, 실수 1개 입력");
	}
	
	
	
	
	
}
