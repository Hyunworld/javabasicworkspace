package static_.basic;

import java.util.Arrays;

public class ArrayPrint {
	
	//Arrays.toString()처럼 사용될 수 있도록 각각 메서드를 처리
	//외부에서 객체 생성을 할 수 없도록 처리
	private ArrayPrint () {
		
	}
	
	public static String printArray(String[] arr) {
		String result = "[";
		for(int i = 0; i <arr.length; i++) {
			result += arr[i];
			if(i == arr.length-1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	public static String printArray(int[] arr) {
		String result = "[";
		for(int i = 0; i <arr.length; i++) {
			result += arr[i];
			if(i == arr.length-1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	
	private static String printArray(double[] arr) {
		String result = "[";
		for(int i = 0; i <arr.length; i++) {
			result += arr[i];
			if(i == arr.length-1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	private static void test(String ar) {
		System.out.println(ar);
		ar = "가나다";
	}
	
	private static void test(String[] ar) {
		System.out.println(ar);
		ar[0] = "가나다"; 
	}
	
	
	
	
	
	
	
	
	
}
