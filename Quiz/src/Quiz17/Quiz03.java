package Quiz17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Quiz03 {
	public static void main(String[] args) {
		/*
		 * 1.스캐너 이용해서 nextLine()으로 문장을 받습니다.
		 * 2.입력받은 문장을 토크나이저를 이용해서 공백 기준으로 분리
		 * 3.분리한 토큰 개수 출력
		 * 4.for문으로 아래 출력형식으로 뽑아주세요
		 * ex)
		 * 1.안녕
		 * 2.하세요.
		 * 3.오늘은
		 * 
		 * 5. 분리된 토큰을 배열에 새롭게 저장
		 */
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		StringTokenizer t1 = new StringTokenizer(str, " ");
		System.out.println("토큰의개수:" + t1.countTokens());
		String[] arr = new String[t1.countTokens()];
		
		for(int i = 0; t1.hasMoreTokens() ;i++) {
			arr[i] = t1.nextToken();
			System.out.println(i+1 + "." + arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
