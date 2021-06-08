package quiz13;

public class Tank extends Unit{

	public static int T_attack = 14;
	
	public Tank() {
		super(0, 0, 200);

	}

	@Override
	public void hold() {
		System.out.println("현재위치>" + x + "," + y);
		stop();
		
	}

	int distance;
	@Override
	public void move(int x, int y) {
		distance = (int) Math.sqrt(Math.pow(x-this.x , 2) + (int)(Math.pow(y-this.y, 2)));
		System.out.println("x축으로" + x + "\ty축으로" + y + "\t이동거리>" + distance);
		this.x = x;
		this.y = y;
		
	}
}
