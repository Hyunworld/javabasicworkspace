package generic.bad;

public class MainClass {
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.setObj("홍길동");

		Integer name = (Integer)abc.getObj();
		
		abc.setObj(new DEF());
		DEF def = (DEF)abc.getObj();
	}
}
