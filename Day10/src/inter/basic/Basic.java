package inter.basic;

public class Basic implements Inter1, Inter2 {

	/*
	 * 인터페이스를 상속(구현) 하려면 implements 키워드를 사용합니다.
	 * 인터페이스는 여러 인터페이스를 구현 할 수 있습니다. 
	 */
	
	@Override
	public void method1() {
		System.out.println("inter1의 재정의 된 메서드 실행");
	}
	
	public void method2() {
		System.out.println("inter2의 재정의 된 메서드 실행");
	}
	
	public void method3() {
		System.out.println("Basic클래스 메서드 실행");
	}
	
}
