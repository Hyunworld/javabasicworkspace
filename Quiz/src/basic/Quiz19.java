package basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz19 {
	public static void main(String[] args) {
		
		/*
		 int x = 1;
		 int y = 5;
		 
		 int temp = x;
		 x= y;
		 y = temp;
		 
		 Systen.out.println("x:" + x + ", y:" + y);
		 */
		
		/* 
		 * 배열의 들어있는 값 중에서 절대 중복되지 않는 숫자 3개를 랜덤으로 추출하려 합니다.
		 * arr에서 값이 중복되지 않게 추출된 3개의 값을 새로운 배열로 옮겨 담으면 됩니다.
		 * 배열의 길이만큼 회전하고 랜덤요소를 0,1,2 인덱스로 옮깁니다.
		 */
		
		int[] arr = {1, 2, 3 ,4 ,5, 6, 7, 8, 9};
		
		for (int i = 0 ; i < arr.length; i++) {
			int r = (int)(Math.random() * arr.length);
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
			}
		
		
		int [] arr2 = {arr[0], arr[1], arr[2]};
		System.out.println(Arrays.toString(arr2));
	}
}
