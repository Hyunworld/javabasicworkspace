package api.lang;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * Object클래스의 기능
		 * equals - 객체의 주소값이 같다면 true
		 * toString- 주소값을 문자열로 반환
		 * finalize- 객체가 소멸 될 때 호출(그 시점은 알수가 없음)
		 */
		
		Person hong = new Person("홍길동");
		System.out.println(hong.equals(hong));
		
		Person kim = new Person("홍길동");
		System.out.println(kim.equals(hong));
		
		System.out.println(kim.toString());
		
		//finallize는 gc가 호출되는 순서를 보장하기 않기 때문에 권장되지 않습니다.
		hong = null;
		System.gc();
	
		//
	try {
		Person p = (Person)kim.clone();
		System.out.println("kim으로부터 복사된 개체:" + p.getName());
		
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
}
}	
