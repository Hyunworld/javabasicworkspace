
public class EnhancedForEx {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for(int i: arr) { //(값을받을 변수 : 배열명)
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		
		String[] arr2 = {"월", "화" , "수", "목", "금", "토", "일"}; //향상된for로 출력
		for(String i : arr2) {
			System.out.println(i);
		}
		
		
		System.out.println("--------------------------------");
		
		int sum = 0;
		
		int[] arr3 = {40, 20, 50, 33, 50}; //arr3의 평균과 합계
		for(int i : arr3) {
			sum += i;
		}
		
		
		System.out.println((double)sum / arr.length);
		System.out.printf("평균:%.2f\n", (double)sum/arr.length);
		System.out.println("합계" + sum);
		
		
	}
}
