package basic;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz03 {
	public static void main(String[] args) {
		//18 ~21번
		String str = java(9);
		System.out.println(str);
		
		System.out.println("약수의 합 : " + prisum(6));
		
		System.out.println(sumNum(9, 7));
		System.out.println(sumNum(7, 9));
		System.out.println(sumNum(5,5));

		char arr[] = {'월', '화', '수', '목', '금'};
		System.out.println(method6(arr));
		
		int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(method7(arr2));
		
		System.out.println(Arrays.toString(method8("목", "금")));
	} //main 끝
	
	static String java(int a) { //Quiz18
		String str = "";
		for(int i=1 ; i <= a ; i++) {
			if (i % 2 == 0) {
				str += "바";
			} else {
				str += "자";
			}
}
		return str;

	}

	static int prisum(int a) { //Quiz 19
			int sum=0;
			for(int i = 1; i <= a ; i++) {
				if(a % i == 0) {
					sum += i;
				}
			}
	 return sum;
		}
	
	static int sumNum(int a, int b) { //Quzi 21

		int min;
		int max;
		int sum = 0;
		
		if (a>b) {
			min = b;
			max = a;
		} else if(b>a) {
			min = a;
			max = b;
		} else {
			return a;
		}
		for (int i = min; i<=max;i++) {
			sum += i;
		}
		return sum;
	}

	static String method6(char[] arr) {
		String a  = "";
		for (int i = 0; i < arr.length ; i++)  {
			a += arr[i];
			
		}
		for (char c : arr) {
			a += c;
		}
		return a;
	}
	
	static int method7(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		} return sum;
		
		
	}
	
	static String[] method8(String a, String b) {
		String[] arr = {a, b};
	
		return arr;
		}
		
	
} //public 끝
