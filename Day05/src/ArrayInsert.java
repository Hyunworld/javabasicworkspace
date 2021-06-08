import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[100];
		
		System.out.println("# 먹고싶은 음식을 입력하세요");
		System.out.println("# 중지하려면 [그만]이라고 입력하세요");
		
		int index = 0; //입력바은 개수(or 배열의 위치)를 나타낼 변수
		
		while(true) {
			
			System.out.print(">");
			String menu = scan.next();
			
			if(menu.equals("그만")) break;
			arr[index] = menu;
			index++;
			}
		
		//배열의 요소 출력
		System.out.println("입력 종료!");
		System.out.print("내가 먹고싶은 음식들 : [ " );
		for(int i = 0; i<index; i++) { 
			System.out.print(arr[i] );
			if (i == index-1) break;
		System.out.print(", ");
		}
		System.out.println("]");
		
		
	}
}
