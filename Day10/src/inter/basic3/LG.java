package inter.basic3;

public class LG implements Printed{

	private String logo = "Life is good";
	@Override
	public void turnOn() {
		System.out.println(logo);
		System.out.println("전원을 킵니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println(logo);
		System.out.println("전원을 끕니다");
		
	}

	@Override
	public void print(String document) {
		System.out.println(logo);
		System.out.println("내용 : " + document);
		
	}

	@Override
	public void colorPrint(String doucument, String color) {
		System.out.println(logo);
		System.out.println("내용:" + doucument + "색상" + color);
		
	}

	@Override
	public void copy(int a) {
		System.out.println("복사" + a + "장");
		
	}

}
