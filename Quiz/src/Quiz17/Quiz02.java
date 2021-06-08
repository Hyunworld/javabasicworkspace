package Quiz17;

import java.util.Arrays;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * participant는 마라톤 참가자 명단입니다.
		 * completion은 마라톤 완주자 명단입니다.
		 * 
		 * completion은 participant의 길이보다 1이 작습니다.
		 * 참가자는 동일인물이 있을 수 있습니다.
		 * 어떤 배열이 주어지던 간에 마라톤을 완주하지 못한 이름(String)을 찾아내는 메서드를 작성하세요.
		 */
		
		String[] participant = {"홍길동", "홍길자", "이순신", "신사임당", "이순신"};
		String[] completion = {"홍길자", "홍길동", "이순신"};
	
		
		System.out.println("완주하지못한사람 : " + solution(participant, completion));
		
	}
	
	public static String solution(String par[], String com[]) {
		Arrays.sort(par);
		Arrays.sort(com);
		System.out.println(
				Arrays.toString(par));
		System.out.println(Arrays.toString(com));
		int j = 0;
		String c = "";
		for(int i = 0; i < par.length ; i++) {
			if(par[i].equals(com[j]) == true) {
				j++;
				
			} else {
				c += par[i];
				c += " ";
			}
		}
		return c;


	}
}
