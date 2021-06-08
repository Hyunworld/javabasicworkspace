package static_.method;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a = 10;
		
		c.method1();
		Count.b++;
		//static메서드의 사용
		
		Count.method2();
		
		//b?
		System.out.println(Count.b);
		
		//왜 static이 중요할까?
//		Math.random();
		
		System.out.println(Math.abs(-5));
		System.out.println(Arrays.toString(new int[10]));
		System.out.println(Integer.parseInt("1"));
				
	}
	
	
	public void test() {
		
	}
}
