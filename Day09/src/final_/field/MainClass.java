package final_.field;

public class MainClass {
	public static void main(String[] args) {
		Person p1 = new Person("123123", "김시민");
//		p1.nation = "미국";
//		p1.ssn = "kim시민";
		Person p2 = new Person("123", "권율");
		
		System.out.println("국적 :" + p1.nation);
		
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
		
//		final int a = 1; 쓸수는있지만 굳이 쓰지않음;
	}
}
