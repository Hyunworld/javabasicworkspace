package quiz13;

public abstract class Unit {

		public int x;//좌표값
		public int y;
		public int hp;
		
		public Unit(int x, int y, int hp) {
			this.x = x;
			this.y = y;
			this.hp = hp;
		}
		
		public Unit() {
			
		}
		
		//움직이능 기능
		public abstract void hold();//위치 정보를 확인 
		public abstract void move(int x, int y);
		
		public void stop() {
			System.out.println("stop!");
		}
		
		
		
}
