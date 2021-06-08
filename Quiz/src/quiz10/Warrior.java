package quiz10;

public class Warrior extends Player {

	Warrior(String id) {
		 this.id = id;
		 this.hp = 1000;
		 this.mp = 500;
		 this.attack = 10;
		 this.armor = 10;
	}
	
	//1.bash()에 적중당한 클래스에 따라서 hp의 감소가 다르게 처리되도록 bash()를 수정해보세요
	//2.스킬을 사용할 때마다 me캐릭터의 mp를 100씩 감소 시킵니다.
	// 캐릭터의 mp가 100이하라면 스킬을 사용하지못하고 메서드를 종료 시키세요.
	void bash(Player p) {
		if (this.mp > 100) {
		if(p instanceof Warrior) {
			System.out.println(p.id + "님 배쉬 스킬 적중");
			p.hp -= 1;
			this.mp -= 100;
			
		} else if(p instanceof Wizard) {
			System.out.println(p.id + "님 배쉬 스킬 적중");
			p.hp -= 5;
			this.mp -= 100;
		}
		} else {
			System.out.println("mp가 100이하입니다. 공격못합니다.");
		}

	}

	
}
