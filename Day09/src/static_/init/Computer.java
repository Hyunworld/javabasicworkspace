package static_.init;

public class Computer {
	static String model;
	static String company;
	int price = 1000000;
	
	Computer() {
		System.out.println("일반 생성자가 호출됨");
	}
	
	static {
		System.out.println("static초기화자가 실행됨");
		model = "gram";
		company = "LG";
	}
}
