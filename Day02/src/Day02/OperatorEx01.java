package Day02;

public class OperatorEx01 {
	public static void main(String[] args) {
		
		//단항 연산자
		//부호연산자 +, -
		
		int i = +3;
		int j = -i;
		
		//증감연산자 ++,--
		int k = 1;
		int h = k++; //후위연산자 - 먼저 값을 대입하고, 그 다음에 1 증가
		int l = k;
		System.out.println("k의값 : " + k);
		System.out.println("h의값 : " + h);
		
		int x = 1;
		int y = ++x;
		
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		
		x = 1 ;
		x++;
		++x;
		System.out.println(x);
		System.out.println("------------------------");

		x = 1;
		y = 1;
		System.out.println(x++);
		System.out.println(++x);
		
		x = 10;
		y = 10;
		
		int result = x++ + ++y + 10;
		System.out.println(result);
		System.out.println("--------------------------");
		
		//예외인 상황
		x = 10;
		y = 10;
		
		int result2 = x++ + x++ + x++; //한 항에서 여러번 사요되는 경우는 값이 올라간 형태에서 연산작업이 이루어 집니다.
		System.out.println(result2);
		System.out.println("------------------------");
		
		byte b = 10; //0000 1010
		System.out.println(~b); //0000 1010
		System.out.println(~b +1);
		System.out.println(~(~b+1));
		
		byte b1 = (byte)(~b + 1);
		System.out.println(~b1 + 1);
		System.out.println("------------------------");
		
		//0000 1010
		boolean bool1 = true;
		System.out.println(!bool1);
		
		
	}
}
