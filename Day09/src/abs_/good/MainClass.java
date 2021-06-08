package abs_.good;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 1. 추상메서드를 사용하면 오버라이딩이 강제화 되기 때문에 
		 * 프로그래머의 (오버라이딩) 실수를 줄일 수 있습니다.
		 */
		//서울지점
		ParentStore s1 = new Store1();
		System.out.println(s1.getStoreName());
		s1.apple();
		s1.grape();
		s1.orange();
		s1.mango();
		
		System.out.println("-------------------------------");
		//부산지점
		Store2 s2 = new Store2();
		System.out.println(s2.getStoreName());
		s2.apple();
		s2.grape();
		s2.orange();
		s2.mango();
	}
}
