package quiz12;

public abstract class Shape { //모양
	

	
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	public Shape() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//도형의 넓이를 구하는 메서드
	public abstract double getArea();

	//
	public String getName() {
		return "도형이름:" + name;
	}
	
}
