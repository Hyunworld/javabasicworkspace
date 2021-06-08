package basic;

import java.util.Arrays;

public class Quiz23 {
	public static void main(String[] args) {
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
	   
		int temp = 0;

		 //오름차순 정렬
		for(int i1 =1; i1<arr.length-1 ; i1++) {
			for(int j = 0; j<arr.length-i1; j++) {
			if (arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
		}
		}
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		//버블정렬 - 큰수를 뒤로
		int[] ar = {5,2,43,20,1};
		//1회전 - {2,5,20,1,43}
		//2회전 - {2,5,1,20,43}
		//3회전 - {2,1,5,20,43}
		//4회전 - {1,2,5,20,43}
		
		for (int i = 1; i<ar.length ; i++) { //회전수
			for(int j = 0 ; j <ar.length-i ; j++) { //비교할 인덱스
				if (ar[j] < ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
		}
		
		
	}System.out.println(Arrays.toString(ar));
	
	}
}
