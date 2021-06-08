
public class MultifulEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1 ; j <=9 ; j ++)
				System.out.println(i + " x " + j + "=" + i * j);
		}
		
		//바깥에 i에 값에 따라서 안쪽 반복문의 횟수가 변화되는 형태
		
		for(int i = 1 ; i<=9 ; i++) {
			for(int j =1; j <=i; j++)
				System.out.println(i + "-" + j);
		}
		
		
		
	}
}
