package inter.basic2;

public class Goldfish extends Fish implements Ipet{

	@Override
	public void swim() {
		System.out.println("금붕어는 연못에서 헤엄쳐요");
		
	}
	
	public void play() {
		System.out.println("금붕어는 어항에서 놀아요");
	}

	
}
