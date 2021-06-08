package static_.method;

public class Count {

	public int a ;
	public static int b; //정적멤버변수
	
	//일반메서드 - 일반멤버변수, 정적 멤버변수도 무도 사용이 가능합니다.
	public int method1() {
		a = 10;
		return b++;
	}
		//정적메서드 - static이 붙이 변수나 메서드만 사용이 가능.
		public static int method2() {
//			a=10;
			
			//단 - 객체 생성을 통해서는 일반 멤버변수로도 사용이 가능.
			Count c = new Count();
			c.a = 10;
			return ++b;
	
	}
}
