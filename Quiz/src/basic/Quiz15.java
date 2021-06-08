package basic;

public class Quiz15 {
	public static void main(String[] args) {
		
		//동전 - 금액을 큰 금액부터 거슬러서 몇개가 나오는지 출력.
		int[] arr = {1000,500,100,10};
		//금액
		int money = 17780;
		
		int a = 0;
		while (a < arr.length) {
			System.out.println(arr[a] +  "원 : " + money / arr[a]);
			money = money % arr[a];
 			a++;
		}
		
		
		
	}
}
