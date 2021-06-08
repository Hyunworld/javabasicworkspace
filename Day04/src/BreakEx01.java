
public class BreakEx01 {
	public static void main(String[] args) {
		
		//무한반복문
		/*
		 * 무한반복문 - 정확히 횟수를 모를 때 사용하고 특정 조건에서 반복문을 종료시키는 형태로 씁니다.
		 */
		
		int i = 1;
		while(true) {
			
			System.out.println(i);
			if (i ==15) break; //if문 한줄일 경우에 중괄호 생략 가능

			i++;
		}
		
		
		
		
	}
}
