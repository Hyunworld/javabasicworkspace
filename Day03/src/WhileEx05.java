
public class WhileEx05 {
	public static void main(String[] args) {
		
		//배열에 순차적인 접근은 0에서 길이 미만까지 반복문을 회전합니다.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int i = 0;
		int sum = 0;
		
		while (i < arr.length) {
			//System.out.println(arr[i]);
			sum += arr[i];
			i++;
			
		}
		System.out.println(sum);
		
	}
}
