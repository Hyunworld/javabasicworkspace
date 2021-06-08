package inter.basic;

public class MainClass {
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method1(); //override
		b.method2(); //override
		b.method3();
		
		System.out.println(b.PI);
		System.out.println(b.ABC);
		
		System.out.println("--------------------------");
		/*
		 * 인터페이스도 하나의 타입이 될 수 있습니다.
		 * 인터페이스에 객체를 저장했을 때, 다형성의 형태로 동일하게 실행
		 */
		Inter1 i1 = b; //Inter1 i1 = new Basic();
		i1.method1();
		System.out.println(i1.PI);
//		i1.method2();
//		i1.method3();
		
		Inter2 i2 = b;
//		i2.method1();
		i2.method2();
//		i2.method3();
		
		System.out.println("-------------------------");
		
		//인터페이스에서도 클래스 캐스팅을 사용 할 수 있습니다.
		Basic bb = (Basic)i1;
		
		CharSequence c = "sdf";
		
		
		
		
		
	}
}
