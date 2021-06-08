package quiz12;

public class MainClass {
	public static void main(String[] args) {

		Shape s1 = new Circle("원", 2);
		System.out.println(s1.getName());
		System.out.println(s1.getArea());

		Shape s2 = new Rect("사각", 4);
		System.out.println(s2.getName());
		System.out.println(s2.getArea());
}
}