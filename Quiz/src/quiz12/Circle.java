package quiz12;

public class Circle extends Shape{
	/*
	 * 1. 원형은 생성될 때 이름과, 변의길이를 받도록 처리
	 * 2.getArea()는 원의 넓이를 구하도록 오버라이딩
	 * 3.main에서 생성해서 도형이름을 확인
	 * 4. PI는 상수형태로 선언하세요 
	 */
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	private int radius;
	public final double PI = 3.14;
	
	public double getArea() {
		return radius * radius * PI;
	}
	
	public String getName() {
		return "오버라이딩된-" + super.getName();
	}


}
