
public class PenMain {
	public static void main(String[] args) {
		
		//Pen의 기능, 속성을 사용하려면 설계용 클래스를 생성해야합니다.
		Pen black = new Pen();
		black.ink = "검정색";
		black.price = 1000;
		black.company = "모나미";
	
		black.write();
		black.info();
		
		Pen red = new Pen();
		red.ink = "빨강색";
		red.price = 2000;
		red.company = "하이테크";
		
		red.info();
		
		//계산기 생성.
		Calculator cal = new Calculator();
		System.out.println(cal.add(black.price));
		System.out.println(cal.add(red.price));
		
	}
}
