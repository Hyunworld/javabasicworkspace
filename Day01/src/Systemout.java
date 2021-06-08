
public class Systemout {

	public static void main(String[] args) {

		//main이라고 적고 ctrl + space를 누르면 자동생성됩니다.
		/*
		 * 코드실행 단축키는 ctrl + f11 입니다  
		 * sysout이라고 적고 ctrl + space는 println()를 자동생성
		 * 
		 * 전체선택 ctrl + a
		 * 자동정렬 ctrl + i
		 * 코드를 옴길때 alt + 방향키
		 */

		//println() - 작성한코드에 마지막에 \n을 자동삽입합니다.
		System.out.println("안녕하세요~");
		System.out.println("우리집 강아지는 장군이 입니다");

		//print() - 개행을 포함하지 않습니다
		System.out.print("줄바꿈이 없네요...\n");

		//printf() - 형식지정 출력문
		/*
		 * 서식문자
		 * %d - 정수를 입력받음
		 * %f - 실수를 입력받음
		 * %c - 단일 문자를 입력받음
		 * %s - 문자열 입력받음
		 */
		System.out.printf("오늘은 %d일 입니다\n", 15);
		System.out.printf("오늘은 %d월 %d일 입니다", 2, 15);
		System.out.printf("\n오늘은 %d년 %d월 %d일 입니다", 2021, 2, 15);

		System.out.printf("\n파이 값은 %f입니다", 3.14);
		System.out.printf("\n파이 값은 %.2f입니다", 3.14); //실수의 자리수를 지정
		System.out.printf("\n파이 값은 %10.2f입니다", 3.14); //전체자리수 10자리, 소수점 표현 2자리 지정

		System.out.printf("\n지구반지름 %7.2f입니다", 6400.00);


		System.out.printf("\n한글의 시작은 %c 입니다", '가');
		System.out.printf("\n한글의 시작은 %s 입니다\n", "가");



		System.out.println("파이 값은       3.14입니다");


	}
}
