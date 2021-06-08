package api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {
	public static void main(String[] args) {
		
		String str = "2021.03.17, 수요일, /bno=30, id=홍길자";
		
		//여러 구분자를 이용해서 자름
		StringTokenizer token = new StringTokenizer(str, ",./");
				while(token.hasMoreTokens()) {
					System.out.println(token.nextToken());
				}
			System.out.println("----------------");
		//구분자를 포함해서 자름
		StringTokenizer token3 = new StringTokenizer(str, ",", true);
		
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
		
				
		
	}
}
