package static_.basic;

public class Calculator {
	/*
	 * 계산기 마다 색깔이나 결과값은 다르기 때문에 일반 멤버변수가 됩니다.
	 * 반면에
	 * 계산기 마다 원주율은 동일하기 때문에 static으로 선언하는게 좋습니다.
	 */
	
	
	private int result;
	private String color;
	
	public static double pi = 3.14;
	
	/*
	 * 이랍ㄴ 멤버변수를 참조하고 있는 메서드는 static으로 선언하면 안됩니다.
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	//result에 누적하는 add()
	public void add(int a) {
		result += a;
	}
	/*
	 * 메서드 내부에서 일반멤버변수를 쓰지 않고,
	 * 범용성 있게 사용하는 메서드는 static키워드를 쓰는편이 좋습니다.
	 */
	public double areaCircle(int r) {
		return pi * r * r; 
	}
	
	public double areaRect(int side) {
		return side * side;
	}
	
	public double Result() {
		return result;
	}
	
	
	
	
}
