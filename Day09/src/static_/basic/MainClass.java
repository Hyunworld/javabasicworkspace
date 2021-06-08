package static_.basic;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 1. 계산기 2개를 만들고 각각 생상을 지정.
		 * 2. 계산기 색상을 확인하세요.
		 * 3. result 값을 반환하는 getResult() 생성하세요.
		 * 4. pi와 circle()메서드를 이용해서 원의 넓이를 구하세요.
		 */
		
		Calculator cal1 = new Calculator();
		cal1.setColor("초록");
		System.out.println(cal1.getColor() + "색 계산기");
		System.out.println(cal1.areaCircle(7));
		
		
		Calculator cal2 = new Calculator();
		cal2.setColor("파랑");
		System.out.println(cal1.getColor() + "색 계산기");
		System.out.println(cal2.areaCircle(8));
		
		int[] arr = {1,2,3};
		System.out.println(ArrayPrint.printArray(arr));
		
		Arrays.toString(arr);
	}
	

	
}
