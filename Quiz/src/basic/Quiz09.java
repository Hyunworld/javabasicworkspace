package basic;

public class Quiz09 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "짜이찌엔"};
		
		/*
		 * 랜덤값을 이용해서 0~3까지 랜덤수를 발생시켜주세요
		 * 나오는 랜덤수를 배열의 index에 적용해서, 선택된 단어가 어느나라말인지 출력해주세요.
		 */
		
		int a = (int)(Math.random()*4);
		System.out.println(arr[a]);
		
		switch (arr[a]) {
		
		case "안녕" :
			System.out.println("한국");
			break;
		case "hello" :
			System.out.println("미국");
			break;
		case "사요나라" :
			System.out.println("일본");
			break;
		case "짜이찌엔" :
			System.out.println("중국");
			break;
		default :
			System.out.println("그런나라없다");
			
			
			
		}
		
		
		
	}
}
