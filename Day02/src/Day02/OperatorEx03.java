package Day02;

public class OperatorEx03 {
	public static void main(String[] args) {
		
		int x = 10, y = 20;
		
		//if문장 뒤에 소괄호가 true면 if문을 실행, 그렇지 않으면 else문을 실행
		if(x != 10 && ++y == 21) { //2개짜리 &&, ||은 만족할 수 없는 조건일 때, 뒤를 실행하지 않음.
			System.out.println("true");
		} 
		else {
			System.out.println("false");
		}
		
		System.out.println("x�� : " + x + ", y�� : " + y);
		
		if(x == 10 || ++y == 21) {
			System.out.println("�� �Դϴ�");
		}
		else {
			System.out.println("���� �Դϴ�");
		}
		
		System.out.println("x�� : " + x + ", y�� : " + y);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
