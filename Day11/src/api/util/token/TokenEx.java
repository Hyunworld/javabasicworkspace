package api.util.token;

import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {
		
		String str1 = "오늘 날씨는 맑고, 매우 추워용";
		String str2 = "2021/03/17";
		
		StringTokenizer token = new StringTokenizer(str1);
		System.out.println("잘린 토큰의 개수:" + token.countTokens());
		
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		System.out.println("=================");
		StringTokenizer token2 = new StringTokenizer(str2, "/");
		System.out.println(token2.countTokens());
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
	}
}
