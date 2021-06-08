package basic;

public class Quiz16 {
	public static void main(String[] args) {
		
		//Math.random()을 사용해서 2~9까지 랜덤변수를 만들고, 해당 구구단을 세로로 출력
		
		int i = (int)(Math.random() * 8) + 2;
		
		System.out.println(i + "단");
		for(int j = 1; j<=9 ; j++) {
			
			System.out.println(i + " x " + j +" = 10 " + i*j);
		}
			
	}
}
