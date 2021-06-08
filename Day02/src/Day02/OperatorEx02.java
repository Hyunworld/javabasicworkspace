package Day02;

public class OperatorEx02 {
	public static void main(String[] args) {
		//2항연산자
		//산술연산자
		
		int i = 7 / 3; //2
		int j = 7 % 3; //1
		int k = 8 * 3; //24
		
		//단항연산자
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i >= j);
		System.out.println(i < j);
		System.out.println(k != 21);
		System.out.println(k % 2 != 0);
		System.out.println(k % 2 == 0); // k는 짝수?
		System.out.println(k % 6 == 0); // k는 6의 배수?
		System.out.println("------------------------");
		
		//비트연산자 & | ^
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println(a & b); //0000 0001- 두 비트값이 1이면1, 나머지는 0
		System.out.println(a | b); //0000 0111 - 두 비트중 하나만 1이어도 1
		System.out.println(a ^ b); //0000 0110 - 두 비트가 다르면 1 같으면 0
		
		//비트쉬프트 >>, <<
		int h = 100;
		System.out.println(h >> 3);
		
		
	}
}
