package quiz10;

public class Wizard extends Player{
	
	Wizard(String id) {
		 this.id = id;
		 this.hp = 500;
		 this.mp = 1000;
		 this.attack = 20;
		 this.armor = 5;
	}
	
	void arrow() {
		
	}
	 
	//2. 블리자드 스킬은 매개변수로 플레이어 배열을 받습니다.
	 /*
	  *매개변수 players배열을 향상된 for문으로 회전
	  *for문 안에서는 10~15사이의 랜덤수를 발생
	  *players배열의 hp를 각각 랜덤수 만큼 감소시킵니다. 
	  *players배열의 이름과 함꼐 램덤 피해를 각각 출력하면 됩니다.
	 */
	

	
	//4. players배열의 이름과 함께 램덤 피해를 각각 출력하세요
	void blizzard(Player[] players) {
		System.out.println("-----------------------");
		System.out.println(this.id + "님의 눈보라 시전" );
		for(Player p :players) {
			int a = (int)(Math.random() * 6) + 10;
			System.out.println(p.id + "님이" + a + "피해를 입었습니다.");
			p.hp -= a;
		}
	}
	

}
