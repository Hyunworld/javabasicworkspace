package inter.basic2;

public class Cat extends Animal implements Ipet {

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요");
	}
	
	public void play() {
		System.out.println("고양이는 방에서 놀아요");
	}
	
}
