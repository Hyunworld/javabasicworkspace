package quiz10;

public class MainClass {

	public static void main(String[] args) {
		

		Warrior me = new Warrior("상전사");
		
		Wizard play2 = new Wizard("엘사");
		Warrior play3 = new Warrior("타락전사파워");
		
		System.out.println("-----나의 캐릭 배쉬스킬 사용----------");
		me.bash(play2);
		me.bash(play3);
		me.bash(play2);
		me.bash(play3);
		me.bash(play3);
		me.bash(play2);
		System.out.println("------------공격종료---------");
		
		play2.info();
		play3.info();
		
		Player[] arr = {play2, play3};
		
		Wizard me2 = new Wizard("상법사");
		me2.blizzard(arr); 
		me2.blizzard(arr); 

		play2.info();
		play3.info();
		
		
		
	}
}
