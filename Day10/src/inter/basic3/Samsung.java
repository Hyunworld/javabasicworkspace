package inter.basic3;

public class Samsung implements Printed {

	private String logo = "From is Samsung";
	@Override
	public void turnOn() {
		System.out.println(logo);
		System.out.println("전원을 켭니다");
		
		
	}

	@Override
	public void turnOff() {
		System.out.println(logo);
		System.out.println("끄다");
		
	}

	@Override
	public void print(String document) {
		System.out.println(document);
		
	}

	@Override
	public void colorPrint(String doucument, String color) {
		System.out.println(doucument);
		System.out.println("지정색" + color);
		
	}

	@Override
	public void copy(int a) {
		System.out.println(a + "장 복사");
		
	}

}
