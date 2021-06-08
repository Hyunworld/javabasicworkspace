package encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		
		me.setYear(2012);
		System.out.println(me.getYear());
		me.setDay(22);
		System.out.println(me.getDay());
		me.setSsn("12312345");
		System.out.println(me.getSsn());
		
	}
}
