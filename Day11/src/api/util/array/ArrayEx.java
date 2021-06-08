package api.util.array;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 6 ,3, 1, 7};
		
		//sort 정렬
		Arrays.sort(arr);
		
		//toString - 문자열 확인
		System.out.println(Arrays.toString(arr));
		
		//binarySearch - 값의 유무 확인(선행조건 정렬)
		int index = Arrays.binarySearch(arr, 7);
		System.out.println("7이 있는 익덱스 위치:" + index); //없는 값이면 음수값을 반화
		
		//copyOf, copyOfRange - 배열의 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 2,4); //2~4미만인덱스 까지만
		System.out.println(Arrays.toString(arr3));
		
		//equals - 배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr, arr2)) {
			System.out.println("내부 값이 동일함");
		}
		
	}
}
