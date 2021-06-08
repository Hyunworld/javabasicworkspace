
public class Phone {
	
	//멤버변수
	String model;
	int price;
	String color;
	
	//생성자 : 생성자는 클래스 이름과 대/소문자까지 동일함
	//반환유형은 없습니다.
	
	Phone() {
		System.out.println("생성자 호출!");
		model = "큐리텔";
		price = 100000;
		color = "검정";
	}
	
	//생성자는 여러개 선언할 수 있습니다.
	//단, 매개변수의 종류, 개수가 달라야 됩니다.
	Phone(String pColor) {
		model = "애니콜";
		price = 100000;
		color = pColor;
	}
	
	
	Phone(int pPrice, String pColor) {
		model = "가로본능";
		price = pPrice;
		color = pColor;
	}
	
	Phone(String pModel, String pColor) {
		model = pModel;
		color = pColor;
		price = 1000000;
	}

	Phone(String pModel, String pColor, int pPrice) {
		model = pModel;
		color = pColor;
		price = pPrice;
	}
	
	//메서드
	void info() {
		System.out.println("----폰의 정보----");
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price );
		System.out.println("색상 : " + color);
	}
	
	
	
	
}
