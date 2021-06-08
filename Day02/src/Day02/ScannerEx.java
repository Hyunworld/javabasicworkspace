package Day02;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 기능을 사용해서 데이터를 입력받음.
		System.out.print("이름>");
		String name = scan.next(); //문자열을 입력받음
		
		System.out.print("나이>");
		int age = scan.nextInt(); //정수를 입력받음
		
		System.out.print("키>");
		double cm = scan.nextDouble();
		
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + cm);
		
		//3. 스캐너에 대한 자원해제
		scan.close(); 
	}
}
