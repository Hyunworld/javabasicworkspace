package quiz02;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "이상현";
		p1.age = 23;
		p1.tall = 173;
		p1.info();
		
		
		Person p2 = new Person("이수현",25,158);
		p2.info();
		
	}
}
