
public class DoWhileEx {
	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		
		//while문 - 1~10까지 합
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			
			sum += i;
			i++;
		}
		
		System.out.println("1~10까지합 : " + sum);
		
		int sum2 = 0;
		int k = 1;
		do {
			
			sum2 += k ;
			k++;
		}while (k <= 10);
		
		System.out.println("1~10까지합 : " + sum2);
	}
}
