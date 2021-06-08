package basic;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {
		
//		//배열의 정렬
//		int[] arr = {5, 4, 3, 2, 1};
//		int[] arr2 = {5, 3, 4, 1, 2};
//		Arrays.sort(arr);
//		Arrays.sort(arr2);
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
//		//배열의 비교 (배열의 내부 요소가 동일하면 true, 그렇지 않으면 false)
//		System.out.println(Arrays.equals(arr, arr2));
		
		int[] arr = LottoNum();
		long money = LottoRun(arr);
		System.out.println("내가 찍은 번호 : " + Arrays.toString(arr));
		System.out.println("당첨되기까지 사용한 금액 : " + money);
		
		/*
		 * start:while(ture) {
		 * int num = (int)(Math.random() * 45) + 1;
		 * 
		 * //중복검사 
		 * 
		 */

	} //main 끝
	
	static int[] LottoNum() {
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
		}
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = (int)(Math.random() * 45) + 1;
					i = -1;
					break;
				}
				else {
					Arrays.sort(arr);
				}
			}	
			}
		return arr;
	}
	
	static long LottoRun(int[] arr) {
		long money = 0;
		int[] arr2 = new int[6];
		
		
		while(!(Arrays.equals(arr, arr2))) {
			for (int i = 0; i < arr2.length ; i++) {
				arr2[i] = (int)(Math.random() * 45) + 1;
			}
			
			for(int i = 0; i < arr2.length ; i++) {
				for(int j = i+1; j < arr2.length ; j++) {
					if(arr2[i] == arr2[j]) {
						arr2[j] = (int)(Math.random() * 45) + 1;
						i = -1;
						break;
					}
					else {
						Arrays.sort(arr2);
					}
				}
				}
			
			money += 1000;
			System.out.println(Arrays.toString(arr2));
		}
		return money;
	}
	
	
	
	
	
} //public 끝
