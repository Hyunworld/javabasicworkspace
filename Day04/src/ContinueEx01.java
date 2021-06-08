
public class ContinueEx01 {
	public static void main(String[] args) {
		
		//continue도 마찬가지로 조건문과 함꼐 사용하고, 반복문의 이동을 다음으로 
		for (int i = 1 ; i <= 10 ; i++) {
			
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		int i = 1;
		while(i <= 10) {
			
			if (i % 2 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
