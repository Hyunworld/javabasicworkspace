package inter.basic2;

public class PetShop {
	//1. carePet() 메서드 선언
	//매게변수는 모든 팻타입을 전달 받을수 있도록 선언
	//기능-instanceof사용해서 캐스팅하고, "xxx를 돌봅니다"
	
	public void carePet(Ipet a) {
		if(a instanceof Dog) {
			System.out.println("강아지를 돌봅니다");
		} else if(a instanceof Cat) {
			System.out.println("고양이를 돌봅니다");
		} else if(a instanceof Fish) {
			System.out.println("금붕어를 봅니다");
		}
	}
	
	
	//2.petInfo() 메서드 선언
	//매개변수는 팻배열 받도록 선언
	//기능 - 모든펫의 play메서드를 실행 
	
	public void petInfo(Ipet[] a) {
		for(Ipet i : a) {
			i.play();
		}
	}
	
	
}
