package generic.good;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 제네릭을 사용하면, 객체를 생성할 때 사용할 타입을 지정할 수 있고,
		 * 다양한 값을 저장하도록 생성해서 사용이 가능합니다.
		 */
		ABC<String> abc = new ABC<String>();
		abc.set("홍길동"); //저장
		String name = abc.getT(); //사용
		
		
		ABC<DEF> abc2 = new ABC<DEF>(); //생성자의 타입을 생략이 가능
		
		abc2.set(new DEF()); //저장
		DEF def = abc2.getT(); //사용
		
//		ABC<int> abc3 = new ABC<>(); //제네릭은 기본형이 저장될 수 없다.
		
		
		
		
	}
}
