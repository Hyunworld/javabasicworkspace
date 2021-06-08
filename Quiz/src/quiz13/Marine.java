package quiz13;

public class Marine extends Unit{

	//마린의 공격력이 업그레이드 되면객체마다 동일한 값을 갖습니다.
	public static int M_attack = 6;
	
	public Marine() {
		super(0, 0, 50);

	}
	//hold()의 기능
	//마린의 현재위치를 출력, stop 메서드를 호출
	@Override
	public void hold() {
		System.out.println("현재위치>" + x + "," + y);
		stop();
		
	}
	/*
	 * move()의 기능
	 * 1. 현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구합니다.
	 * 	루트값 - Math.sqrt(값)
	 * 2. 현재좌표값을 매개변수의 좌표값으로 변경,
	 * 3. 이동한 거리를 정수형으로 출력.
	 */
	int distance;
	@Override
	public void move(int x, int y) {
		distance = (int) Math.sqrt(Math.pow(x-this.x , 2) + (int)(Math.pow(y-this.y, 2)));
		System.out.println("x축으로" + x + "\ty축으로" + y + "\t이동거리>" + distance);
		this.x = x;
		this.y = y;
	}
	
}
