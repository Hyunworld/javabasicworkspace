
public class MethodEx03 {
	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1.반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type 입니다.
		 * 2.반환유형이 있는 메서드는 호출구문이 하나의 값이 되기 때문에 다른 메서드의 매개값으로도 사용됩니다.
		 * ex)print(메서드호출);
		 * 3.반환이 없는 메서드는 void라고 적습니다
		 * 4. 모든 메서드는 return키워드를 만나면 강제종료 됩니다.
		 *    그래서 void형 메서드에서 return키워드 사용이 가능하고, return 아래에는 코드 작성이 불가합니다.
		 * 
		 */
		
		
		int result = add( add(1, add(1, 1)), 5); 
		System.out.println("결과 : " + result);
		
		//void형 메서드는 return값이 없기 때문에 호출만 가능합니다.
		//sysout(sub(1,2));
		//int result2 = sub(1,2);
		sub(1, 2);
		multi();
		
		
		
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	//반환이 없는 메서드
	static void sub(int a, int b) {
		System.out.println("두수의 차 : " + (a-b));
	}
	
	//반환과 매개변수가 없는 메소드
	static void multi() {
		System.out.println("안녕하세요??");
	}
	
	static void noReturn(String name) {
		
		if(name.equals("똑똑이")) {
			System.out.println("참 잘했어요!");
			return; //메서드의 종료
		}
		System.out.println("틀렸습니다. 똑똑이를 입력해야해요");
	}
}
