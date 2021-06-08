
public class VariableEx {

	public static void main(String[] args) {
		
		/*
		 * 변수의 선언 방법
		 * 데이터타입 이름;
		 * 
		 * int는 정수를 저장하는 대표적인 유형
		 * 
		 */
		
		//선언
		int num;
		
		//초기화
		num = 10;
				
		System.out.println(num);
		
		//동일한 이름의 변수는 생성할 수 없습니다.
		//변수의 선언과 초기화를 동시에
		int num2 = 10;
		
		//변수의 변경
		num = 100;
		num2 = 200;
		
		//변수는 다른 변수의 값, 또는 연산의 결과를 저장할 수 있습니다.
		int result = num + num2;
		
		
		System.out.println("--------------------------");
		
		//1. 변수명 result2 , result의 값과 10을 더한 결과를 저장
		int result2 = result + 10;
		
		result2 = 100;
		result2 = num;
		System.out.println(num);
		
		//String은 대표적으로 문자열을 저장하는 유형
		String a = "홍길동";
		
		
		
		
		
	}
}
