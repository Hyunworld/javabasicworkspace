package overriding.basic;

public class Child extends Parent {
	//메서드 오버라이딩 - 부모한테 물려받은 메서드를 내용물을 바꿔서 사용하는 것
	//방법 - 동일한 형태로 만들어 줍니다.
	int method2() {
		System.out.println("자식의 오버라이딩된 2번 메서드 실행");
		return 1;
	}
	
	void method3(){
		System.out.println("자식의 3번 메서드 실행");
	}
}
