package quiz03;

public class MainClass {
	public static void main(String[] args) {
		
		Warrior w = new Warrior();
		w.id = "타락전사파워";
		w.hp = 2000;
		w.mp = 500;
		w.attack = 1000;
		w.armor = 100;
		
		w.info();
		w.bash();
		System.out.println("======================");
		
		Wizard wi = new Wizard();
		wi.id = "지존썬콜";
		wi.hp = 500;
		wi.mp = 2000;
		wi.attack = 50;
		wi.armor = 20;
		
		wi.info();
		wi.iceArrow();
	
	}
	//Player클래스 부모클래스로 생성(공통 기능을 갖도록 처리)
	//마법사, 전사는 Player를 상속받고
	//각각의 생성자도 만들어 주세요.
	//마법사와 전사의 객체 생성.
	
	
	
	
	
	
}
