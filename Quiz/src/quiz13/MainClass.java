package quiz13;

public class MainClass {
	public static void main(String[] args) {
		Unit u1 = new Marine();
		u1.move(3, 4);
		u1.hold();
		
		Unit u2 = new Tank();
		u2.move(4, 8);
		u2.hold();
		
		
		Dropship u3 = new Dropship();
		u3.ride(u1);
		u3.ride(u2);
		u3.ride(u2);
		
	}
}
