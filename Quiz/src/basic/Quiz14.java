package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		
	
	/*
	 * 입력받은 수까지의 크기를 갖는 배열을 생성.
	 * 1부터 입력받은 수까지 순서대로 배열에 저장
	 * 
	 * ex ) 입력수 : 10
	 * [1,2,3,4,5,6,7,8,9,10]
	 */
		
	Scanner scan = new Scanner(System.in);	
	int a = 1;
	int limit = scan.nextInt();
	
	int[] arr;
	arr = new int[limit];
	
	while (a <= limit) {
		arr[a-1] = a;
		a++;
	}
	System.out.println( Arrays.toString(arr));
	
	
	}
}
