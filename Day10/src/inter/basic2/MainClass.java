package inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		//1. Animal[]을 생성하고 저장하고, 향상된 포문으로 동물의 기능을 출력
		
		Animal[] arr = new Animal[3];
		arr[0] = dog;
		arr[1] = cat;
		arr[2] = tiger;
		
		for(Animal i : arr ) {
			i.eat();
		}
		
		//2. Ipet[] 생성 후  (강아지, 고양이, 금붕어)를 저장합니다. 향상된 포문으로 팻의 기능을 출력
		//Ipet과 Animal은 서로 타입은 다른데, 자식 클래스가 상호연관을 가지면 형변환이 됩니다.
		
		Ipet[] arr2 = new Ipet[3];
		arr2[0] = (Ipet) dog;
		arr2[1] = (Ipet) cat;
		arr2[2] =  new Goldfish();
		
		
		for(Ipet i : arr2) {
			i.play();
		}
		
		System.out.println("----------------------");
		PetShop a = new PetShop();
		a.petInfo(arr2);
		
		
		
	}
	
}
