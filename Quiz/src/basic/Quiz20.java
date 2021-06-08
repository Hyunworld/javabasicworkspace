package basic;

public class Quiz20 {
	public static void main(String[] args) {
		
		//구구단 2단 ~ 9단까지 세로로 출력
		
		for(int i=2;i<=9;i++){
			System.out.println("구구단" + i + "단");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j );
			}System.out.println("-------------------");
		}
		
		
		for(int i =1 ; i <= 9; i+=3) {
			System.out.println();
			for(int j = 1 ; j <=9 ; j++) {
				System.out.println(i + " x " + j + " = " + i*j 
						+ "\t" + (i+1) + " x " + j + " = " + (i+1)*j
						+ "\t" + (i+2) + " x " + j + "=" + (i+2)*j);
	}
		}
	
		System.out.println("------------또다른방법-----------------------");
		for(int i = 1 ; i<= 9 ; i+=3) {
			for(int j = 1 ; j<= 9 ; j++) {
				System.out.printf("%d x %d = %d\t%d x %d = %d\t%d x %d = %d\n", i, j , i*j, i+1, j, (i+1)*j, i+2, j, (i+2)*j);
			}
		}
			
		
	}

}