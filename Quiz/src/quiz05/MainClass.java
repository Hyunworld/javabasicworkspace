package quiz05;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.div(5));
		System.out.println(cal.circle(5));
		
		Computer com = new Computer();
		System.out.println(com.circle(5));
		System.out.println(com.rect(5));
		
		double[] a1 = {3.14,3.2,5.2,4.2};
		String[] ar = {"가", "나", "다"};
		ArrayPrint arr = new ArrayPrint ();
		System.out.println(arr.printArray(a1));
		System.out.println(arr.printArray(ar));
		
		//일반적인 변수는 값이 복사 되서 전달되는 형태
		ArrayPrint ap = new ArrayPrint();
		String a = "홍길동";
		ap.test(a);
		
		//배열이나 객체는 주소값이 전달되는 형태
		String[] a2 = {"가", "나", "다" };
		ap.test(a2);
		System.out.println(Arrays.toString(a2));
	}
}
