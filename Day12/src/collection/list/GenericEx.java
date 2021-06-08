package collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
	public static void main(String[] args) {
		/*
		 * 리스트를 매개변수나, 반환타입으로 사용할 때 쓸 수 있는 문법
		 * List<?> - 무엇이든 다 들어 갈 수 있음
		 * List<? extends String> - String을 포함한 자식클래스는 전달가능 
		 * List<? super Integer> - Integer의 형태를 가질 수 있다면 전달가능
 		 */
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		test01(list);
		test01(list2);
		test01(list3);
		
		test02(list);
//		test02(list2); x Integer은 String의 자식이 될수 없음 
//		test02(list3); x Object 는 String의 부모님
		
//		test03(list); x String은 Integer이 될 수 없음
		test03(list2);
		test03(list3);
		
		
		

		
	}
	public static void test01(List<?> list) {
	}
	
	public static void test02(List<? extends String> list) {
		
	}
	
	public static void test03(List<? super Integer> list) {
		
	}





















	//리스트를 전달받는 메서드(함수)
	public static void add(List<String> list) {
		
	}
	//리스트를 반환받는 메서드
	public static List<String> add2() {
		return null;
	}
	
	
	
	
}	