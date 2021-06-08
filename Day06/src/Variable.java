
public class Variable {

	//멤버변수 : 초기화 하지 않으면 기본값으로 자동 초기화	
	int a ;
	
	void pringtNumber(int c) {
		int b = 1;
		
		System.out.println("멤버변수 : " + a);
		System.out.println("지역변수 : " + b); //지역변수는 초기화 하지 않으면 사용하지 못함
		System.out.println("매개변수 : " + c); 
	}
//	a = 10;    클래스에서 변수값지정못함
//	a = 1000;
		
		
}
