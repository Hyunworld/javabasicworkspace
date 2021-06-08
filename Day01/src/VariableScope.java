
public class VariableScope {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
		
		//동일한 유형의 변수는 , 이용해서 한번에 선언할 수 있습니다.
		int num1 = 10, num2 = 20;
		int num4 = 0;
		
		if(true) {
			int num3 = num1 + num2;
			
			num4 = 1000;

		}
		
		int num3 = 100;		
		System.out.println(num3);
		
		System.out.println(num4);
		
		
		
		
		
		
	}
}
