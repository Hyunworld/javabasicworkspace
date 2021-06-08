package quiz05;

public class Calculator {
//	 * Calculator의 멤버변수 result, pi를 선언하세요
//	 * Calculator의 메서드
//	 * multi(int) : int - result에 값을 곱하기 기능 
//	 * div(int) :int - result에 값을 나누는 기능
//	 * circle(int): dobule - pi를 이용해서 원의 넓이를 구하는 기능
	
	int result = 10;
	double pi = 3.14;
	
	int multi(int a) {
		result *= a;
		return result;
	}
	
	int div(int a) {
		result /= a;
		return result;
	}
	
	double circle(int r) {
		return r * r * pi;
	}
	
	
	
	
	
	
	
	
	
}
