package inherit.good;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "임재범";
		t.age = 40;
		System.out.println(t.info());
		
		
		
		
	}
}
